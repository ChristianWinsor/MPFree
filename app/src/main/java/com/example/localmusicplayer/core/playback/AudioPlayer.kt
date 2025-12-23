package com.example.localmusicplayer.core.playback

import com.example.localmusicplayer.core.model.Track

interface AudioPlayer {
    fun load(track: Track)
    fun play()
    fun pause()
    fun seekTo(positionMs: Long)
    val isPlaying: Boolean
    val currentPosition: Long
}

