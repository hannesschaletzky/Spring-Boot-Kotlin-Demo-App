package com.example.demo.songs

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SongController(private val songService: SongService) {
    @GetMapping("/")
    fun home(): String {
        return "Hello World!"
    }

    @GetMapping("/create")
    fun create(): String {
        songService.saveASong()
        return "Entry created!"
    }
}
