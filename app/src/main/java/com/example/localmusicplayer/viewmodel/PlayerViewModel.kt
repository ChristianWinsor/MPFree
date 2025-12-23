package com.example.localmusicplayer.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.localmusicplayer.core.model.Track
import com.example.localmusicplayer.core.playback.AudioPlayer
import com.example.localmusicplayer.platform.android.ExoAudioPlayer
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

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

