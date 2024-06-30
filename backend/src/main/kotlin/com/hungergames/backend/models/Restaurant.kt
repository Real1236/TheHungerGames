package com.hungergames.backend.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Restaurant {
    @Id
    var id: String? = null
    var name: String? = null
    var address: String? = null
    var rating: Double? = null
    var priceLevel: Int? = null
    var photo: String? = null
    var gameId: String? = null
}