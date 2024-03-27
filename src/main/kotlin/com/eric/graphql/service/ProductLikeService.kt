package com.eric.graphql.service

import com.eric.graphql.domain.Member
import com.eric.graphql.domain.Product
import com.eric.graphql.domain.ProductLike
import com.eric.graphql.repository.ProductLikeRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ProductLikeService(
    private val memberService: MemberService,
    private val productService: ProductService,
    private val productLikeRepository: ProductLikeRepository,
) {

    // 좋아요 등록
    @Transactional
    fun addProductLike(productId: Long, memberId: Long): Boolean {
        val member = getMember(memberId)
        val product = getProduct(productId)

        val productLike = ProductLike(
            member = member,
            product = product
        )

        productLikeRepository.save(productLike)

        return true
    }

    // 좋아요 해제
    @Transactional
    fun deleteProductLike(productId: Long, memberId: Long): Boolean {
        val member = getMember(memberId)
        val product = getProduct(productId)

        val productLike = productLikeRepository.findByProductAndMember(product, member)

        productLike?.let {
            productLikeRepository.delete(it)
        }

        return true
    }

    private fun getMember(memberId: Long): Member {
        return memberService.getMember(memberId)
    }

    private fun getProduct(productId: Long): Product {
        return productService.getProduct(productId)
    }

}