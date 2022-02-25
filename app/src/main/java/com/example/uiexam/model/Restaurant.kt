package com.example.uiexam.model

data class Restaurant(
    val image: String,
    val name: String,
    val location: String,
    val rating: Float,
    var isFavourite: Boolean
)
