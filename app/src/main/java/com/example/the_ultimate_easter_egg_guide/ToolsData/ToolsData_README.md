# ToolsData Architecture - The Utility Engine

The `ToolsData` directory manages the configuration, metadata, and user-facing data for the application's interactive utilities. This includes GobbleGum databases, recommended strategy sets, and general tool registries.

---

## 🛠️ Tool Registry: `Tools.java`
A centralized enum that defines every utility available in the app.
- **Classification**: Linked to a `ToolType` (e.g., `UTILITY`, `QUICK_REF`, `TEST`).
- **Navigation Binding**: Each constant specifies its target Activity class, allowing the `Tools_PAGE` to dynamically build its menu.
- **Developer Guard**: Tools marked as `ToolType.TEST` are automatically filtered out in production builds.

---

## 🍬 GobbleGum Database: `GobbleGums.java`
A comprehensive registry of every GobbleGum available in Black Ops III.
- **Metadata**: Stores the display name, icon resource, and association with a specific `Games` constant.
- **Typing**: Each gum is categorized by `GobbleGumTypes` (Classic, Mega, Whimsical) and assigned a `GobbleGumColors` for UI consistency.

---

## 📋 Recommended Strategies: `PlayerGumSets.java`
This is the data warehouse for optimal team and solo setups.
- **Multi-Player Support**: Uses the `playerCount` (1-4) to determine the size of the recommendation.
- **Polymorphic Sets**: Stores a `List<GobbleGumSet>`, where each set corresponds to a specific player's 5-gum layout.
- **Categorization**: Linked to `GobbleGumSetTypes` (e.g., *Classic Only*, *Mega and Below*) for efficient user filtering.

---

## 🚀 Data-to-UI Integration

### `GumSetAdapter` Pipeline
When a user selects a recommendation set:
1. **Filtering**: The `RecommendGums_ToolPage` filters the `PlayerGumSets` enum based on the selected `SetType` and `PlayerCount`.
2. **Inflation**: The `GumSetAdapter` iterates through the list. For each entry, it dynamically inflates a `gobble_gum_set_bar.xml` for **each player** defined in the set.
3. **Binding**: The 5 icons and names are bound to each bar, providing a clean visual layout of the entire team's strategy.

---

## 🛡️ Verification & Audits

The **`MasterAuditTest`** performs two specialized checks for this directory:
1. **Asset Audit**: Verifies that every `GobbleGum` has a valid icon and is not using the `app_icon` placeholder.
2. **Completeness Audit**: Scans BOIII maps to ensure every map has at least one recommended set for every production `GobbleGumSetType`.

---
*Technical Note: When adding new gum sets, ensure the `playerCount` integer matches the number of `GobbleGumSet` objects provided in the constructor.*
