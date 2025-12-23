package com.example.localmusicplayer.platform.android

import android.content.Context
import com.example.localmusicplayer.core.model.Track
import com.example.localmusicplayer.core.playback.AudioPlayer
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem

class ExoAudioPlayer(private val context: Context): AudioPlayer {
    private val exoPlayer = ExoPlayer.Builder(context).build()
    private var currentTrack: Track? = null
    override fun load(track: Track) {
        currentTrack = track
        val mediaItem = MediaItem.fromUri(track.path)
        exoPlayer.setMediaItem(mediaItem)
        exoPlayer.prepare()
    }
    override fun play() {
        exoPlayer.playWhenReady = true
    }
    override fun pause() {
        exoPlayer.playWhenReady = false
    }
    override fun seekTo(positionMs: Long) {
        exoPlayer.seekTo(positionMs)
    }
    override val isPlaying: Boolean
        get() = exoPlayer.isPlaying
    override val currentPosition: Long
        get() = exoPlayer.currentPosition
}

