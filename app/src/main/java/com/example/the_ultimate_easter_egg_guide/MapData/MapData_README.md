# MapData Architecture - Technical Deep Dive

The `MapData` directory is a highly structured guide repository designed for massive scalability, strict data typing, and automated integrity verification. It implements a decoupled data-warehouse pattern that separates raw guide content from UI logic.

---

## 🏗️ Architectural Layers

### 1. The Central Registry: `Maps.java`
At the heart of the warehouse is the `Maps` enum. This is the **Source of Truth** for every map in the application. Each enum constant encapsulates:
- **Metatdata**: Internal name, display name, and lore description (`R.string`).
- **Assets**: Cover images (`R.drawable`) and trailer videos (`R.raw`).
- **Classification**: Linked to a `Games` constant and a `MapType` (e.g., *Group 935*, *Broken Arrow*) for contextual UI styling.
- **Data Binding**: A direct reference to a `MapData` object provided by the Game Warehouse layer.

### 2. The Game Warehouse Layer: `[GAME]_MapDataWarehouse.java`
Each game (BOI, BOII, WAW, etc.) has its own aggregator class. These classes are responsible for:
- **Dependency Injection**: They import specialized lists from the sub-packages.
- **Object Instantiation**: They construct the `MapData` container, which groups `Main Quests`, `Side Quests`, and `Buildables`.
- **Isolation**: Changes to one game's data never affect another, preventing merge conflicts in a multi-developer environment.

### 3. The Data Leaf Nodes: Sub-Packages
Content is further subdivided into map-specific files to keep file sizes manageable:
- **`EasterEggs/`**: Files like `SOE_EasterEggs.java` define guides using the `EasterEgg` model (inherited from `Procedure`).
- **`Buildables/`**: Files like `DerEisendrache_Buildables.java` define utility guides using the `Buildable` model.
- **`Glitches/`**: Reserved for map exploits.

---

## 🧬 The Procedure Framework

All guides are built upon a recursive model hierarchy:
- **`Procedure`**: The root container holding a `name`, an optional `outcome`, and a `List<ProcedureStep>`.
- **`ProcedureStep`**: A recursive unit that holds a description and an optional list of `subSteps`. This allows for infinite nesting of instructions.
- **Images**: Each step can store multiple `ImageID` references. If a step is defined without an image, it is treated as a text-only instruction.

---

## 🚀 Data-to-UI Pipeline

When a user selects a map, the following technical sequence occurs:
1. **Selection**: The `MAP_ID` (string name of the `Maps` constant) is passed via Intent.
2. **Lookup**: The target page performs `Maps.valueOf(mapId)` to retrieve the full enum constant.
3. **Extraction**: The page accesses `selectedMap.eggData` to retrieve the `MapData` object.
4. **Rendering**: The list of `Procedure` objects is passed to the `EggAdapter`. The adapter uses the recursive structure of `ProcedureStep` to dynamically build the UI rows, labels, and image galleries.

---

## 🛡️ Integrity & Verification

Because the data is so strictly structured, we leverage the **`MasterAuditTest`** to ensure production readiness:
- **Deep Recursion**: The audit scans every `Procedure` down to the deepest `subStep`.
- **Placeholder Detection**: It flags any step using `R.drawable.app_icon` or "INSERT HERE" strings.
- **Completeness**: It ensures every map has at least one Main Quest and that all BOIII maps have a full set of Recommended Gums for every player count.

---

## 🛠️ Developer Workflow: Adding a Map
To maintain this architecture, follow these steps:
1.  **Define Steps**: Create new classes in the game's `EasterEggs/` and `Buildables/` folders.
2.  **Update Game Warehouse**: Instantiate the `MapData` object in `[GAME]_MapDataWarehouse.java`.
3.  **Register Map**: Add a new constant to `Maps.java` with the required metadata and the reference to the warehouse data.
4.  **Audit**: Run the `MasterAuditTest`. If it passes, the data is correctly linked and asset-complete.
