package com.udacity.shoestore.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeListBinding
import com.udacity.shoestore.databinding.ItemShoeBinding


/**
 * A fragment representing a list of Items.
 */
class ShoeListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val binding: FragmentShoeListBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.fragment_shoe_list, container, false)
        val viewModel = ViewModelProvider(this)[ShoeListViewModel::class.java]
        viewModel.shoeList.observe(viewLifecycleOwner) {
            val itemsBaseLinearLayout: LinearLayout = binding.linear
            itemsBaseLinearLayout.removeAllViews()
            for (shoe in it){
                val linearShoeItem = ItemShoeBinding.inflate(layoutInflater, itemsBaseLinearLayout, false)
                linearShoeItem.shoe = shoe
                itemsBaseLinearLayout.addView(linearShoeItem.linearShoeItem)
            }

        }
        return binding.root
    }
}