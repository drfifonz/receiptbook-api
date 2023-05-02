package com.drfifonz.receiptbook.domain

interface ReceiptService {
    fun save(receipt:Receipt):Receipt
}