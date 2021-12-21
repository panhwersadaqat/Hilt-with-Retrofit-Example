package com.example.hiltwithretrofit.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/20/21.
 */

interface ApiService {
    @GET("/todos/{id}")
    suspend fun getSampleData(
        @Path("id") id: Int
    ): SampleDataModel
}