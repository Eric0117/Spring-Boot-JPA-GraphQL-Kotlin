package com.eric.graphql.service

import com.eric.graphql.domain.Member
import com.eric.graphql.dto.MemberSaveRequestDTO
import com.eric.graphql.repository.MemberRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class MemberService(
    private val memberRepository: MemberRepository,
) {

    @Transactional(readOnly = true)
    fun getAllMembers(): List<Member> {
        return memberRepository.findAll()
    }

    @Transactional
    fun saveMember(memberSaveRequestDTO: MemberSaveRequestDTO): Member {
        return memberRepository.save(
            memberSaveRequestDTO.toEntity(memberSaveRequestDTO)
        )
    }
}

