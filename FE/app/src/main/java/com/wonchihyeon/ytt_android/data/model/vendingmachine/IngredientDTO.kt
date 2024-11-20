package com.wonchihyeon.ytt_android.data.model.vendingmachine

data class IngredientDTO(
    val id: Long,
    val name: String,
    val efficacy: String,
    val quantity: Int,
    val unit: String,
    val pharmacopeia: String
)