package com.example.fetchinggithubapi.api

import com.example.fetchinggithubapi.BuildConfig
import com.example.fetchinggithubapi.api.model.GithubApiResponse
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubApiService {
    @GET("users")
    fun getEndPoint(@Query("q") q: String): Observable<GithubApiResponse>

    companion object {
        fun create(): GithubApiService {
            val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BuildConfig.BASE_URL_GITHUB)
                .build()
            return retrofit.create(GithubApiService::class.java)
        }
    }

}


