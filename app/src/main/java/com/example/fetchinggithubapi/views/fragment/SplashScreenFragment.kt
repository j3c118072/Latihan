package com.example.fetchinggithubapi.views.fragment

//import android.support.v7.widget.LinearLayoutManager
//import android.support.v7.widget.RecyclerView
//import android.support.v7.widget.SearchView
//import kotlinx.android.synthetic.main.activity_search.*
/*
import android.app.SearchManager;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;*/

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fetchinggithubapi.R

class SplashScreenFragment() : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val githubRepoEntity = arguments?.getParcelable<GithubRepoEntity>(REPOSITORY_KEY)
        //githubRepoEntity?.let { detailsViewModel.initData(it) }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_splash_screen, container, false)
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)
        //a_details_btn.setOnClickListener { detailsViewModel.onGoToRepositoryClicked() }
    }

}


