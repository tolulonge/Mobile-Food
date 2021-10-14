package com.example.mobilefood.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mobilefood.R
import com.example.mobilefood.databinding.LayoutFoodItemBinding
import com.example.mobilefood.model.FoodListItem
import com.example.mobilefood.utils.load

/**
 * This is the adapter class that helps bind the data coming from data manager class into views
 * that the user can see and interact with.
 * It receives an arrayList of the foods and an implementation of the a listener to handle click
 * events
 */
class FoodListAdapter(
    private var foodListItems: ArrayList<FoodListItem>,
    private val listener: ((view: View, foodListItem: FoodListItem) -> Unit)? = null
) : RecyclerView.Adapter<FoodListAdapter.ViewHolder>() {


    class ViewHolder(private val binding: LayoutFoodItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(
            foodListItem: FoodListItem,
            listener: ((view: View, foodListItem: FoodListItem) -> Unit)?
        ) {
            binding.apply {
                txtFoodName.text = foodListItem.productName
                txtFoodImage.text = foodListItem.image
                txtFoodQuantity.text = binding.txtFoodImage.resources.getString(
                    R.string.details_quantity_left,
                    foodListItem.quantity
                )
                txtFoodNutrients.text = binding.txtFoodImage.resources.getString(
                    R.string.details_nutrients,
                    foodListItem.nutrients
                )
                txtFoodOrigin.text = binding.txtFoodImage.resources.getString(
                    R.string.details_origin,
                    foodListItem.from
                )
                txtFoodPrice.text = binding.txtFoodImage.resources.getString(
                    R.string.details_price,
                    foodListItem.price
                )
            }

            with(binding.imgCity) {
                load(foodListItem.imageUrl) {
                    listener?.let {
                        it(this, foodListItem)
                    }
                }
                transitionName = resources.getString(R.string.food_detail_transition_name)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            LayoutFoodItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentFood = foodListItems[position]
        holder.bind(currentFood, listener)

    }

    override fun getItemCount(): Int {
        return foodListItems.size
    }


}