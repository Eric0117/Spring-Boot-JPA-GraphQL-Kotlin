package com.eric.graphql.controller

import com.eric.graphql.service.ProductLikeService
import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsMutation
import com.netflix.graphql.dgs.InputArgument

@DgsComponent
class ProductLikeFetcher(
    private val productLikeService: ProductLikeService,
) {

    @DgsMutation
    fun addProductLike(
        @InputArgument productId: Long,
        @InputArgument memberId: Long,
    ): Boolean {
        return productLikeService.addProductLike(productId, memberId)
    }

    @DgsMutation
    fun deleteProductLike(
        @InputArgument productId: Long,
        @InputArgument memberId: Long,
    ): Boolean {
        return productLikeService.deleteProductLike(productId, memberId)
    }
}