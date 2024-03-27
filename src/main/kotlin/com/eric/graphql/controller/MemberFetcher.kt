package com.eric.graphql.controller

import com.eric.graphql.dto.request.MemberSaveRequestDTO
import com.eric.graphql.dto.response.MemberGetResponseDTO
import com.eric.graphql.dto.response.MemberSaveResponseDTO
import com.eric.graphql.service.MemberService
import com.netflix.graphql.dgs.DgsComponent
import com.netflix.graphql.dgs.DgsMutation
import com.netflix.graphql.dgs.DgsQuery
import com.netflix.graphql.dgs.InputArgument


@DgsComponent
class MemberFetcher(
    private val memberService: MemberService,
) {
    @DgsQuery
    fun getAllMembers() : List<MemberGetResponseDTO> {
        return memberService.getAllMembers()
    }

    @DgsMutation
    fun saveMember(
        @InputArgument saveMemberInfo: MemberSaveRequestDTO
    ) : MemberSaveResponseDTO {
        return memberService.saveMember(saveMemberInfo)
    }
}