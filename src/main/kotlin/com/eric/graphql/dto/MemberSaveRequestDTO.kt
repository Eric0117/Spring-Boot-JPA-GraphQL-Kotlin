package com.eric.graphql.dto

import com.eric.graphql.domain.Member


data class MemberSaveRequestDTO(
    val email: String,
    val password: String
) {
    companion object
        fun toEntity(request: MemberSaveRequestDTO) = Member(
            email = request.email,
            password = request.password
        )
}
