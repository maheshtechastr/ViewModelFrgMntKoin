package com.mpg.frgmntviewmodelapp.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import com.mpg.frgmntviewmodelapp.data.Repository

private const val TAG = "MainViewModel"

class MainViewModel(private val repository: Repository) : ViewModel() {
    fun printUser() {
        repository.getUserList().forEach {
            Log.i(TAG, "printUser: $it")
        }
    }
}