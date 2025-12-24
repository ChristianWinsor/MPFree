package com.mpfree.app.ui.nowplaying

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mpfree.app.core.model.Track

@Composable
fun NowPlayingScreen(
    track: Track?,
    isPlaying: Boolean,
    onPlayPause: () -> Unit,
    onSeek: (Long) -> Unit
) {
    if (track == null) {
        Text("No track playing")
        return
    }
    Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
        Text(track.title)
        Text(track.artist)
        Text(track.album)
        Row(Modifier.padding(top = 16.dp)) {
            Button(onClick = onPlayPause) {
                Text(if (isPlaying) "Pause" else "Play")
            }
            // You can add seekbar, etc, here
        }
    }
}
