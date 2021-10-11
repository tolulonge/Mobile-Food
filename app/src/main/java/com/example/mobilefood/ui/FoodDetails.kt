package com.example.mobilefood.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.mobilefood.R
import com.example.mobilefood.databinding.FragmentDetailFoodBinding
import com.example.mobilefood.model.FoodListItem
import com.example.mobilefood.utils.load

class FoodDetails : Fragment() {

    private var _binding: FragmentDetailFoodBinding? = null
    private val binding get() = _binding!!
    private val args: FoodDetailsArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentDetailFoodBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val foodListItem = args.foodListItem
        updateUI(foodListItem)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    // Updates details fragment based on food item argument received
    private fun updateUI(foodListItem: FoodListItem) {
        binding.apply {
            foodImageVIew.load(foodListItem.imageUrl)
            txtFoodDetailName.text = foodListItem.productName
            txtFoodDetailOrigin.text = foodListItem.from
            txtNutrients.text = foodListItem.nutrients
            txtDescription.text = foodListItem.description
            txtQuantityLeft.text = getString(R.string.details_quantity_left, foodListItem.quantity)
        }
    }
}