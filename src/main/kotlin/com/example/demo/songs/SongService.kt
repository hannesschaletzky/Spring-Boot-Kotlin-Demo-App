package com.example.demo.songs

import org.springframework.stereotype.Service

@Service
class SongService(private val songRepository: SongRepository) {

    fun saveASong() {
        val song = SongEntity("I see fire", 2.0)
        songRepository.save(song)
        println("saved song: $song")
    }

    fun printSongs() {
        val songs = songRepository.findAll()
        println(songs)
    }
}
