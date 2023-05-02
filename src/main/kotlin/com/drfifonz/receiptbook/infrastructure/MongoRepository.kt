package com.drfifonz.receiptbook.infrastructure

import com.drfifonz.receiptbook.domain.Receipt
import com.drfifonz.receiptbook.domain.ReceiptService
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.stereotype.Repository

@Repository
class MongoRepository(
        val mongoTemplate: MongoTemplate
):ReceiptService {
    override fun save(receipt: Receipt):Receipt {
        val savedReceipt = mongoTemplate.save(ReceiptsMapper.mapToEntity(receipt), "receipts")
        return ReceiptsMapper.mapToDomain(savedReceipt)
    }
}