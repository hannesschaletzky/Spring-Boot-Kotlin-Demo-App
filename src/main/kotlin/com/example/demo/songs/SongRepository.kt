package com.example.demo.songs

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface SongRepository: CrudRepository<SongEntity, Long> {
}
