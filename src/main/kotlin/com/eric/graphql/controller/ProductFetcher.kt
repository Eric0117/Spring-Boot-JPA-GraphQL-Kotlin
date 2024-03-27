package com.eric.graphql.controller

import com.eric.graphql.domain.Product
import com.eric.graphql.service.ProductService
import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsQuery
import com.netflix.graphql.dgs.InputArgument

@DgsComponent
class ProductFetcher(
    private val productService: ProductService
) {
    @DgsQuery
    fun getProduct(
        @InputArgument id: Long,
    ): Product {
        return productService.getProduct(id)
    }
}