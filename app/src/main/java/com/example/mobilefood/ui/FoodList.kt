package com.example.mobilefood.ui

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.fragment.FragmentNavigator
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import com.example.mobilefood.R
import com.example.mobilefood.databinding.FragmentListFoodBinding
import com.example.mobilefood.model.DataManager
import com.example.mobilefood.model.FoodListItem
import com.google.android.material.transition.MaterialContainerTransform
import com.google.android.material.transition.MaterialElevationScale


class FoodList : Fragment() {

    private var _binding: FragmentListFoodBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentListFoodBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val foodListAdapter = createAdapter(DataManager.listOfFoods)
        setupRecyclerView(foodListAdapter)

        sharedElementEnterTransition = MaterialContainerTransform().apply {
            // The drawing view is the id of the view above which the container transform
            // will play in z-space.
            drawingViewId = R.id.nav_host_fragment_container
            duration = resources.getInteger(R.integer.reply_motion_duration_large).toLong()
            // Set the color of the scrim to transparent as we also want to animate the
            // list fragment out of view
            scrimColor = Color.TRANSPARENT
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    private fun createAdapter(foodList: ArrayList<FoodListItem>): FoodListAdapter {
        return FoodListAdapter(foodList) { view, foodListItem ->
            val toFoodDetails =
                FoodListDirections.actionFoodListToFoodDetails(foodListItem)

            exitTransition = MaterialElevationScale(false).apply {
                duration = resources.getInteger(
                    R.integer.reply_motion_duration_large
                ).toLong()
            }

            reenterTransition = MaterialElevationScale(true).apply {
                duration = resources.getInteger(
                    R.integer.reply_motion_duration_large
                ).toLong()
            }

            val cityDetailTransitionName = getString(
                R.string.food_detail_transition_name
            )

            val extraInfoForSharedElement = FragmentNavigatorExtras(
                view to cityDetailTransitionName
            )

            navigate(toFoodDetails, extraInfoForSharedElement)
        }
    }

    private fun setupRecyclerView(foodListAdapter: FoodListAdapter) {
        binding.recyclerView.run {
            adapter = foodListAdapter
        }
    }

    private fun navigate(destination: NavDirections, extraInfo: FragmentNavigator.Extras) =
        with(findNavController()) {
            currentDestination?.getAction(destination.actionId)
                ?.let { navigate(destination, extraInfo) }
        }
}