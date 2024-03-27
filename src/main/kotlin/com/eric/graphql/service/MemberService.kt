package com.eric.graphql.service

import com.eric.graphql.dto.request.MemberSaveRequestDTO
import com.eric.graphql.dto.response.MemberGetResponseDTO
import com.eric.graphql.dto.response.MemberSaveResponseDTO
import com.eric.graphql.repository.MemberRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MemberService(
    private val memberRepository: MemberRepository,
) {

    @Transactional(readOnly = true)
    fun getAllMembers(): List<MemberGetResponseDTO> {
        return memberRepository.findAll().map {
            MemberGetResponseDTO.by(it)
        }
    }

    @Transactional
    fun saveMember(memberSaveRequestDTO: MemberSaveRequestDTO): MemberSaveResponseDTO {
        val savedMember = memberRepository.save(
            memberSaveRequestDTO.toEntity(memberSaveRequestDTO)
        )
        return MemberSaveResponseDTO.by(savedMember)
    }
}

