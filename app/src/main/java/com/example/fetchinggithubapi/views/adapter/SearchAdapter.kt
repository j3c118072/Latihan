@file:Suppress("ConstantConditionIf")

package com.example.fetchinggithubapi.views.adapter

//import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fetchinggithubapi.R
import com.example.fetchinggithubapi.api.model.User


class SearchAdapter(
    private var items: List<User>,
    private val listener: (User) -> Unit
) :
    RecyclerView.Adapter<SearchViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        //Log.e()

        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_search, parent, false)
        return SearchViewHolder(view)

    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        val item = items[position]
        holder.bindItem(items[position])
        holder.itemView.setOnClickListener {
            if (true) {
                listener(item)
            }
        }
    }
}