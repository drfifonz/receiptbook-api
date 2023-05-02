package com.drfifonz.receiptbook.api



data class NewReceipt(
        val title:String,
        val ingredients: List<Ingredient>,
        val steps: List<Step>,
        val tags: List<String>,
)

data class Step(
        val text: String,
        val done: Boolean,
)

data class Ingredient(
        val name: String,
        val amount: Number,
        val unit: String,
)