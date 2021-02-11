package com.example.fetchinggithubapi.api

import android.content.Context
import android.util.Log
import android.widget.Toast
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
//import java.text.SimpleDateFormat
//import java.util.*

class GithubApiDataFetcher(val view: com.example.fetchinggithubapi.views.adapter.SearchView, val context: Context) {

    var disposable: Disposable? = null
    val githubApiService by lazy {
        GithubApiService.create()
    }

    fun requestData(user: String) {
        disposable = githubApiService.getEndPoint(user.trim())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                view.showUserList(it.items)
            }, {
                it.message?.let { it1 -> Log.d("errornya : ", it1) }
                Toast.makeText(
                    context,
                    "User tidak ditemukan atau tidak tersambung dengan internet",
                    Toast.LENGTH_SHORT
                ).show()
            })
    }
}
