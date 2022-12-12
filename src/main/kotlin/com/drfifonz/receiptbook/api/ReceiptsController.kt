package com.drfifonz.receiptbook.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/receipts"])
class ReceiptsController {

    @GetMapping("/{id}")
    fun getReceipt(@PathVariable id: String): String {
        return "Hello world $id!"
    }

    @GetMapping
    fun getReceipts(): String {
        return "Hello world!"
    }

    @PostMapping("/create")
    fun createReceipt(): String {
        return "Receipt created!"
    }

}
