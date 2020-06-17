package com.example.myapplication.model

import com.example.myapplication.model.enum.KakaoSearchSortEnum
import com.example.myapplication.model.response.ImageSearchResponse
import io.reactivex.Single

interface DataModel {
    fun getData(query:String, sort: KakaoSearchSortEnum, page:Int, size:Int): Single<ImageSearchResponse>
}