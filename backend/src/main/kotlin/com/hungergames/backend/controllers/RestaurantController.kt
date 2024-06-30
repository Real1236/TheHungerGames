package com.hungergames.backend.controllers

import com.hungergames.backend.models.Restaurant
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/restaurant")
class RestaurantController {
    @GetMapping("/{id}")
    fun getRestaurants(@PathVariable id: String): ResponseEntity<List<Restaurant>> {
        // TODO: Your implementation here
        return ResponseEntity.ok(listOf())
    }
}