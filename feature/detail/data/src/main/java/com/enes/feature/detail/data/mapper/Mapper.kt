package com.enes.feature.detail.data.mapper

import com.enes.feature.detail.data.model.GetCharacterDetailResponseModel
import com.enes.feature.detail.domain.entity.GetCharacterDetailResponseModelEntity

fun GetCharacterDetailResponseModel.getCharacterDetailToEntity() =
    GetCharacterDetailResponseModelEntity(
        actor = this.actor,
        alive = this.alive,
        ancestry = this.ancestry,
        hogwartsStaff = this.hogwartsStaff,
        hogwartsStudent = this.hogwartsStudent,
        house = this.house,
        id = this.id,
        gender = this.gender,
        image = this.image,
        name = this.name,
        patronus = this.patronus
    )