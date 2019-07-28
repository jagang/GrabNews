package com.jagan.grabnews.api

import androidx.lifecycle.LiveData
import com.jagan.grabnews.model.News
import retrofit2.http.GET

/**
 * REST API access points
 */
interface NewsService {

//    https://newsapi.org/v2/top-headlines?country=us&apiKey=53aa508a0e654ee78b5edf6da8d29816
    @GET("/v2/top-headlines?country=us&apiKey=53aa508a0e654ee78b5edf6da8d29816")
    fun getTopHeadlines(): LiveData<ApiResponse<News>>

}
