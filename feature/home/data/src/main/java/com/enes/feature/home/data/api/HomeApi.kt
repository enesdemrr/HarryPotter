package com.enes.feature.home.data.api

import com.enes.feature.home.data.model.GetAllCharacterResponseModel
import retrofit2.Response
import retrofit2.http.GET

interface HomeApi {
    @GET("characters")
    suspend fun getAllCharacters(): Response<List<GetAllCharacterResponseModel>>
}