package com.udacity.shoestore.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoeListViewModel : ViewModel() {
    val shoeList: LiveData<List<Shoe>>
        get() = _shoeList
    private val _shoeList: MutableLiveData<List<Shoe>> = MutableLiveData()

    init {
        _shoeList.value = mutableListOf<Shoe>(
            Shoe("Shoe1", 50.0, "Nike", "Black", mutableListOf("")),
            Shoe("Shoe2", 50.0, "Nike", "Black", mutableListOf("")),
            Shoe("Shoe3", 50.0, "Nike", "Black", mutableListOf("")),
            Shoe("Shoe4", 50.0, "Nike", "Black", mutableListOf("")),
            Shoe("Shoe5", 50.0, "Nike", "Black", mutableListOf(""))
        )
    }
}