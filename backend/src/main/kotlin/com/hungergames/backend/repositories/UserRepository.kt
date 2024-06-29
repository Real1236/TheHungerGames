package com.hungergames.backend.repositories

import com.hungergames.backend.models.User
import org.springframework.data.mongodb.repository.MongoRepository

interface UserRepository: MongoRepository<User, String> {
}