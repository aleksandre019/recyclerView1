package com.example.Home

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.HomerecyclerViewAdapter.ItemViewBinding
import com.example.recyclerview.R

class HomeRecyclerViewAdapter(private val listItem: MutableList<ContactsContract.CommonDataKinds.Email>) : RecyclerView.Adapter<HomeRecyclerViewAdapter.HomeViewHolder>() {

    inner class HomeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val binding = ItemViewBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return HomeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val item = listItem[position]
        holder.binding.emailAuthorTV.text = item.author
        holder.binding.emailSubjectTV.text = item.subject
        holder.binding.emailContentTV.text = item.content
    }

    override fun getItemCount() = listItem.size
}

