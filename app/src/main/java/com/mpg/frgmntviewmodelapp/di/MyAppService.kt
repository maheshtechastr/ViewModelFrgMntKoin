package com.mpg.frgmntviewmodelapp.di

import com.mpg.frgmntviewmodelapp.data.Repository
import com.mpg.frgmntviewmodelapp.data.RepositoryImpl
import com.mpg.frgmntviewmodelapp.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val myModule = module {
    // your dependencies here
    single<Repository> { RepositoryImpl() }
    viewModelOf(::MainViewModel)
}