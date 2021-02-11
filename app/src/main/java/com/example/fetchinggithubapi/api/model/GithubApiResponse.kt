package com.example.fetchinggithubapi.api.model

import com.google.gson.annotations.SerializedName

data class GithubApiResponse(
    @SerializedName("total_count") val totalCount: Int,
    @SerializedName("incomplete_results") val incompleteResults: Boolean,
    @SerializedName("items") val items: List<User>,
    val result: List<Any>
) {

}