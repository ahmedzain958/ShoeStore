package com.udacity.shoestore.instructions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentInstrBinding
import com.udacity.shoestore.databinding.FragmentLoginBinding


class InstructionsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentInstrBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.fragment_instr, container, false)
        binding.buttonShoeList.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_instructionsFragment_to_shoeListFragment)
        }
        return binding.root
    }
}