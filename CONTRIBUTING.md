# Contributing to MPFree

🎶 Thank you for your interest in contributing! We welcome pull requests, issue submissions, and ideas from everyone who shares our vision of music freedom and user rights. 🎶

──────────────────────────────🎼──────────────────────────────

## Philosophy

MPFree is not just another music app:

- **User files are sacred.**
- **No hidden magic.** No cloud, no DRM, no lock-in.
- **No analytics, ads, or recommendation engines. Ever.**
- **Absolutely no features or design decisions that compromise transparency or user agency.**

Please keep these core principles in mind with every contribution!

──────────────────────────────🎼──────────────────────────────

## How to Contribute

1. **Fork the repository** and clone your fork.
2. **Create a branch** for your feature, fix, or improvement:
   git checkout -b {my-cool-feature}
3. **Describe your changes** clearly in your pull request:
    - Why is this change needed?
    - Does it affect any privacy/philosophy aspects?
    - How does it keep user control paramount?

4. **Test your code** on a real device (not just emulator), making sure:
    - No data leaves the device.
    - No unwanted file changes/hiding/import.
    - No permissions creep outside `/Android/media/<package>/Music/`.
    - The app’s UI remains minimal, direct, and free of manipulation.

5. **Submit the Pull Request** and reference any relevant issues.
6. We review with extra care for user trust, clarity, and code simplicity.

──────────────────────────────🎼──────────────────────────────

## Guidelines

- **No Telemetry:** Never send, collect, or log user or device data outside local error logs.
- **Open Code:** All logic must be readable, testable, and maintainable.
- **No Recommendation Engine:** No ML or suggestion features.
- **No new dependencies unless necessary** - explain need and consider portability.
- **Playlists, settings, and tracks must always be visible, editable, and exportable by the user.**
- **Favor clarity** over cleverness, and document decisions.

──────────────────────────────🎼──────────────────────────────

## Code Style

- **Kotlin:** Idiomatic, Jetpack Compose for UI.
- **Comments:** Generous but not verbose. All complex flows explained!
- **Testability:** Business logic kept out of Activities/Fragments/Composables.
- **Keep core logic platform-agnostic** - Android specifics belong in adapters only.

──────────────────────────────🎼──────────────────────────────

## Code of Conduct

Please be friendly, constructive, and respectful.  
Music is for everyone! 🎧

──────────────────────────────🎼──────────────────────────────

## Slack? Discord? Email?

- For now, issues and pull requests are our “jam sessions.”  
If you want to start a forum, open an issue and we’ll riff from there!

──────────────────────────────🎼──────────────────────────────

## License

All code, comments, and documentation must be compatible with the [MIT License](LICENSE).

──────────────────────────────🎼──────────────────────────────

This is a volunteer project. Issues and PRs may not recieve response.
Thank you for helping make MPFree a haven for local music lovers.
```
⣠⣖⣋⠙⠲⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⢿⣿⣿⠀⠀⢿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠉⠉⠀⠀⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⢀⡤⠚⠛⢹⠛⢶⣄⠀⣠⠖⠛⠉⠛⢻⣷⣦⡀⠀⣴⣦⠀
⢠⠟⠀⣾⠁⢸⡄⠀⣿⣾⣧⣤⣤⡄⠀⠀⢻⣿⣿⡀⠙⠋⠀
⣿⡀⠀⣿⣄⣈⣇⣴⣿⠿⣿⣿⣿⠇⠀⠀⢸⣿⣿⡇⣠⣦⡀
⢻⣷⣄⠈⠻⢿⡿⠿⠋⠀⠀⠉⠁⠀⠀⠀⣼⣿⣿⠁⠙⠛⠁
⠀⠻⣿⣷⣤⣀⡇⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⡿⠁⠀⠀⠀⠀
⠀⠀⠈⠛⢿⣿⣿⣦⡀⠀⠀⠀⠀⠀⣴⣿⠟⠁⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠈⣿⠻⣿⣆⠀⢀⣠⡾⠛⠁⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⢿⡀⠈⢻⡷⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠈⣷⣄⠀⡷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠘⠿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
```