package com.hungergames.backend.controllers

import com.hungergames.backend.dto.Vote
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/game")
class GameController {
    @PostMapping("/")
    fun createGame(): ResponseEntity<String> {
        // TODO: Your implementation here
        return ResponseEntity.ok("Game created") // replace with your actual implementation
    }

    @GetMapping("/{id}")
    fun getGame(@PathVariable id: String): ResponseEntity<String> {
        // TODO: Your implementation here
        return ResponseEntity.ok("Game details") // replace with your actual implementation
    }

    @PostMapping("/")
    fun vote(@RequestBody vote: Vote): ResponseEntity<String> {
        // TODO: Your implementation here
        return ResponseEntity.ok("Vote registered") // replace with your actual implementation
    }

    @GetMapping("/{id}/result")
    fun getGameResult(@PathVariable id: String): ResponseEntity<String> {
        // TODO: Your implementation here
        return ResponseEntity.ok("Game result") // replace with your actual implementation
    }
}