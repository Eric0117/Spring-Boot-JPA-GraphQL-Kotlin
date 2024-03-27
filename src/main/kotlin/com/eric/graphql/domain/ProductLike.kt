package com.eric.graphql.domain

import com.eric.graphql.domain.base.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "product_like")
class ProductLike(
    member: Member,
    product: Product,
): BaseEntity()  {
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(nullable = false)
    var member: Member = member
        protected set

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(nullable = false)
    var product: Product = product
        protected set
}