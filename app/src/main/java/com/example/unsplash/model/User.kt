package com.example.unsplash.model

import androidx.room.Embedded
import kotlinx.serialization.Serializable

@Serializable
data class User(
    @Embedded
    val links: UserLinks,
    val usernmae: String)
