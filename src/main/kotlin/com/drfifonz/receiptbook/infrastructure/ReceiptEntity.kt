package com.drfifonz.receiptbook.infrastructure

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant

@Document
data class ReceiptEntity(
        @Id
        val id: ObjectId = ObjectId(),
        val ingredients: List<Ingredient>,
        val steps: List<Step>,
        val title: String,
        val tags: List<String>,
        val createdAt: Instant,
        val modifiedAt: Instant? = null
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