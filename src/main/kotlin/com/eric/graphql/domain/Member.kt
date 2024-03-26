package com.eric.graphql.domain

import com.eric.graphql.domain.base.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "member")
class Member(
    email: String,
    password: String,
): BaseEntity() {
    @Column(name = "email", unique = true, nullable = false)
    var email: String = email
        protected set

    @Column(name = "password", nullable = false)
    var password: String = password
        protected set
}