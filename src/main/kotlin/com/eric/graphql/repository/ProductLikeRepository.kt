package com.eric.graphql.repository

import com.eric.graphql.domain.Member
import com.eric.graphql.domain.Product
import com.eric.graphql.domain.ProductLike
import org.springframework.data.jpa.repository.JpaRepository

interface ProductLikeRepository: JpaRepository<ProductLike, Long> {

    fun findByProductAndMember(product: Product, member: Member): ProductLike?
}