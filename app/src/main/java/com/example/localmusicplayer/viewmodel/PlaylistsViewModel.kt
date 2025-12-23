package com.example.localmusicplayer.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.localmusicplayer.core.playlists.Playlist
import com.example.localmusicplayer.core.playlists.PlaylistsManager
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PlaylistsViewModel(app: Application) : AndroidViewModel(app) {
    private val manager = PlaylistsManager(app)
    private val _playlists = MutableStateFlow<List<Playlist>>(emptyList())
    val playlists: StateFlow<List<Playlist>> = _playlists

    init { loadPlaylists() }

    private fun loadPlaylists() {
        viewModelScope.launch {
            _playlists.value = manager.loadPlaylists()
        }
    }

    fun createPlaylist(name: String) {
        val newPlaylist = Playlist(name, emptyList())
        val updated = _playlists.value + newPlaylist
        manager.savePlaylists(updated)
        _playlists.value = updated
    }

    fun addToPlaylist(playlist: Playlist, path: String) {
        val newPlaylist = playlist.copy(tracks = playlist.tracks + path)
        val updated = _playlists.value.map { if (it.name == playlist.name) newPlaylist else it }
        manager.savePlaylists(updated)
        _playlists.value = updated
    }
}

