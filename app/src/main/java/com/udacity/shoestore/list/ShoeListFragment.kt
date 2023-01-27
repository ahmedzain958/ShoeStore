package com.udacity.shoestore.list

import android.os.Bundle
import android.view.*
import android.widget.LinearLayout
import androidx.core.view.MenuProvider
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeListBinding
import com.udacity.shoestore.databinding.ItemShoeBinding


/**
 * A fragment representing a list of Items.
 */
class ShoeListFragment : Fragment() {
    private val sharedViewModel: ShoeListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val binding: FragmentShoeListBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.fragment_shoe_list, container, false)

        sharedViewModel.shoeList.observe(viewLifecycleOwner) {
            val itemsBaseLinearLayout: LinearLayout = binding.linear
            itemsBaseLinearLayout.removeAllViews()
            for (shoe in it){
                val linearShoeItem = ItemShoeBinding.inflate(layoutInflater, itemsBaseLinearLayout, false)
                linearShoeItem.shoe = shoe
                itemsBaseLinearLayout.addView(linearShoeItem.linearShoeItem)
                println("observe " + shoe.name + " "+ shoe.size)
            }

        }
        binding.fab.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_shoeListFragment_to_detailsFragment)
        }
        binding.lifecycleOwner = this
        setHasOptionsMenu(true)
        return binding.root
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.overflow_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        findNavController().navigate(R.id.action_shoeListFragment_to_loginFragment)

        return NavigationUI.onNavDestinationSelected(
            item,
            findNavController()
        ) || super.onOptionsItemSelected(item)
    }
}