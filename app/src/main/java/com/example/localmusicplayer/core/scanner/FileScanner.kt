package com.example.localmusicplayer.core.scanner

import com.example.localmusicplayer.core.model.Track
import java.io.File

interface FileScanner {
    fun scanMusicFolder(rootDir: File): List<Track>
}

