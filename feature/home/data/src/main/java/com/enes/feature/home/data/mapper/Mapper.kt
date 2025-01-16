package com.enes.feature.home.data.mapper

import com.enes.feature.home.data.model.GetAllCharacterResponseModel
import com.enes.feature.home.data.model.Wand
import com.enes.feature.home.domain.entity.GetAllCharacterResponseModelEntity
import com.enes.feature.home.domain.entity.WandEntity

fun GetAllCharacterResponseModel.getAllCharacterToEntity() = GetAllCharacterResponseModelEntity(
    actor = this.actor,
    alive = this.alive,
    alternate_actors = this.alternate_actors,
    alternate_names = this.alternate_names,
    ancestry = this.ancestry,
    dateOfBirth = this.dateOfBirth,
    eyeColour = this.eyeColour,
    gender = this.gender,
    hairColour = this.hairColour,
    hogwartsStaff = this.hogwartsStaff,
    hogwartsStudent = this.hogwartsStudent,
    house = this.house,
    id = this.id,
    image = this.image,
    name = this.name,
    patronus = this.patronus,
    species = this.species,
    wand = this.wand?.wandToEntity(),
    wizard = this.wizard,
    yearOfBirth = this.yearOfBirth
)

fun Wand.wandToEntity() = WandEntity(
    core = this.core,
    length = this.length,
    wood = this.wood
)
