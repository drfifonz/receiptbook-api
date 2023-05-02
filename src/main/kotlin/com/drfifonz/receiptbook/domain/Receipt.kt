package com.drfifonz.receiptbook.domain

import java.time.Instant

data class Receipt(
        val id: String? = null,
        val ingredients: List<Ingredient>,
        val steps: List<Step>,
        val title: String,
        val tags: List<String>,
        val createdAt: Instant? = null,
        val modifiedAt: Instant? = null,

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