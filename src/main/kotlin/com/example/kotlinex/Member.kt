package com.example.kotlinex

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "member")
data class Member(

    @Id
    val id : String? ="",
    val name : String? = "",
    val profile_img : String? = "",
    val friends : MutableList<String> = mutableListOf()

) {
    fun addFriend(friendId: String) {
        if(!friends.contains(friendId)) friends.add(friendId)
    }
}
