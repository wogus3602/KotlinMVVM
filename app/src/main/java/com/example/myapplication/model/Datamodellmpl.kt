package com.example.myapplication.model

import com.example.myapplication.model.enum.KakaoSearchSortEnum
import com.example.myapplication.model.response.ImageSearchResponse
import com.example.myapplication.model.service.KakaoSearchService
import io.reactivex.Single


class DataModelImpl(private val service: KakaoSearchService):DataModel{

    private val KAKAO_APP_KEY = "KEY"

    override fun getData(query:String, sort: KakaoSearchSortEnum, page:Int, size:Int): Single<ImageSearchResponse> {
        return service.searchImage(auth = "KakaoAK $KAKAO_APP_KEY", query = query, sort = sort.sort, page = page, size = size)
    }
}