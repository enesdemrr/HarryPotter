package com.enes.feature.detail.domain.entity

data class GetCharacterDetailResponseModelEntity(
    val actor: String,
    val alive: Boolean,
    val ancestry: String,
    val hogwartsStaff: Boolean,
    val hogwartsStudent: Boolean,
    val house: String,
    val id: String,
    val gender: String,
    val image: String,
    val name: String,
    val patronus: String,
)