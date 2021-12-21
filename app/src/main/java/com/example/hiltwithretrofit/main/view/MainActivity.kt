package com.example.hiltwithretrofit.main.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.hiltwithretrofit.R
import com.example.hiltwithretrofit.databinding.ActivityMainBinding
import com.example.hiltwithretrofit.main.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import android.net.NetworkInfo

import android.net.ConnectivityManager
import androidx.lifecycle.Observer
import java.lang.Exception


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        observeData()

    }

    private fun observeData(){
        mainViewModel.getSampleData().observe(this, Observer {
            binding.data = it
            binding.executePendingBindings()
        })
    }


}