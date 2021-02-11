package com.example.fetchinggithubapi.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.fetchinggithubapi.R
import com.example.fetchinggithubapi.databinding.ActivitySearchBinding
import com.example.fetchinggithubapi.views.fragment.SearchFragment

class SearchActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchBinding.inflate(layoutInflater)
        val view = binding.root
        val constraintLayout = binding.constraintLayout
        setContentView(view)
        loadFragment(SearchFragment())
    }

    private fun loadFragment(fragment: Fragment) {
        // load fragment
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.main_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}


