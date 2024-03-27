package com.eric.graphql.service

import com.eric.graphql.domain.Product
import com.eric.graphql.repository.ProductRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ProductService(
    private val productRepository: ProductRepository
) {

    @Transactional
    fun getProduct(id: Long): Product {
        return productRepository.findById(id).orElseThrow {
            throw Exception("dd")
        }
    }
}