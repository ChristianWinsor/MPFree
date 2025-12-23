package com.example.localmusicplayer.ui.about

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.material3.Card
import androidx.compose.ui.res.stringResource
import com.example.localmusicplayer.R

@Composable
fun AboutScreen() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Card(modifier = Modifier.padding(32.dp)) {
            Column(modifier = Modifier.padding(24.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = stringResource(id = R.string.app_name))
                Spacer(modifier = Modifier.height(12.dp))
                Text(text = stringResource(id = R.string.about_message))
                Spacer(modifier = Modifier.height(12.dp))
                Text(text = stringResource(id = R.string.your_music_safe))
            }
        }
    }
}

