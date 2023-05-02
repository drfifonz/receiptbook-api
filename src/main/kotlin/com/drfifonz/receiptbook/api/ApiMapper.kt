package com.drfifonz.receiptbook.api

import com.drfifonz.receiptbook.domain.Ingredient
import com.drfifonz.receiptbook.domain.Receipt
import com.drfifonz.receiptbook.domain.Step

object ApiMapper {
    fun mapToDomain(receipt:NewReceipt): Receipt{
        return Receipt(
                ingredients = receipt.ingredients.map { Ingredient(name = it.name, amount = it.amount, unit = it.unit) },
                steps =  receipt.steps.map { Step(text = it.text, done = it.done) },
                title = receipt.title,
                tags = receipt.tags,
        )
    }
}