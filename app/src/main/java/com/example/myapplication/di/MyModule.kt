package com.example.myapplication.di

import com.example.myapplication.MainSearchRecyclerViewAdapter
import com.example.myapplication.model.DataModelImpl
import com.example.myapplication.viewmodel.MainViewModel
import org.koin.dsl.module.module
import org.koin.androidx.viewmodel.ext.koin.viewModel
import com.example.myapplication.model.DataModel
import com.example.myapplication.model.service.KakaoSearchService
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

//의존성 주입
var retrofitPart = module{
    single<KakaoSearchService> {
        Retrofit.Builder()
            .baseUrl("https://dapi.kakao.com")
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(KakaoSearchService::class.java)
    }
}

var adapterPart = module {
    factory {
        MainSearchRecyclerViewAdapter()
    }
}

var modelPart = module {
    factory <DataModel> {
        DataModelImpl(get())
    }
}

var viewModelPart = module {
    viewModel{
        MainViewModel(get())
    }
}

var myDiModule = listOf(
    retrofitPart,
    adapterPart,
    modelPart,
    viewModelPart
)
