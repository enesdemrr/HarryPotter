package com.enes.feature.detail.data.model

data class GetCharacterDetailResponseModel(
    val actor: String,
    val alive: Boolean,
    val ancestry: String,
    val hogwartsStaff: Boolean,
    val hogwartsStudent: Boolean,
    val house: String,
    val gender: String,
    val id: String,
    val image: String,
    val name: String,
    val patronus: String,
)
