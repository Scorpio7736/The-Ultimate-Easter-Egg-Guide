# StorylineData Architecture - The Lore Engine

The `StorylineData` directory is a comprehensive, contract-driven lore database. It manages the metadata for every character, item, creature, and organization within the Call of Duty Zombies universe, using a strict interface-based approach for maximum UI flexibility.

---

## 🧬 Core Technical Design

### 1. The Contract: `IStorylineItems`
Every data point in this directory must implement the `IStorylineItems` interface. This ensures that regardless of whether an object is a "Demon" or a "Ray Gun", the UI layer knows exactly how to retrieve its:
- **`GetImage()`**: The drawable resource ID for the profile picture.
- **`GetDisplayName()`**: The user-friendly name.
- **`GetGroup()`**: The category constant used for header grouping (e.g., `Player_CharacterGroups.Primis`).

### 2. Enum-Based Persistence
The data is stored in specialized **Enums** rather than a traditional SQLite or JSON database.
- **Performance**: Provides O(1) lookup time for specific constants.
- **Compile-Time Safety**: Prevents broken references to images or game titles.
- **No Overhead**: Eliminates the need for complex database migrations or asynchronous loading for core metadata.

---

## 📂 Data Domains

The warehouse is categorized into six high-level domains:

- **`CharacterData/`**: Split into `Player_Characters` (the controllable crews) and `NonPlayer_Characters` (Doctor Monty, Maxis, etc.).
- **`ItemsData/`**: Definitions for lore-significant items, including the *Summoning Key*, *Focusing Stone*, and various *Wonder Weapons*.
- **`CreaturesData/`**: Categorizes entities into `Enemy_Creatures` (Margwas, Panzers) and `Friendly_Creatures` (Keeper Protectors).
- **`MapsData/`**: Contains the `StorylineMaps` enum, which provides lore context for maps independent of their guide data.
- **`OrganizationsData/`**: Tracks factions and groups like *Division 9*, *Broken Arrow*, and the *Ascension Group*.
- **`CodZombiesYoutubersData/`**: A community-focused domain linking the guide to prominent community figures.

---

## 🔍 Filtering & Rendering Logic

### `StorylineSelection_PAGE` Integration
The Storyline page uses a dual-spinner system (Category and Game Filter).
1. **Category Selection**: Determines which Enum class to load (e.g., `StorylineItems.PlayerCharacter` -> `Player_Characters.class`).
2. **Game Filtering**: Every entry contains a `List<Games> gamesList`. The `StorylineCharacterAdapter` iterates through the enum and filters items that appear in the selected game.
3. **Grouping**: The adapter uses `GetGroup()` to determine where to insert stylized headers (e.g., "Primis", "Ultimis") using `TYPE_HEADER` view types.

### Dynamic URL Generation
Most entries include a `fandomPath` string. The enum's internal logic automatically prepends the official Fandom base URL, enabling one-click navigation via `Intent.ACTION_VIEW` to deep-lore wiki pages.

---

## 🛡️ Verification & Audits

The **`MasterAuditTest`** performs a high-depth scan of this directory to ensure:
- **Image Validity**: No entry is missing an image or using a dead reference.
- **Placeholder Detection**: Flags any entry using the `app_icon` fallback.
- **Testing Guard**: Automatically handles the `TEST` category constants, ensuring they never appear in production builds unless `ENABLE_TESTING` is active.

---
*Technical Note: When adding new lore, ensure the enum constant follows the `NAME_SCHEMA` to maintain consistency with the auto-generated documentation and audit reports.*
