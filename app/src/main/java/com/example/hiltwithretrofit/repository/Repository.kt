package com.example.hiltwithretrofit.repository

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import com.example.hiltwithretrofit.api.ApiService

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/20/21.
 */

class Repository (private val apiService: ApiService) {
    suspend fun getSampleData() = apiService.getSampleData(1)
}