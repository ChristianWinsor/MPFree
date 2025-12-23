package com.example.localmusicplayer.ui.playlists

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.localmusicplayer.core.playlists.Playlist

@Composable
fun PlaylistsScreen(
    playlists: List<Playlist>,
    onCreatePlaylist: () -> Unit,
    onPlaylistClick: (Playlist) -> Unit
) {
    Column(Modifier.fillMaxSize().padding(16.dp)) {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
            Button(onClick = onCreatePlaylist) {
                Text("New Playlist")
            }
        }
        Spacer(Modifier.height(16.dp))
        LazyColumn {
            items(playlists) { pl ->
                Text(
                    text = pl.name,
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .fillMaxWidth()
                        .clickable { onPlaylistClick(pl) }
                )
            }
        }
    }
}

