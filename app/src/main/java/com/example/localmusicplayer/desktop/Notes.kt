package com.example.localmusicplayer.desktop

/*
Desktop Portability Plan:
- All core types (Track, Playlist, FileScanner, AudioPlayer) have zero Android dependencies.
- To port to desktop, implement FileSystemAdapter and AudioEngineAdapter with JVM/desktop libraries.
- UI can be ported using Compose Multiplatform or JVM UI (Swing/JavaFX/Compose-Desktop).
- Playlist persistence as plain JSON is already cross-platform.
- Paths must be user-visible, not hardcoded; directory access for manual drag/drop is natural for desktop as well.
- Tag reading: Use jaudiotagger (already JVM), or plug in alternative if needed.
- Testing: Core logic can be tested with pure JVM unit tests, without Android.
*/

