package com.example.kotlinex

import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
@RequiredArgsConstructor
class MemberService @Autowired constructor(private val memberRepo:MemberRepository) {

    fun save(member: Member) {
        memberRepo.save(member)
    }

    fun addFriendToUser(memberId: String, friendId: String) : Member? {
        val member = memberRepo.findById(memberId).orElse(null)
        if (member != null) {
            member.addFriend(friendId)
            memberRepo.save(member)
        }
        return member
    }

}