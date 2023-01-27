package com.udacity.shoestore.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.databinding.ItemShoeBinding
import com.udacity.shoestore.models.Shoe

class ShoeListViewModel : ViewModel() {


    val shoeItem: LiveData<Shoe> = MutableLiveData<Shoe>()
    val shoeList: LiveData<MutableList<Shoe>>
        get() = _shoeList
    private val _shoeList= MutableLiveData<MutableList<Shoe>>()
    private var list: MutableList<Shoe> = mutableListOf<Shoe>(
        Shoe("Shoe1", 50.0, "Nike", "Black", mutableListOf("")),
        Shoe("Shoe2", 50.0, "Nike", "Black", mutableListOf("")),
        Shoe("Shoe3", 50.0, "Nike", "Black", mutableListOf("")),
        Shoe("Shoe4", 50.0, "Nike", "Black", mutableListOf("")),
        Shoe("Shoe5", 50.0, "Nike", "Black", mutableListOf(""))
    )

    init {
        _shoeList.value = list
    }

    fun addNewShoe() {
        shoeItem.value?.let {
            list.add(it)
            _shoeList.value = list
        }

    }

}