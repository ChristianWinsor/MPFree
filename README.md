``` 
  __  __ _____  ______              
 |  \/  |  __ \|  ____|             
 | \  / | |__) | |__ _ __ ___  ___ 
 | |\/| |  ___/|  __| '__/ _ \/ _ \
 | |  | | |    | |  | | |  __/  __/
 |_|  |_|_|    |_|  |_|  \___|\___|
```
 MPFree: Let your music play free!

                .-.
               /'v'\
              (/   \)
               ^^-^^

🎵 Minimalist, folder-based, privacy-first local Android music player 🎵

*So local, even your vinyl collection is jealous.*
──────────────────────────────🎼──────────────────────────────

**MPFree** is an open source, privacy-first local music player for Android.  
It is designed for people who value ownership, privacy, and the right to manage their own files.  
Drag music to your phone with USB, access it from any file manager, and play it locally. No accounts, no imports, no cloud, no ads, no telemetry.

MPFree minds its own business, like a tuba in a string quartet.
──────────────────────────────🎼──────────────────────────────

## Philosophy

- **Phones are computers. Users own their files.**
- MPFree *never* copies, hides, or ingests files behind your back.
- Your music library is just a folder accessible over USB or file manager.
- No cloud, streaming, DRM, analytics, or forced recommendations.
- No account required, no onboarding, no lock-in.

All your music, none of our business.
──────────────────────────────🎼──────────────────────────────

## Features

- Scan and index music in `/Android/media/Music/`
- Analyze standard tags (title, artist, album, duration—no phonies!)
- Play, pause, seek, and shuffle — Shuffle like a jazz trio dropped their sheet music
- Create/manage local playlists — every setlist is yours
- Modern minimalist UI with dark/light mode (perfect for playing in a club or in your room)
- Full lockscreen & notification controls — even your phone wants to jam!
- Friendly handling of missing tags or “mystery tracks”
- No peeking; nothing ever leaves your device. Not even a flat note!

The shuffle button: proof that the universe loves jazz.
──────────────────────────────🎼──────────────────────────────

## Non-Goals

- No user accounts
- No cloud or remote services
- No telemetry, analytics, or tracking
- No visualizers or “smart” recommendations
- No in-app purchases, ads, or nag screens

No tracking, except for your music tracks. We’re not monsters.
──────────────────────────────🎼──────────────────────────────

## Screenshots

Don't shoot your screen please.
Desk pops are okay though.

We won’t tell anyone about your guilty pleasure playlist.
──────────────────────────────🎼──────────────────────────────

## How it works

- Drop files into the `/Android/media/<your.package.name>/Music/` folder visible on your phone via USB or with your favorite file manager.
- Open MPFree to play, browse, or organize your music.  
- All playlists are simple, readable files stored in the same directory—easy to back up, move, or edit outside the app.

You bring the beat, we bring the player.
──────────────────────────────🎼──────────────────────────────

## Directory Structure

*Much more organized than my own record shelf.*

```
.
├── app/
│   ├── build.gradle.kts
│   ├── src/
│   │   ├── main/
│   │   │   ├── AndroidManifest.xml
│   │   │   ├── java/com/example/localmusicplayer/
│   │   │   │   ├── MainActivity.kt
│   │   │   │   ├── core/
│   │   │   │   │   ├── model/Track.kt
│   │   │   │   │   ├── playback/AudioPlayer.kt
│   │   │   │   │   ├── playlists/Playlist.kt
│   │   │   │   │   ├── playlists/PlaylistsManager.kt
│   │   │   │   │   ├── scanner/FileScanner.kt
│   │   │   │   │   ├── scanner/ScanErrorLogger.kt
│   │   │   │   ├── platform/android/
│   │   │   │   │   ├── AndroidFileScanner.kt
│   │   │   │   │   ├── ExoAudioPlayer.kt
│   │   │   │   │   ├── MusicPlaybackService.kt
│   │   │   │   ├── viewmodel/
│   │   │   │   │   ├── LibraryViewModel.kt
│   │   │   │   │   ├── PlayerViewModel.kt
│   │   │   │   │   ├── PlaylistsViewModel.kt
│   │   │   │   ├── ui/
│   │   │   │   │   ├── about/AboutScreen.kt
│   │   │   │   │   ├── library/LibraryScreen.kt
│   │   │   │   │   ├── nowplaying/NowPlayingScreen.kt
│   │   │   │   │   ├── playlists/PlaylistsScreen.kt
│   │   │   │   │   ├── playlists/CreatePlaylistDialog.kt
│   │   │   ├── res/
│   │   │   │   ├── values/strings.xml
│   │   │   │   ├── values/themes.xml
│   │   │   │   ├── layout/activity_main.xml
│   │   │   │   ├── mipmap-* (icons)
│   │   ├── ...
├── build.gradle
├── settings.gradle
├── README.md
```

Organize your music just how you like it, no treble at all.
──────────────────────────────🎼──────────────────────────────

## License

MPFree is open source. Use it, study it, modify it, and share it as you wish. Do what you will. Enjoy the music.
We recommend the [Apache-2.0](LICENSE) or [MIT](LICENSE) license for maximum freedom, but you can include the license of your choice.

No analytics, no ads, and not a single forced syncopation
──────────────────────────────🎼──────────────────────────────

## Contact / Contribution

- Issues and Pull Requests are welcome.
- Please respect the guiding philosophy: user ownership, privacy, no cloud or telemetry, absolute clarity.
- See CONTRIBUTING.md for code style and guidelines.

Open source, open chords.
──────────────────────────────🎼──────────────────────────────

## Credits

- Built with ❤ in Kotlin and Jetpack Compose
- Uses [ExoPlayer](https://github.com/google/ExoPlayer) and [jaudiotagger](https://bitbucket.org/ijabz/jaudiotagger)

Mic drop.

──────────────────────────────🎤──────────────────────────────

 “Without music, life would be a mistake.”  
 - Nietzsche

```
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣐⡚⠒⠢⣄⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡜⠁⠀⠈⠀⠀⠹⡀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡹⠦⠤⠶⠭⢦⣠⡇⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⠤⡤⣤⣤⡴⠋⣿⠁⠀⣀⣀⡀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡡⡳⡮⣠⡞⢬⠏⠉⠁⠈⠙⡆⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⠋⠀⠘⢿⣽⣾⡿⢚⠥⠃⠀⠀⠀⢀⡅⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠀⠀⢀⣤⠝⠛⠈⠑⠈⠉⠁⣀⣼⠋⡇⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡀⠤⠜⠓⠊⠁⠈⠻⢶⣄⣀⣤⣴⣾⠟⠁⡰⡇⠀
⠀⠀⠀⠀⠀⠀⠀⠀⣀⠔⢊⢆⠤⠤⡤⠤⢤⣴⣶⣶⠿⡿⠿⣿⡧⢂⠔⡹⠀⠀
⠀⢀⣠⣤⣴⣶⡶⡺⣱⣶⣧⣸⣀⠀⢳⡀⣤⣶⠿⢦⡀⣠⠔⢉⠔⠁⣰⠀⠀⠀
⢄⣻⡿⣿⣶⣾⣿⣾⣿⣿⣿⣿⣿⣷⣦⠘⢿⣷⣄⠀⠻⣥⣀⡁⠀⠀⡏⠀⠀⠀
⠀⠈⠛⠿⣻⢿⣟⣦⣻⣼⣿⣿⣿⡿⠿⢿⣿⣿⣿⣦⢀⢠⢙⠞⣛⣖⡸⠄⠀⠀
⠀⠀⠀⠀⠀⠉⠚⠿⣟⡿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣸⣼⣧⣻⠶⣟⣡⣤⠶⠚
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠑⠢⢄⣈⠉⠉⠉⠉⠉⠉⠉⠥⠔⠒⠛⠉⠁⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⠉⠲⡶⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
```
Rock on.

──────────────────────────────🎤──────────────────────────────