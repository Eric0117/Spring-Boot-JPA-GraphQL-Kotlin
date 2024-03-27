package com.eric.graphql.repository

import com.eric.graphql.domain.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository: JpaRepository<Member, Long> {

}