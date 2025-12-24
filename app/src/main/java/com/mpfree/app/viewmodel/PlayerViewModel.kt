package com.mpfree.app.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.mpfree.app.core.model.Track
import com.mpfree.app.core.playback.AudioPlayer
import com.mpfree.app.platform.android.ExoAudioPlayer
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class PlayerViewModel(app: Application) : AndroidViewModel(app) {
    private val audioPlayer: AudioPlayer = ExoAudioPlayer(app)
    private val _currentTrack = MutableStateFlow<Track?>(null)
    val currentTrack: StateFlow<Track?> = _currentTrack

    fun playTrack(track: Track) {
        _currentTrack.value = track
        audioPlayer.load(track)
        audioPlayer.play()
    }

    fun pause() = audioPlayer.pause()
    fun play() = audioPlayer.play()
    fun seekTo(positionMs: Long) = audioPlayer.seekTo(positionMs)
    val isPlaying get() = audioPlayer.isPlaying
    val currentPosition get() = audioPlayer.currentPosition
}
