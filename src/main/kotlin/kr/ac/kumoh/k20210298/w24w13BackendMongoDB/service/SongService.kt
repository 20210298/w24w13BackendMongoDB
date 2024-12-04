package kr.ac.kumoh.k20210298.w24w13BackendMongoDB.service

@Service
class SongService(private val repository: SongRepository) {
    fun getAllSongs(): List<Song> = repository.findAll()
}