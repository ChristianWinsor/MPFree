package com.example.localmusicplayer.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.localmusicplayer.core.model.Track
import com.example.localmusicplayer.platform.android.AndroidFileScanner
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.io.File

class LibraryViewModel(app: Application): AndroidViewModel(app) {
    private val _tracks = MutableStateFlow<List<Track>>(emptyList())
    val tracks = _tracks.asStateFlow()
    private val scanner = AndroidFileScanner()

    fun scanMusicFolder(musicDir: File) {
        viewModelScope.launch {
            val tracksList = scanner.scanMusicFolder(musicDir)
            _tracks.value = tracksList
        }
    }
}

