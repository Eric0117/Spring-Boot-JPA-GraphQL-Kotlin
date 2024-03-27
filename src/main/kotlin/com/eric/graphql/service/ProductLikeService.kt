package com.eric.graphql.service

import com.eric.graphql.repository.ProductLikeRepository
import com.eric.graphql.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductLikeService(
    private val productRepository: ProductRepository,
    private val productLikeRepository: ProductLikeRepository,
) {
}