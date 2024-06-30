package com.hungergames.backend.controllers

import com.hungergames.backend.models.User
import com.hungergames.backend.services.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @GetMapping("/")
    fun getUsers(): ResponseEntity<List<User>> {
        return ResponseEntity.ok(userService.getUsers())
    }

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: String): ResponseEntity<User> {
        return ResponseEntity.ok(userService.getUser(id))
    }

    @PostMapping("/")
    fun createUser(@RequestBody user: User): ResponseEntity<User> {
        return ResponseEntity.ok(userService.createUser(user))
    }

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: String): ResponseEntity<String> {
        return ResponseEntity.ok(userService.deleteUser(id))
    }
}