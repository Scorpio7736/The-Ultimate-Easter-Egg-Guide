package com.example.the_ultimate_easter_egg_guide.ToolsData;

import com.example.the_ultimate_easter_egg_guide.Models.Games;
import com.example.the_ultimate_easter_egg_guide.Models.Tools.ToolType;
import com.example.the_ultimate_easter_egg_guide.R;

import java.util.ArrayList;
import java.util.List;

public enum Tools {

    TEST_TOOL_1("Test Tool 1", "A tool for testing purposes.", R.drawable.default_test_image_2, ToolType.TEST),
    TEST_TOOL_2("Test Tool 2", "Another tool for testing.", R.drawable.default_test_image_3, ToolType.TEST),
    IN_GAME_NOTES("In Game Notes", "A quick game notes sheet", R.drawable.kronorium_pfp, ToolType.OTHER),
    Recommended_GUMS("Recommended Gobble Gums", "Get a Recommended set of Gums for maps", R.drawable.tools_gobblegumsicon, ToolType.OTHER),
    ICE_STAFF_QUICK_REF("Ice Staff Quick Ref.", "Quick reference to all steps to build and upgrade the Ice Staff", R.drawable.tool_icestaffquickref, ToolType.QUICK_REF),
    FIRE_STAFF_QUICK_REF("Fire Staff Quick Ref.", "Quick reference to all steps to build and upgrade the Fire Staff", R.drawable.tool_firestaffquickref, ToolType.QUICK_REF),
    WIND_STAFF_QUICK_REF("Wind Staff Quick Ref.", "Quick reference to all steps to build and upgrade the Wind Staff", R.drawable.tool_windstaffquickref, ToolType.QUICK_REF),
    LIGHTNING_STAFF_QUICK_REF("Lightning Staff Quick Ref.", "Quick reference to all steps to build and upgrade the Lightning Staff", R.drawable.tool_lightningstaffquickref, ToolType.QUICK_REF),
    BURIED_LANTERN_CODES("Buried Lantern Codes Quick Ref", "Quick refrence to all Buried lantern codes.", R.drawable.tools_buriedlanterncodes, ToolType.QUICK_REF),
    ;

    public final ToolType toolType;
    public final String toolName;
    public final String description;
    public final int icon;

    Tools(String toolName, String description, int icon, ToolType toolType) {
        this.toolName = toolName;
        this.description = description;
        this.icon = icon;
        this.toolType = toolType;
    }

}
