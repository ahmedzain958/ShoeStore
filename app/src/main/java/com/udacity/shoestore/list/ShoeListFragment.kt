package com.udacity.shoestore.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeListBinding

/**
 * A fragment representing a list of Items.
 */
class ShoeListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val binding:  FragmentShoeListBinding=
            DataBindingUtil.inflate(layoutInflater, R.layout.fragment_shoe_list, container, false)


        return binding.root
    }
}