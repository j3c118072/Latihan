package com.example.fetchinggithubapi.views.adapter

import Results
import com.example.fetchinggithubapi.api.model.User
//import androidx.appcompat.widget.SearchView;
//import android.app.SearchManager;
//import android.widget.SearchView;
//import android.widget.SearchView.OnQueryTextListener;


interface SearchView {
    fun showUserList(data: List<User>)
    fun showResultList(result: List<Results>) {
    }
}