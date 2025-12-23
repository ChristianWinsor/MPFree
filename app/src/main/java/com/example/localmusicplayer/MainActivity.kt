package com.example.localmusicplayer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.collectAsState
import com.example.localmusicplayer.ui.library.LibraryScreen
import com.example.localmusicplayer.viewmodel.LibraryViewModel
import com.example.localmusicplayer.viewmodel.PlayerViewModel
import com.example.localmusicplayer.ui.nowplaying.NowPlayingScreen
import java.io.File

class MainActivity : ComponentActivity() {
    private val libraryViewModel: LibraryViewModel by viewModels()
    private val playerViewModel: PlayerViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val musicDir = File(getExternalFilesDir(null)?.parentFile?.parentFile, "media/${packageName}/Music")
        libraryViewModel.scanMusicFolder(musicDir)
        setContent {
            MaterialTheme {
                val tracks by libraryViewModel.tracks.collectAsState()
                val currentTrack by playerViewModel.currentTrack.collectAsState()
                androidx.compose.foundation.layout.Column {
                    LibraryScreen(tracks = tracks, onTrackClick = { playerViewModel.playTrack(it) })
                    NowPlayingScreen(
                        track = currentTrack,
                        isPlaying = playerViewModel.isPlaying,
                        onPlayPause = {
                            if (playerViewModel.isPlaying) playerViewModel.pause()
                            else playerViewModel.play()
                        },
                        onSeek = { playerViewModel.seekTo(it) }
                    )
                }
            }
        }
    }
}
