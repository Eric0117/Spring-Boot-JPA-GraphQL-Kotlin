package com.eric.graphql.dto.response

import com.eric.graphql.domain.Member

data class MemberSaveResponseDTO(
    val id: Long,
    val email: String
) {
    companion object {
        fun by(member: Member) = MemberSaveResponseDTO(
            id = member.id,
            email = member.email
        )
    }
}
