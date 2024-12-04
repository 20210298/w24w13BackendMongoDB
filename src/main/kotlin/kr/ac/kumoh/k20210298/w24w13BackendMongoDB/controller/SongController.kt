package kr.ac.kumoh.k20210298.w24w13BackendMongoDB.controller

import kr.ac.kumoh.k20210298.w24w13BackendMongoDB.model.Song
import kr.ac.kumoh.k20210298.w24w13BackendMongoDB.service.SongService
import org.springframework.web.bind.annotation.*

@RestController
class SongController(private val service: SongService) {
    @GetMapping("/api/songs")
    fun getAllSongs(): List<Song> = service.getAllSongs()
}