package com.example.fetchinggithubapi.api.modelthemovie
import Results
import com.google.gson.annotations.SerializedName

data class TheMovieApiResponse(
    @SerializedName("id") val id: Int,
    @SerializedName("original_language") val original_language: String,
    @SerializedName("result") val result: List<Results>
){

}