package com.eric.graphql.domain

import com.eric.graphql.domain.base.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "product")
class Product(
    name: String,
    thumbnail: String,
    price: Long,
) : BaseEntity() {

    var name: String = name
        protected set

    var thumbnail: String = thumbnail
        protected set

    var price: Long = price
        protected set
}