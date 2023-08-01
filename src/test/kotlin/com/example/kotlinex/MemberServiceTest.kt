package com.example.kotlinex

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class MemberServiceTest (
    @Autowired val memberService: MemberService
    ){

    @Test
    fun save() {
        val insertData = Member("ysndy")
        memberService.save(insertData)
    }

    @Test
    fun addFriends(){
        val insertData = "testId1"
        memberService.addFriendToUser("ysndy", insertData)
    }

}