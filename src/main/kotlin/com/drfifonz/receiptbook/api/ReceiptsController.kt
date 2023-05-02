package com.drfifonz.receiptbook.api

import com.drfifonz.receiptbook.domain.Receipt
import com.drfifonz.receiptbook.domain.ReceiptService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/receipts"])
class ReceiptsController(
       val receiptService: ReceiptService
) {

    @GetMapping("/{id}")
    fun getReceipt(@PathVariable id: String): String {
        return "Hello world $id!"
    }

    @GetMapping
    fun getReceipts(): String {
        return "Hello world!"
    }

    @PostMapping("/")
    fun createReceipt(
            @RequestBody newReceipt: NewReceipt
    ): Receipt {
        return receiptService.save(ApiMapper.mapToDomain(newReceipt))

    }

}
