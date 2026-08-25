# Pages Architecture - UI & Controller Deep Dive

The `Pages` directory contains the Activity classes (Controllers) that drive the application's user interface. The architecture follows a strict inheritance model to ensure consistent behavior for navigation, transitions, and developmental states.

---

## 🏛️ Inheritance Hierarchy

### 1. The Foundation: `PageController_BaseClass`
The primary base class for every activity in the app. It provides global infrastructure:
- **`PageTransitionManager` Integration**: Automatically sets up fade-in/fade-out transitions for Activity starts and finishes.
- **Universal Background Control**: Centralized method (`SetThisBackground`) to swap map-themed backgrounds.
- **Development Lifecycle**: 
    - **`ENABLE_TESTING`**: A global toggle that enables/disables developer-only features.
    - **Construction Blur**: Implements `enableConstructionBlur()`, which uses `RenderEffect` (API 31+) to blur content and overlay an "Under Construction" video for incomplete features.
- **Support Action Bar Management**: Automatically hides the default ActionBar to allow for custom, immersive headers.

### 2. Navigation Layer: `NavPageController_BaseClass`
Inherits from the foundational base class and adds specialized logic for pages that belong to the main navigation flow (Home, Maps, Storyline, Tools):
- **Navigation Overlay**: Logic to "lift" the bottom navigation bar above the construction blur so users can always navigate away from incomplete pages.
- **Generic Filtering System**: Provides `setupFilter()` and `setupGameFilter()` utilities. These leverage enums and `ArrayAdapter` to build consistent, themed dropdown menus for data searching.
- **Persistence**: Links the standard settings button and handles the "back-stack" logic for the main app pillars.

---

## 📂 Folder Structure

### Root Pages
Contains specific display activities that aren't part of the primary navigation tabs:
- **`MapDisplay_Page.java`**: The contextual hub for a map. It manages trailers, lore, and calculates entry counts for quests and buildables.
- **`EggDisplay_Page.java`**: A polymorphic guide renderer. It takes a list of `Procedure` objects and uses the `EggAdapter` to build recursive guide steps.
- **`QuickRefDisplay_PAGE.java`**: A full-screen image viewer for quick-reference guides (e.g., Staff codes).

### `Navigation/`
Controllers for the four main pillars of the app:
- **`Home_PAGE.java`**: Entry point, handling the dashboard and featured content.
- **`MapsSelection_Page.java`**: The game-filtered entry point to the `Maps` enum registry.
- **`StorylineSelection_PAGE.java`**: The heavy-lifter for the Storyline database, using complex filtering for Characters, Items, and Locations.

### `Tools/`
Dedicated utilities that provide in-game value beyond static guides:
- **`RecommendGums_ToolPage.java`**: Uses the `GumSetAdapter` to display player-count specific GobbleGum strategies.
- **`InGameNotes_ToolPage.java`**: A persistent notepad that saves user data locally using `SharedPreferences`.

---

## 🛰️ Page Communication: The Intent Pipeline

The app uses a standardized "Intent Protocol" to move data between controllers:
1. **`MAP_ID`**: The string key of a `Maps` enum constant.
2. **`CATEGORY`**: Defines what data subset to load (e.g., `MAIN_QUEST`, `SIDE_QUESTS`, `BUILDABLES`).
3. **`GAME_FILTER`**: Passes the selected game context to ensure seamless transitions (e.g., clicking a character from BOII stays in the BOII context).

## 🛡️ Developer Mode & Testing

Activities leverage the `excludeFromDevMode()` flag. If a page is marked as "Excluded," the construction blur will be ignored during development (`ENABLE_TESTING = true`), allowing developers to interact with and test the UI elements of a feature that is not yet ready for production release.

---
*Note: When creating a new page, inherit from `NavPageController_BaseClass` if it requires the bottom nav bar, or `PageController_BaseClass` for standalone utilities.*
