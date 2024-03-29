package com.udacity.shoestore.welcome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentLoginBinding
import com.udacity.shoestore.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val binding: FragmentWelcomeBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.fragment_welcome, container, false)
        binding.buttonSkip.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_welcomeFragment_to_instructionsFragment)
        }
        return binding.root
    }

}