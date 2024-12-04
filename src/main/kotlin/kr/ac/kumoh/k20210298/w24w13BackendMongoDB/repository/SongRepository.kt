package kr.ac.kumoh.k20210298.w24w13BackendMongoDB.repository

import kr.ac.kumoh.k20210298.w24w13BackendMongoDB.model.Song
import org.springframework.data.mongodb.repository.MongoRepository

interface SongRepository: MongoRepository<Song,String> {
    fun findBySinger(singer: String): List<Song>
}