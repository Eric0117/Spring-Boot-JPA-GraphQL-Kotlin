package com.eric.graphql.controller

import com.eric.graphql.domain.Member
import com.eric.graphql.dto.request.MemberSaveRequestDTO
import com.eric.graphql.dto.response.MemberGetResponseDTO
import com.eric.graphql.dto.response.MemberSaveResponseDTO
import com.eric.graphql.service.MemberService
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class MemberController(
    private val memberService: MemberService,
) {

    @QueryMapping
    fun getAllMembers() : List<MemberGetResponseDTO> {
        return memberService.getAllMembers()
    }

    @MutationMapping
    fun saveMember(
        @Argument saveMemberInfo: MemberSaveRequestDTO
    ) : MemberSaveResponseDTO {
        return memberService.saveMember(saveMemberInfo)
    }
}