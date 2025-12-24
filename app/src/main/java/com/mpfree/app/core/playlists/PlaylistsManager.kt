package com.mpfree.app.core.playlists

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.File

class PlaylistsManager(private val context: Context) {
    private val gson = Gson()
    private val playlistsFile: File by lazy {
        File(context.getExternalFilesDir(null), "playlists.json")
    }

    fun loadPlaylists(): List<Playlist> {
        if (!playlistsFile.exists()) return emptyList()
        val type = object : TypeToken<List<Playlist>>() {}.type
        return gson.fromJson(playlistsFile.readText(), type)
    }

    fun savePlaylists(playlists: List<Playlist>) {
        playlistsFile.writeText(gson.toJson(playlists))
    }
}
