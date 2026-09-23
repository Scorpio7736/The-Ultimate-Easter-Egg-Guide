# Pages Architecture - UI & Controller Deep Dive

The `Pages` directory contains the Activity classes (Controllers) that drive the application's user interface. The architecture follows a strict inheritance model to ensure consistent behavior for navigation, transitions, and developmental states.

---

## 🏛️ Inheritance Hierarchy

### 1. The Foundation: `PageController_BaseClass`
The primary base class for every activity in the app. It provides global infrastructure:
- **`PageTransitionManager` Integration**: Automatically sets up fade-in/fade-out transitions for Activity starts and finishes.
- **Universal Background Control**: Centralized method (`SetThisBackground`) to swap map-themed backgrounds.
- **Filtering Core**: Implements `setupFilter()` and `setupGameFilter()` generic utilities. These use Reflection and Generics to build consistent, themed `Spinner` dropdowns for any Enum type (e.g., `Games`, `MapDataType`, `PlayerCount`).
- **Development Lifecycle**: 
    - **`ENABLE_TESTING`**: A global toggle that enables/disables developer-only features.
    - **Construction Blur**: Implements `enableConstructionBlur()`, which uses `RenderEffect` (API 31+) to blur content and overlay an "Under Construction" video for incomplete features.
    - **Prison Bars Overlay**: Displays `prisonbars_blur.png` on top of the blur but behind the video for visual consistency.

### 2. Navigation Layer: `NavPageController_BaseClass`
Inherits from the foundational base class and adds specialized logic for pages that belong to the main navigation flow (Home, Maps, Storyline, Tools):
- **Navigation Overlay**: Logic to "lift" the bottom navigation bar above the construction blur so users can always navigate away from incomplete pages.
- **Persistence**: Links the standard settings button and handles the "back-stack" logic for the main app pillars.

---

## 📂 Folder Structure

### Root Pages
Contains specific display activities that aren't part of the primary navigation tabs:
- **`MapDisplay_Page.java`**: The contextual hub for a map. It manages trailers, lore, and calculates entry counts for quests and buildables.
- **`EggDisplay_Page.java`**: A polymorphic guide renderer. It takes a list of `Procedure` objects and uses the `EggAdapter` to build recursive guide steps.
- **`QuickRefDisplay_PAGE.java`**: A full-screen image viewer for quick-reference guides.

### `Navigation/`
Controllers for the four main pillars of the app:
- **`Home_PAGE.java`**: Entry point, now featuring a cinematic, looping, muted video of `home_trailer.mp4`.
- **`MapsSelection_Page.java`**: The game-filtered entry point to the `Maps` enum registry.
- **`StorylineSelection_PAGE.java`**: The heavy-lifter for the Storyline database, using complex filtering for Characters, Items, and Locations.

### `Tools/`
Dedicated utilities that provide in-game value:
- **`RecommendGums_ToolPage.java`**: Uses the `GumSetAdapter` to display player-count specific GobbleGum strategies. Implements dual-filtering for `GobbleGumSetTypes` and `PlayerCount`.
- **`InGameNotes_ToolPage.java`**: A persistent notepad that saves user data locally using `SharedPreferences`.

---

## 🛰️ UI Data Flow: The Adapter System

The app utilizes specialized adapters to bridge complex data models to the UI:
- **`EggAdapter`**: Handles the recursive `ProcedureStep` model, dynamically inflating sub-steps and image galleries.
- **`GumSetAdapter`**: Renders multi-player strategies by dynamically inflating `gobble_gum_set_bar.xml` units based on the `playerCount` defined in `PlayerGumSets`.
- **`ToolAdapter`**: Manages the grid/list representation of available utilities.

---

## 🛰️ Page Communication: The Intent Pipeline

The app uses a standardized "Intent Protocol" to move data between controllers:
1. **`MAP_ID`**: The string key of a `Maps` enum constant.
2. **`CATEGORY`**: Defines what data subset to load (e.g., `MAIN_QUEST`, `BUILDABLES`).
3. **`GAME_FILTER`**: Passes the selected game context to ensure seamless transitions.

---
*Technical Note: When creating a new page, inherit from `NavPageController_BaseClass` if it requires the bottom nav bar, or `PageController_BaseClass` for standalone utilities.*
