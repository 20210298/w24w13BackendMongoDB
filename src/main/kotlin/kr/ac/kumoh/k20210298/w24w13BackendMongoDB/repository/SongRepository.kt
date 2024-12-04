package kr.ac.kumoh.k20210298.w24w13BackendMongoDB.repository

interface SongRepository: MongoRepsitory<Song,String> {
    fun findBysinger(singer: String): List<Song>
}