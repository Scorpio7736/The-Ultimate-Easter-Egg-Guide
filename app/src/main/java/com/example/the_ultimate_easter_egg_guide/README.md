# The Easter Egg Guide


---

**Current Version:** 0.5.1
**Version Date:** September 22, 2026
**Last Updated:** September 22, 2026
**Version Name:** Pre-Alpha-Omega

---

## About the App

**The Easter Egg Guide** is an Android application designed to serve as a quick-reference companion for Call of Duty Zombies.

The app organizes information from Treyarch Zombies maps into an easy-to-navigate mobile format so players can quickly find Easter egg steps, main quests, side quests, buildables, and other useful information without needing to search through videos, websites, screenshots, or saved notes while playing.

The goal of the project is to create a centralized Zombies reference tool that is simple enough to use during a game while still containing detailed information for players who want to complete quests or learn more about a map.

---

## Main Features

The Easter Egg Guide currently includes features such as:

* Browse Zombies maps by Call of Duty game
* View map-specific guides
* View main Easter egg quest steps
* View side Easter eggs and side quests
* View buildable information
* Expand and collapse individual guides for easier navigation
* Favorite maps for quick access
* Share quest information with other players
* Random map recommendation tool
* Player profile customization
* Application settings
* Music and sound settings
* Built-in Zombies-themed music
* How to Play video
* Zombies-related character and Easter egg information

---

## Supported Games

The application is structured to support Zombies content across multiple Treyarch Call of Duty titles.

Current game categories include:

* Call of Duty: World at War
* Call of Duty: Black Ops
* Call of Duty: Black Ops II
* Call of Duty: Black Ops III
* Call of Duty: Black Ops 4
* Call of Duty: Black Ops Cold War
* Call of Duty: Black Ops 6
* Call of Duty: Black Ops 7

Content availability may vary between games as additional maps and guides are added.

---

## Map Guide Structure

Each supported Zombies map can contain several categories of information.

### Main Quest

The primary Easter egg or story quest for the map.

Steps are displayed in order and can be expanded or collapsed while playing.

### Side Quests

Optional Easter eggs, rewards, secrets, and other activities available on the map.

### Buildables

Instructions for obtaining or constructing map-specific equipment, weapons, or other items.

---

## Favorites

Maps can be added to the player's **Favorites** list.

Favorites are stored locally on the device and provide quick access to frequently played maps without requiring the player to search through the full map list.

---

## Map Recommendation

The app includes a map recommendation feature for players who cannot decide what Zombies map to play.

The recommendation system selects a map and presents it using a Zombies-themed interface and sound effects.

---

## Profile

Players can create and customize a local profile inside the application.

The profile system is designed to give the app a more personalized experience and provide a foundation for additional player-focused features in future versions.

---

## Audio

The application includes Zombies-inspired background music and sound effects.

Audio behavior can be controlled through the application's settings.

Current music selections include tracks inspired by the **Damned** themes from multiple Black Ops Zombies titles.

---

## Navigation

The primary application navigation contains:

* **Home**
* **Maps**
* **Favorites**
* **Profile**
* **Settings**

Additional pages are opened from these primary sections when needed.

---

## Technical Information

The Easter Egg Guide is a native Android application.

### Development Stack

* Java
* XML
* Android SDK
* AndroidX
* AppCompat
* Material Components
* ConstraintLayout
* SharedPreferences
* Gradle

### Android Configuration

* **Language Level:** Java 11
* **Minimum SDK:** 24
* **Target SDK:** 34
* **Compile SDK:** 36

---

## Project Structure

The application separates map information from the UI using map objects and game-specific map handlers.

Each map can contain:

```text
Map
├── Map Name
├── Map Icon
├── Main Quest
│   ├── Quest
│   └── Steps
├── Side Quests
│   ├── Quest
│   └── Steps
└── Buildables
    ├── Buildable
    └── Steps
```

Individual Call of Duty games use dedicated map handlers to organize their map data.

The central map handler combines this information so it can be displayed throughout the application.

---

## Data Storage

The application currently stores user-specific settings locally on the device using Android `SharedPreferences`.

Examples include:

* Favorite maps
* First-launch state
* Music preferences
* Sound preferences
* Other application settings

---

## Project Goal

The long-term goal of **The Easter Egg Guide** is to provide one convenient location for Zombies players to access the information they commonly need during a match.

Rather than filling a camera roll with screenshots or repeatedly searching through videos and websites, players should be able to quickly open the app and find the exact step, code, quest, buildable, or reference they need.

The project is intended to continue growing alongside new Treyarch Zombies releases.

---

## Development Status

The Easter Egg Guide is an actively developed personal software project.

Features, map information, user-interface elements, and supported Zombies content may change as development continues.

---

## Version History

### Version 1.0

**Date:** September 22, 2026

* Current base version of The Easter Egg Guide
* Map browsing system
* Main quest guides
* Side quest guides
* Buildable guides
* Favorites system
* Map recommendation feature
* Player profiles
* Application settings
* Music and sound controls
* Sharing functionality
* How to Play video support
