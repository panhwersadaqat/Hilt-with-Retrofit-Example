package com.example.hiltwithretrofit.main.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hiltwithretrofit.api.SampleDataModel
import com.example.hiltwithretrofit.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by Sadaqat Panhwer
 * https://panhwersadaqat.github.io/
 * on 12/20/21.
 */
@HiltViewModel
class MainViewModel @Inject constructor(private val repository: Repository) : ViewModel() {
    private val sampleDataModel = MutableLiveData<SampleDataModel>()

    fun getSampleData() = sampleDataModel

    init {
        loadData()
    }

    private fun loadData() {
        viewModelScope.launch {
            val data = repository.getSampleData()
            sampleDataModel.postValue(data)
        }
    }
}