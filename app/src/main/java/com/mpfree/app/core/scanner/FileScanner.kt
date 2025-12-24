package com.mpfree.app.core.scanner

import com.mpfree.app.core.model.Track
import java.io.File

interface FileScanner {
    fun scanMusicFolder(rootDir: File): List<Track>
}
