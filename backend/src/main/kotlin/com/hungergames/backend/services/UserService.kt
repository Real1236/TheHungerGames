package com.hungergames.backend.services

import com.hungergames.backend.models.User

interface UserService {
    fun getUsers(): List<User>
    fun getUser(id: String): User?
    fun createUser(user: User): User
    fun deleteUser(id: String): String
}