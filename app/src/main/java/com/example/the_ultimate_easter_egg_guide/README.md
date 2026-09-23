# Technical Manifest - Ultimate Easter Egg Guide

This package contains the primary source code for the "The Ultimate Easter Egg Guide" Android application.

## 🏛️ Core Design Patterns

### 1. Warehouse-Controller Pattern
The project strictly separates data definition from UI rendering. Data is stored in specialized warehouse classes (`MapDataWarehouse`, `StorylineData`), and UI controllers (`Pages`) consume this data through standardized interfaces and adapters.

### 2. Polymorphic Procedure Framework
Guides are not hard-coded strings. They are objects built on the `Procedure` and `ProcedureStep` models. 
- **Recursive Navigation**: `ProcedureStep` can contain other `ProcedureStep` objects, allowing the `EggAdapter` to render complex, nested logic.
- **Subclassing**: `EasterEgg` and `Buildable` extend `Procedure` to provide semantic clarity while reusing the same rendering engine.

### 3. Inheritance-Driven UI
All Activity classes inherit from `PageController_BaseClass`.
- **Global States**: Provides the "Construction Blur" infrastructure for under-development features.
- **Contextual UI**: Handles automatic background switching and themed transitions.
- **Generic Filtering**: Implements the `setupFilter` logic to handle any Enum-based selection UI.

## 📂 Sub-Module Directory

| Module | Responsibility | Key Component |
| :--- | :--- | :--- |
| **`Models/`** | Core interfaces and base classes. | `Procedure`, `IStorylineItems` |
| **`Helper/`** | Adapters, Managers, and utility logic. | `MusicManager`, `EggAdapter` |
| **`Pages/`** | UI Controllers (Activities). | `MapDisplay_Page`, `Home_PAGE` |
| **`MapData/`** | Registry for Map and Guide data. | `Maps`, `MapDataWarehouse` |
| **`StorylineData/`**| Lore database (Characters, Items). | `Player_Characters`, `Enemy_Creatures` |
| **`ToolsData/`** | Configuration for interactive utilities. | `PlayerGumSets`, `Tools` |

## 🛡️ Stability & Auditing
The application uses the **`MasterAuditTest`** suite as a quality gate. It performs deep recursive scans of the guide warehouses to detect placeholder assets, missing descriptions, or broken links before production builds are finalized.

---
*Developer Note: To add new content, define the raw data in the appropriate warehouse module and register it in the corresponding Enum (`Maps`, `Player_Characters`, etc.).*
