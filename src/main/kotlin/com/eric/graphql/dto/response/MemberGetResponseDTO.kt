package com.eric.graphql.dto.response

import com.eric.graphql.domain.Member

data class MemberGetResponseDTO(
    val id: Long,
    val email: String
) {
    companion object {
        fun by(member: Member) = MemberGetResponseDTO(
            id = member.id,
            email = member.email
        )
    }
}
