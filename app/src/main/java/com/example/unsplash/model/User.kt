package com.example.unsplash.model

import androidx.room.Embedded

@kotlinx.serialization.Serializable
data class User(
    @Embedded
    val links: UserLinks,
    val usernmae: String)
