package com.mpfree.app.core.model

data class Track(
    val path: String,
    val title: String,
    val artist: String,
    val album: String,
    val duration: Long // in ms
)
