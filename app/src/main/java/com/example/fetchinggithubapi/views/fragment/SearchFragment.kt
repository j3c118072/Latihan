package com.example.fetchinggithubapi.views.fragment

//import android.support.v7.widget.LinearLayoutManager
//import android.support.v7.widget.RecyclerView
//import android.support.v7.widget.SearchView
//import kotlinx.android.synthetic.main.activity_search.*
/*
import android.app.SearchManager;
import android.widget.SearchView;
import android.widget.SearchView.OnQueryTextListener;*/

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fetchinggithubapi.R
import com.example.fetchinggithubapi.api.GithubApiDataFetcher
import com.example.fetchinggithubapi.api.model.User
import com.example.fetchinggithubapi.views.DetailActivity
import com.example.fetchinggithubapi.views.adapter.SearchAdapter
import com.example.fetchinggithubapi.views.adapter.SearchView
import org.jetbrains.anko.support.v4.find
import org.jetbrains.anko.support.v4.startActivity
import androidx.appcompat.widget.SearchView as SearchView1

class SearchFragment() : Fragment(), SearchView {

    private var recyclerView: RecyclerView? = null
    private lateinit var adapter: SearchAdapter
    private var userList = mutableListOf<User>()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setHasOptionsMenu(true)
        recyclerView = find(R.id.rv_search)
        recyclerView?.setHasFixedSize(true)
        recyclerView?.layoutManager = LinearLayoutManager(context)

        adapter = SearchAdapter(userList) {
            startActivity<DetailActivity>(
                "avatar" to it.avatar_url, "username" to it.login,
                "githublink" to it.html_url
            )
        }
        recyclerView?.adapter = adapter


    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_search, container, false)
        return view
    }

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_search, menu)
        val searchActionMenuItem = menu?.findItem(R.id.menu_search)
        val searchView = searchActionMenuItem?.actionView as SearchView1
        searchView.queryHint = "Cari User"
        searchView.isSubmitButtonEnabled = true
        val dataFetcher = GithubApiDataFetcher(this, context!!)
        searchView.setOnQueryTextListener(object :
            androidx.appcompat.widget.SearchView.OnQueryTextListener {

            override fun onQueryTextSubmit(p0: String): Boolean {
                if (p0 != "") {
                    dataFetcher.requestData(p0)
                }
                return true
            }

            override fun onQueryTextChange(p0: String): Boolean {
                if (p0 != "") {
                    dataFetcher.requestData(p0)
                }
                return true
            }
        })


    }

    override fun showUserList(data: List<User>) {
        userList.clear()
        userList.addAll(data)
        adapter.notifyDataSetChanged()
    }
}


