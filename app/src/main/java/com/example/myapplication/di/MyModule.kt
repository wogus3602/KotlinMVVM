package com.example.myapplication.di

import com.example.myapplication.viewmodel.MainViewModel
import org.koin.dsl.module.module
import com.example.myapplication.viewmodel.MainViewModel.DataModelImpl
import org.koin.androidx.viewmodel.ext.koin.viewModel

//의존성 주입

var modelPart = module {
    factory <MainViewModel.DataModel> {
        DataModelImpl()
    }
}

var viewModelPart = module {
    viewModel{
        MainViewModel(get())
    }
}

var myDiModule = listOf(
    modelPart,
    viewModelPart
)
