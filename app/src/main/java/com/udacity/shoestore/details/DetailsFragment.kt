package com.udacity.shoestore.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentDetailsBinding
import com.udacity.shoestore.list.ShoeListViewModel
import com.udacity.shoestore.models.Shoe


/**
 * A simple [Fragment] subclass.
 * Use the [DetailsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailsFragment : Fragment() {
    private val sharedViewModel: ShoeListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val binding: FragmentDetailsBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_details, container, false)
        binding.viewmodel = sharedViewModel
        binding.lifecycleOwner = this
       /* binding.buttonSave.setOnClickListener {
            val shoeName = binding.editTextShoeName.text.toString()
            val shoeSize = binding.editTextShoeSize.text.toString().toDouble()
            val company = binding.editTextShoeCompany.text.toString()
            val description = binding.editTextShoeDescription.text.toString()
            val shoe = Shoe(shoeName, shoeSize, company, description)
            sharedViewModel.addNewShoe()
        }*/
//        binding.lifecycleOwner = this
        return binding.root
    }

}