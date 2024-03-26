package com.eric.graphql.repository

import com.eric.graphql.domain.Member
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.graphql.data.GraphQlRepository

@GraphQlRepository
interface MemberRepository: JpaRepository<Member, Long> {

}