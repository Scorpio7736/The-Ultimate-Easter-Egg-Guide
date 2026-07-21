package com.example.the_ultimate_easter_egg_guide.Models;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.the_ultimate_easter_egg_guide.Pages.AboutMe_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.CharacterDisplay_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.EggDisplay_Page;
import com.example.the_ultimate_easter_egg_guide.Pages.InGameNotes_ToolPage;
import com.example.the_ultimate_easter_egg_guide.Pages.MapDisplay_Page;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.Home_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.MapsSelection_Page;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.Settings_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.StorylineSelection_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.Tools_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.QuickRefDisplay_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.RecommendGums_ToolPage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.ArrayList;
import java.util.List;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class ConstructionStatusAuditTest {

    @Test
    public void auditUnderConstructionPages() {
        @SuppressWarnings("unchecked")
        Class<? extends PageController_BaseClass>[] pages = new Class[]{
                Home_PAGE.class,
                MapsSelection_Page.class,
                StorylineSelection_PAGE.class,
                Tools_PAGE.class,
                Settings_PAGE.class,
                MapDisplay_Page.class,
                EggDisplay_Page.class,
                CharacterDisplay_PAGE.class,
                QuickRefDisplay_PAGE.class,
                AboutMe_PAGE.class,
                RecommendGums_ToolPage.class,
                InGameNotes_ToolPage.class
        };

        // ANSI Color Codes
        String PURPLE = "\u001B[35m";
        String BLUE = "\u001B[34m";
        String YELLOW = "\u001B[33m";
        String RESET = "\u001B[0m";

        List<String[]> constructionDetails = new ArrayList<>();

        for (Class<? extends PageController_BaseClass> pageClass : pages) {
            try {
                PageController_BaseClass activity = Robolectric.buildActivity(pageClass).create().get();
                if (isUnderConstruction(activity)) {
                    String xmlName = getLayoutName(pageClass);
                    String controllerName = pageClass.getSimpleName();
                    constructionDetails.add(new String[]{xmlName, controllerName});
                }
            } catch (Exception e) {
                // Skip if activity fails to start
            }
        }

        if (!constructionDetails.isEmpty()) {
            System.out.println("\n### " + YELLOW + "UNDER CONSTRUCTION" + RESET + " Audit ###\n");

            // Calculate max column widths
            int maxXml = "XML Page".length();
            int maxController = "Page Controller".length();
            for (String[] detail : constructionDetails) {
                maxXml = Math.max(maxXml, detail[0].length() + 4); // +4 for .xml
                maxController = Math.max(maxController, detail[1].length() + 5); // +5 for .java
            }

            String format = "| %-" + maxXml + "s | %-" + maxController + "s | %-18s |%n";
            
            // Print Header
            System.out.format(format, "XML Page", "Page Controller", "Status");
            System.out.println("| " + "-".repeat(maxXml) + " | " + "-".repeat(maxController) + " | " + "-".repeat(18) + " |");

            // Print Rows
            for (String[] detail : constructionDetails) {
                String xml = PURPLE + detail[0] + ".xml" + RESET;
                String controller = BLUE + detail[1] + ".java" + RESET;
                String status = YELLOW + "UNDER CONSTRUCTION" + RESET;
                
                // Adjust format for ANSI codes (which don't take up space in the console but do in the string length)
                String rowXml = xml + " ".repeat(Math.max(0, maxXml - (detail[0].length() + 4)));
                String rowController = controller + " ".repeat(Math.max(0, maxController - (detail[1].length() + 5)));
                
                System.out.println("| " + rowXml + " | " + rowController + " | " + status + " |");
            }
            System.out.println();
        } else {
            System.out.println("\nAll pages are completed.\n");
        }
    }

    private String getLayoutName(Class<?> clazz) {
        if (clazz == Home_PAGE.class) return "home_page";
        if (clazz == MapsSelection_Page.class) return "maps_selection_page";
        if (clazz == StorylineSelection_PAGE.class) return "storyline_page";
        if (clazz == Tools_PAGE.class) return "tools_page";
        if (clazz == Settings_PAGE.class) return "settings_page";
        if (clazz == MapDisplay_Page.class) return "map_display_page";
        if (clazz == EggDisplay_Page.class) return "egg_display_page";
        if (clazz == CharacterDisplay_PAGE.class) return "character_display_page";
        if (clazz == QuickRefDisplay_PAGE.class) return "quick_ref_display_page";
        if (clazz == AboutMe_PAGE.class) return "about_me_page";
        if (clazz == InGameNotes_ToolPage.class) return "in_game_notes_tool_page";
        if (clazz == RecommendGums_ToolPage.class) return "recommend_gums_tool_page";
        return "unknown";
    }

    private boolean isUnderConstruction(PageController_BaseClass activity) {
        ViewGroup rootView = activity.findViewById(android.R.id.content);
        if (rootView == null) return false;

        // The construction blur adds a FrameLayout overlay that is clickable and focusable
        for (int i = 0; i < rootView.getChildCount(); i++) {
            View child = rootView.getChildAt(i);
            if (child instanceof FrameLayout && child.isClickable() && child.isFocusable()) {
                // Additionally check if it contains a MaterialCardView or VideoView to be sure
                // but the clickable/focusable FrameLayout on root is the key indicator we implemented.
                return true;
            }
        }
        return false;
    }
}
