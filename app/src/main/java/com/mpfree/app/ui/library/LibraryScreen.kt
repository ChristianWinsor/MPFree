package com.example.app.ui.library

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.app.core.model.Track

@Composable
fun LibraryScreen(tracks: List<Track>, onTrackClick: (Track) -> Unit = {}) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "Music Library", modifier = Modifier.padding(bottom = 8.dp))
        LazyColumn {
            items(tracks) { track ->
                Card(
                    modifier = Modifier
                        .padding(vertical = 4.dp)
                        .fillMaxWidth()
                        .clickable { onTrackClick(track) }
                ) {
                    Column(modifier = Modifier.padding(8.dp)) {
                        Text(text = track.title)
                        Text(text = track.artist)
                        Text(text = track.album)
                        Text(text = formatTrackDuration(track.duration))
                    }
                }
            }
        }
    }
}

fun formatTrackDuration(ms: Long): String {
    val totalSeconds = ms / 1000
    val minutes = totalSeconds / 60
    val seconds = totalSeconds % 60
    return "%d:%02d".format(minutes, seconds)
}
