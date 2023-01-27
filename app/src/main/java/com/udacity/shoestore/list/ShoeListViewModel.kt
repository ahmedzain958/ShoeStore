package com.udacity.shoestore.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.databinding.ItemShoeBinding
import com.udacity.shoestore.models.Shoe

class ShoeListViewModel : ViewModel() {


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

    fun addNewShoe(shoe: Shoe) {
        for (shoe in _shoeList.value!!){
            println("_shoeList before addNewShoe " + shoe.name + " "+ shoe.size)
        }
       for (shoe in shoeList.value!!){
            println("shoeList before addNewShoe " + shoe.name + " "+ shoe.size)
        }
        list.add(shoe)
        _shoeList.value = list
        for (shoe in _shoeList.value!!){
            println("_shoeList after addNewShoe " + shoe.name + " "+ shoe.size)
        }
        for (shoe in shoeList.value!!){
            println("shoeList after addNewShoe " + shoe.name + " "+ shoe.size)
        }
    }

}