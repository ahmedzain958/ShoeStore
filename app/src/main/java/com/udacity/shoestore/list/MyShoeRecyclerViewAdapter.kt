//package com.udacity.shoestore.list
//
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.udacity.shoestore.databinding.FragmentShoeListBinding
//import com.udacity.shoestore.list.placeholder.PlaceholderContent.PlaceholderItem
//
///**
// * [RecyclerView.Adapter] that can display a [PlaceholderItem].
// * TODO: Replace the implementation with code for your data type.
// */
//class MyShoeRecyclerViewAdapter(
//    private val values: List<PlaceholderItem>,
//) : RecyclerView.Adapter<MyShoeRecyclerViewAdapter.ViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//
//        return ViewHolder(
//            FragmentShoeListBinding.inflate(
//                LayoutInflater.from(parent.context),
//                parent,
//                false
//            )
//        )
//
//    }
//
//    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val item = values[position]
//        holder.idView.text = item.id
//        holder.contentView.text = item.content
//    }
//
//    override fun getItemCount(): Int = values.size
//
//    inner class ViewHolder(binding: FragmentShoeListBinding) :
//        RecyclerView.ViewHolder(binding.root) {
//        val idView: TextView = binding.itemNumber
//        val contentView: TextView = binding.content
//
//        override fun toString(): String {
//            return super.toString() + " '" + contentView.text + "'"
//        }
//    }
//
//}