package com.example.demo.songs

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class SongEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long? = null
    private var price = 0.0
    private var title: String? = null

    constructor() {}
    constructor(title: String?, price: Double) {
        this.title = title
        this.price = price
    }
}
