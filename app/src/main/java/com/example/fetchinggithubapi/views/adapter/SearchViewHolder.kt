package com.example.fetchinggithubapi.views.adapter

//import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fetchinggithubapi.R
import com.example.fetchinggithubapi.api.model.User
import com.squareup.picasso.Picasso

class SearchViewHolder(v: View) : RecyclerView.ViewHolder(v) {
    var ivUser: ImageView = v.findViewById(R.id.iv_user)
    var tvUser: TextView = v.findViewById(R.id.tv_user)
    fun bindItem(item: User) {
        tvUser.text = item.login
        Picasso.get().load(item.avatar_url).into(ivUser)
    }
}






