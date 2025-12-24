package com.example.app.core.scanner

import com.example.app.core.model.Track
import java.io.File

interface FileScanner {
    fun scanMusicFolder(rootDir: File): List<Track>
}

