package com.hungergames.backend.dto

data class Vote (
    val gameId: String,
    val userId: String,
    val restaurantId: String
)