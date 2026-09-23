# The Ultimate Easter Egg Guide

An unofficial, high-fidelity community-driven Android companion app for **Call of Duty Zombies**.

The goal of this project is to centralize high-quality guide data, interactive tools, and comprehensive storyline references into a single, immersive mobile experience.

---

## 🚀 Key Features

### 📖 Immersive Guides
- **Recursive Logic**: Guides for Main Quests, Side Quests, and Buildables are built using a recursive "Procedure" framework, allowing for infinitely nested sub-steps and image galleries.
- **Cinematic Experience**: Map entries feature high-quality trailers and lore descriptions.
- **Dynamic Assets**: Every step can hold multiple high-resolution images, providing visual clarity during intense gameplay.

### 🧬 Comprehensive Storyline
- **The Lore Engine**: A massive, contract-driven database of Characters (Player & NPC), Items, Locations, and Organizations.
- **Smart Filtering**: Instantly filter hundreds of lore entries by game title (e.g., "Show only BOII characters").
- **Fandom Integration**: One-tap navigation to deep-lore wiki pages for every entity.

### 🛠️ Professional Utility Tools
- **Recommended Gums**: Multi-player optimized GobbleGum strategies (1-4 players) with dynamic team-based layouts.
- **In-Game Notes**: A local, persistent notepad for tracking game codes or personal progress.
- **Quick Reference**: Instant access to complexStaff codes, patterns, and cyphers.

---

## 🏗️ Technical Architecture

This project is built with a decoupled "Warehouse Pattern," ensuring the UI logic is completely separated from the raw guide data.

### Project Layout
- **[`MapData/`](file:///app/src/main/java/com/example/the_ultimate_easter_egg_guide/MapData/MapData_README.md)**: The "Brain" of the app. Contains the registries for maps, quests, and buildables.
- **[`Pages/`](file:///app/src/main/java/com/example/the_ultimate_easter_egg_guide/Pages/Pages_README.md)**: The "Controllers". Manages the UI lifecycle, transitions, and construction states.
- **[`StorylineData/`](file:///app/src/main/java/com/example/the_ultimate_easter_egg_guide/StorylineData/StorylineData_README.md)**: The "Lore Engine". Interface-driven metadata for the Zombies universe.
- **[`ToolsData/`](file:///app/src/main/java/com/example/the_ultimate_easter_egg_guide/ToolsData/ToolsData_README.md)**: The "Utility Config". Configuration for GobbleGum sets and interactive tools.

### Core Frameworks
- **Procedure System**: A polymorphic inheritance model (`Procedure` -> `EasterEgg`, `Buildable`) that drives the guide rendering engine.
- **Nav Core**: A strict inheritance hierarchy (`PageController_BaseClass` -> `NavPageController_BaseClass`) managing universal backgrounds, fade transitions, and developmental constructions.
- **Audit Engine**: A robust test suite (**`MasterAuditTest`**) that performs recursive data-integrity scans to identify missing assets or incomplete guides.

---

## 🛠️ Build Requirements

- **IDE**: Android Studio
- **SDK**: Android SDK 36 (Compile), API 24 (Minimum)
- **Language**: Java 11 (LTS)
- **UI Framework**: AndroidX, Material Design 3 (M3)

---

## 📜 Intellectual Property Notice

**The Ultimate Easter Egg Guide is an unofficial fan project.**
This project is not affiliated with Activision, Treyarch, or Microsoft. All rights to the Call of Duty Zombies franchise belong to their respective owners. Content is presented for identification, documentation, and reference purposes under Fair Use.

---

## ✨ Credits

Developed by **Jack London / Scorpio7736** and the Call of Duty Zombies community. Special thanks to the **Call of Duty Fandom Wiki** and **COD Zombies Tracker** for their invaluable research and documentation.
