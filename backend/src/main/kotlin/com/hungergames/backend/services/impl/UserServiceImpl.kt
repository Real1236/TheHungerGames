package com.hungergames.backend.services.impl

import com.hungergames.backend.models.User
import com.hungergames.backend.repositories.UserRepository
import com.hungergames.backend.services.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(private val userRepository: UserRepository) : UserService {
    override fun getUsers(): List<User> {
        return userRepository.findAll()
    }

    override fun getUser(id: String): User? {
        return userRepository.findById(id).orElse(null)
    }

    override fun createUser(user: User): User {
        return userRepository.save(user)
    }

    override fun deleteUser(id: String): String {
        userRepository.deleteById(id)
        return id
    }
}