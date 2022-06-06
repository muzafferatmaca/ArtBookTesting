package com.muzafferatmaca.artbooktesting.api

import com.muzafferatmaca.artbooktesting.model.ImageResponse
import com.muzafferatmaca.artbooktesting.util.Util.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Muzaffer Atmaca on 6.06.2022.
 */
interface RetrofitAPI {

    @GET("/api/")
    suspend fun imageSearch(
        @Query("q") searchQuery: String,
        @Query("key") apiKey : String = API_KEY
    ) : Response<ImageResponse>

}