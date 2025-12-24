package com.mpfree.app.platform.android

import android.content.Context
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import com.mpfree.app.core.model.Track
import com.mpfree.app.core.playback.AudioPlayer

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
        exoPlayer.play()
    }
    
    override fun pause() {
        exoPlayer.pause()
    }
    
    override fun seekTo(positionMs: Long) {
        exoPlayer.seekTo(positionMs)
    }
    
    override val isPlaying: Boolean
        get() = exoPlayer.isPlaying
        
    override val currentPosition: Long
        get() = exoPlayer.currentPosition
}
