package com.mpfree.app.platform.android

import com.mpfree.app.core.model.Track
import com.mpfree.app.core.scanner.FileScanner
import com.mpfree.app.core.scanner.ScanErrorLogger
import java.io.File
import org.jaudiotagger.audio.AudioFileIO
import org.jaudiotagger.tag.FieldKey

class AndroidFileScanner : FileScanner {
    override fun scanMusicFolder(rootDir: File): List<Track> {
        val tracks = mutableListOf<Track>()
        rootDir.walkTopDown().forEach { file ->
            if (file.isFile && isAudioFile(file)) {
                try {
                    val audioFile = AudioFileIO.read(file)
                    val tag = audioFile.tag
                    val title = tag?.getFirst(FieldKey.TITLE)?.ifBlank { file.nameWithoutExtension } ?: file.nameWithoutExtension
                    val artist = tag?.getFirst(FieldKey.ARTIST)?.ifBlank { "Unknown Artist" } ?: "Unknown Artist"
                    val album = tag?.getFirst(FieldKey.ALBUM)?.ifBlank { "Unknown Album" } ?: "Unknown Album"
                    val duration = audioFile.audioHeader?.trackLength?.let { it * 1000L } ?: 0L
                    tracks.add(
                        Track(
                            path = file.absolutePath,
                            title = title,
                            artist = artist,
                            album = album,
                            duration = duration
                        )
                    )
                } catch (e: Exception) {
                    ScanErrorLogger.log("Failed to read metadata for file ${file.absolutePath}", e)
                    // Fallback to minimal info if tag parse fails
                    tracks.add(
                        Track(
                            path = file.absolutePath,
                            title = file.nameWithoutExtension,
                            artist = "Unknown Artist",
                            album = "Unknown Album",
                            duration = 0L
                        )
                    )
                }
            }
        }
        return tracks
    }
    private fun isAudioFile(file: File): Boolean {
        val supported = listOf(".mp3", ".flac", ".wav", ".ogg", ".m4a")
        return supported.any { file.name.endsWith(it, ignoreCase = true) }
    }
}
