package com.mpfree.app.core.playback

import com.mpfree.app.core.model.Track

interface AudioPlayer {
    fun load(track: Track)
    fun play()
    fun pause()
    fun seekTo(positionMs: Long)
    val isPlaying: Boolean
    val currentPosition: Long
}
