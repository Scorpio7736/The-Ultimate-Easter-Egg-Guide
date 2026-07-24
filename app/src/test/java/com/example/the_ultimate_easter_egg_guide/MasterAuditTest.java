package com.example.the_ultimate_easter_egg_guide;

import static android.graphics.Color.GREEN;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.MapData.MapsWarehouse;
import com.example.the_ultimate_easter_egg_guide.Models.Games;
import com.example.the_ultimate_easter_egg_guide.Models.PageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.IStorylineItems;
import com.example.the_ultimate_easter_egg_guide.Pages.AboutMe_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.ContactUs_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.EggDisplay_Page;
import com.example.the_ultimate_easter_egg_guide.Pages.MapDisplay_Page;
import com.example.the_ultimate_easter_egg_guide.Pages.QuickRefDisplay_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.Tools.InGameNotes_ToolPage;
import com.example.the_ultimate_easter_egg_guide.Pages.Tools.RecommendGums_ToolPage;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.Home_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.MapsSelection_Page;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.Settings_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.StorylineSelection_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.Tools_PAGE;
import com.example.the_ultimate_easter_egg_guide.StorylineData.CharacterData.NonPlayer_Characters;
import com.example.the_ultimate_easter_egg_guide.StorylineData.CharacterData.Player_Characters;
import com.example.the_ultimate_easter_egg_guide.StorylineData.CodZombiesYoutubersData.CodZombies_Youtubers;
import com.example.the_ultimate_easter_egg_guide.StorylineData.CreaturesData.Enemy_Creatures;
import com.example.the_ultimate_easter_egg_guide.StorylineData.CreaturesData.Friendly_Creatures;
import com.example.the_ultimate_easter_egg_guide.StorylineData.ItemsData.Items;
import com.example.the_ultimate_easter_egg_guide.StorylineData.MapsData.StorylineMaps;
import com.example.the_ultimate_easter_egg_guide.StorylineData.OrganizationsData.Organizations;
import com.example.the_ultimate_easter_egg_guide.ToolsData.GobbleGums_boiii;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.ArrayList;
import java.util.List;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class MasterAuditTest {

    private static final StringBuilder fullReport = new StringBuilder();
    
    // ANSI Color Codes
    private static final String PURPLE = "\u001B[35m";
    private static final String BLUE = "\u001B[34m";
    private static final String YELLOW = "\u001B[33m";
    private static final String RESET = "\u001B[0m";

    @AfterClass
    public static void printFinalReport() {
        System.out.println("\n=================================================================");
        System.out.println("                   " + YELLOW + "MASTER PROJECT AUDIT REPORT" + RESET);
        System.out.println("=================================================================");
        System.out.print(fullReport.toString());
        System.out.println("=================================================================\n");
    }

    @Test
    public void audit1_ConstructionStatus() {

        @SuppressWarnings("unchecked")
        Class<? extends PageController_BaseClass>[] pages = new Class[]{
                Home_PAGE.class,
                MapsSelection_Page.class,
                StorylineSelection_PAGE.class,
                Tools_PAGE.class,
                Settings_PAGE.class,
                MapDisplay_Page.class,
                EggDisplay_Page.class,
                QuickRefDisplay_PAGE.class,
                AboutMe_PAGE.class,
                RecommendGums_ToolPage.class,
                InGameNotes_ToolPage.class,
                ContactUs_PAGE.class
        };

        List<String[]> failures = new ArrayList<>();
        int pagesChecked = 0;

        for (Class<? extends PageController_BaseClass> pageClass : pages) {

            pagesChecked++;

            try {
                PageController_BaseClass activity =
                        Robolectric.buildActivity(pageClass)
                                .create()
                                .get();

                if (isUnderConstruction(activity)) {
                    failures.add(new String[]{
                            getLayoutName(pageClass) + ".xml",
                            pageClass.getSimpleName() + ".java",
                            "UNDER CONSTRUCTION"
                    });
                }

            } catch (Exception exception) {
                failures.add(new String[]{
                        getLayoutName(pageClass) + ".xml",
                        pageClass.getSimpleName() + ".java",
                        "AUDIT ERROR"
                });
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append("\n");
        sb.append("============================================================\n");
        sb.append(YELLOW)
                .append("               CONSTRUCTION STATUS AUDIT")
                .append(RESET)
                .append("\n");
        sb.append("============================================================\n\n");

        sb.append("Pages Checked : ")
                .append(pagesChecked)
                .append("\n");

        sb.append("Issues Found  : ")
                .append(failures.isEmpty() ? GREEN : YELLOW)
                .append(failures.size())
                .append(RESET)
                .append("\n\n");

        if (!failures.isEmpty()) {

            int maxXml = "XML Page".length();
            int maxController = "Page Controller".length();
            int maxStatus = "Status".length();

            for (String[] failure : failures) {
                maxXml = Math.max(maxXml, failure[0].length());
                maxController = Math.max(maxController, failure[1].length());
                maxStatus = Math.max(maxStatus, failure[2].length());
            }

            String separator =
                    "+-" + "-".repeat(maxXml) +
                            "-+-" + "-".repeat(maxController) +
                            "-+-" + "-".repeat(maxStatus) +
                            "-+\n";

            sb.append(separator);

            sb.append(String.format(
                    "| %-" + maxXml + "s | %-" + maxController + "s | %-" + maxStatus + "s |%n",
                    "XML Page",
                    "Page Controller",
                    "Status"
            ));

            sb.append(separator);

            for (String[] failure : failures) {

                sb.append("| ")
                        .append(PURPLE)
                        .append(failure[0])
                        .append(RESET)
                        .append(" ".repeat(maxXml - failure[0].length()))
                        .append(" | ")

                        .append(BLUE)
                        .append(failure[1])
                        .append(RESET)
                        .append(" ".repeat(maxController - failure[1].length()))
                        .append(" | ")

                        .append(YELLOW)
                        .append(failure[2])
                        .append(RESET)
                        .append(" ".repeat(maxStatus - failure[2].length()))
                        .append(" |\n");
            }

            sb.append(separator);

            sb.append("\n")
                    .append(YELLOW)
                    .append("WARNING: ")
                    .append(failures.size())
                    .append(
                            failures.size() == 1
                                    ? " page requires attention."
                                    : " pages require attention."
                    )
                    .append(RESET)
                    .append("\n");

        } else {

            sb.append(GREEN)
                    .append("PASS: All pages are completed.")
                    .append(RESET)
                    .append("\n");
        }

        fullReport.append(sb).append("\n");
    }

    @Test
    public void audit2_StorylineItems() {

        List<AuditResult> failures = new ArrayList<>();

        checkEnum(Enemy_Creatures.values(), failures);
        checkEnum(Friendly_Creatures.values(), failures);
        checkEnum(NonPlayer_Characters.values(), failures);
        checkEnum(Player_Characters.values(), failures);
        checkEnum(Items.values(), failures);
        checkEnum(StorylineMaps.values(), failures);
        checkEnum(Organizations.values(), failures);
        checkEnum(CodZombies_Youtubers.values(), failures);

        StringBuilder sb = new StringBuilder();

        sb.append("\n");
        sb.append("============================================================\n");
        sb.append(YELLOW)
                .append("                STORYLINE IMAGE AUDIT")
                .append(RESET)
                .append("\n");
        sb.append("============================================================\n\n");

        sb.append("Issues Found : ")
                .append(failures.isEmpty() ? GREEN : YELLOW)
                .append(failures.size())
                .append(RESET)
                .append("\n\n");

        if (!failures.isEmpty()) {

            int maxCategory = "Category".length();
            int maxItem = "Item".length();
            int maxStatus = "Status".length();

            for (AuditResult result : failures) {
                maxCategory = Math.max(maxCategory, result.category.length());
                maxItem = Math.max(maxItem, result.itemName.length());
                maxStatus = Math.max(maxStatus, result.reason.length());
            }

            String separator =
                    "+-" + "-".repeat(maxCategory) +
                            "-+-" + "-".repeat(maxItem) +
                            "-+-" + "-".repeat(maxStatus) +
                            "-+\n";

            sb.append(separator);

            sb.append(String.format(
                    "| %-" + maxCategory + "s | %-" + maxItem + "s | %-" + maxStatus + "s |%n",
                    "Category",
                    "Item",
                    "Status"
            ));

            sb.append(separator);

            for (AuditResult result : failures) {

                sb.append("| ")
                        .append(BLUE)
                        .append(result.category)
                        .append(RESET)
                        .append(" ".repeat(maxCategory - result.category.length()))
                        .append(" | ")

                        .append(PURPLE)
                        .append(result.itemName)
                        .append(RESET)
                        .append(" ".repeat(maxItem - result.itemName.length()))
                        .append(" | ")

                        .append(YELLOW)
                        .append(result.reason)
                        .append(RESET)
                        .append(" ".repeat(maxStatus - result.reason.length()))
                        .append(" |\n");
            }

            sb.append(separator);

            sb.append("\n")
                    .append(YELLOW)
                    .append("WARNING: ")
                    .append(failures.size())
                    .append(
                            failures.size() == 1
                                    ? " storyline item has an invalid or placeholder image."
                                    : " storyline items have invalid or placeholder images."
                    )
                    .append(RESET)
                    .append("\n");

        } else {

            sb.append(GREEN)
                    .append("PASS: All storyline items have valid images.")
                    .append(RESET)
                    .append("\n");
        }

        fullReport.append(sb).append("\n");
    }

    @Test
    public void audit3_MapData() {

        List<MapAuditResult> failures = new ArrayList<>();
        int totalMapsChecked = 0;

        for (Games game : Games.values()) {

            if (game == Games.Test) {
                continue;
            }

            List<Maps> maps = MapsWarehouse.getMapsForGame(game);

            for (Maps map : maps) {

                totalMapsChecked++;

                List<String> issues = new ArrayList<>();

                if (map.mapCover <= 0 || map.mapCover == R.drawable.app_icon) {
                    issues.add("MISSING COVER");
                }

                if (map.mapDescription <= 0) {
                    issues.add("MISSING DESCRIPTION");
                }

                if (map.mapTrailer == -1) {
                    issues.add("MISSING TRAILER");
                }

                if (map.eggData == null) {
                    issues.add("MISSING EGG DATA");
                }

                if (!issues.isEmpty()) {
                    failures.add(new MapAuditResult(
                            map.name(),
                            game.gameName,
                            String.join(", ", issues)
                    ));
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append("\n");
        sb.append("============================================================\n");
        sb.append(YELLOW)
                .append("                    MAP DATA AUDIT")
                .append(RESET)
                .append("\n");
        sb.append("============================================================\n\n");

        sb.append("Maps Checked : ")
                .append(totalMapsChecked)
                .append("\n");

        sb.append("Issues Found : ")
                .append(failures.isEmpty() ? GREEN : YELLOW)
                .append(failures.size())
                .append(RESET)
                .append("\n\n");

        if (!failures.isEmpty()) {

            int maxMap = "Map".length();
            int maxGame = "Game".length();
            int maxIssue = "Issues".length();

            for (MapAuditResult result : failures) {
                maxMap = Math.max(maxMap, result.mapName.length());
                maxGame = Math.max(maxGame, result.gameName.length());
                maxIssue = Math.max(maxIssue, result.issues.length());
            }

            String separator =
                    "+-" + "-".repeat(maxMap) +
                            "-+-" + "-".repeat(maxGame) +
                            "-+-" + "-".repeat(maxIssue) +
                            "-+\n";

            sb.append(separator);

            sb.append(String.format(
                    "| %-" + maxMap + "s | %-" + maxGame + "s | %-" + maxIssue + "s |%n",
                    "Map",
                    "Game",
                    "Issues"
            ));

            sb.append(separator);

            for (MapAuditResult result : failures) {

                sb.append("| ")
                        .append(PURPLE)
                        .append(result.mapName)
                        .append(RESET)
                        .append(" ".repeat(maxMap - result.mapName.length()))
                        .append(" | ")

                        .append(BLUE)
                        .append(result.gameName)
                        .append(RESET)
                        .append(" ".repeat(maxGame - result.gameName.length()))
                        .append(" | ")

                        .append(YELLOW)
                        .append(result.issues)
                        .append(RESET)
                        .append(" ".repeat(maxIssue - result.issues.length()))
                        .append(" |\n");
            }

            sb.append(separator);

            sb.append("\n")
                    .append(YELLOW)
                    .append("WARNING: ")
                    .append(failures.size())
                    .append(
                            failures.size() == 1
                                    ? " map has incomplete data."
                                    : " maps have incomplete data."
                    )
                    .append(RESET)
                    .append("\n");

        } else {

            sb.append(GREEN)
                    .append("PASS: All map data is complete.")
                    .append(RESET)
                    .append("\n");
        }

        fullReport.append(sb).append("\n");
    }

    @Test
    public void audit4_GobbleGums() {

        List<GumAuditResult> failures = new ArrayList<>();
        int totalGumsChecked = 0;

        for (GobbleGums_boiii gum : GobbleGums_boiii.values()) {

            if (gum.game == Games.Test || gum.name().equalsIgnoreCase("TEST")) {
                continue;
            }

            totalGumsChecked++;

            if (gum.gumCover <= 0 || gum.gumCover == R.drawable.app_icon) {
                failures.add(new GumAuditResult(
                        "GobbleGums_boiii.java",
                        gum.name(),
                        gum.gumName,
                        "PLACEHOLDER"
                ));
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append("\n");
        sb.append("============================================================\n");
        sb.append(YELLOW)
                .append("                GOBBLEGUM IMAGE AUDIT")
                .append(RESET)
                .append("\n");
        sb.append("============================================================\n\n");

        sb.append("GobbleGums Checked : ")
                .append(totalGumsChecked)
                .append("\n");

        sb.append("Issues Found       : ")
                .append(failures.isEmpty() ? GREEN : YELLOW)
                .append(failures.size())
                .append(RESET)
                .append("\n\n");

        if (!failures.isEmpty()) {

            int maxFile = "File".length();
            int maxGum = "Gum".length();
            int maxStatus = "Status".length();

            for (GumAuditResult result : failures) {
                maxFile = Math.max(maxFile, result.sourceFile.length());
                maxGum = Math.max(maxGum, result.gumName.length());
                maxStatus = Math.max(maxStatus, result.status.length());
            }

            String separator =
                    "+-" + "-".repeat(maxFile) +
                            "-+-" + "-".repeat(maxGum) +
                            "-+-" + "-".repeat(maxStatus) +
                            "-+\n";

            sb.append(separator);

            sb.append(String.format(
                    "| %-" + maxFile + "s | %-" + maxGum + "s | %-" + maxStatus + "s |%n",
                    "File",
                    "Gum",
                    "Status"
            ));

            sb.append(separator);

            for (GumAuditResult result : failures) {

                sb.append("| ")
                        .append(BLUE)
                        .append(result.sourceFile)
                        .append(RESET)
                        .append(" ".repeat(maxFile - result.sourceFile.length()))
                        .append(" | ")

                        .append(PURPLE)
                        .append(result.gumName)
                        .append(RESET)
                        .append(" ".repeat(maxGum - result.gumName.length()))
                        .append(" | ")

                        .append(YELLOW)
                        .append(result.status)
                        .append(RESET)
                        .append(" ".repeat(maxStatus - result.status.length()))
                        .append(" |\n");
            }

            sb.append(separator);

            sb.append("\n")
                    .append(YELLOW)
                    .append("WARNING: ")
                    .append(failures.size())
                    .append(
                            failures.size() == 1
                                    ? " GobbleGum is using a placeholder image."
                                    : " GobbleGums are using placeholder images."
                    )
                    .append(RESET)
                    .append("\n");

        } else {

            sb.append(GREEN)
                    .append("PASS: All GobbleGums have valid images.")
                    .append(RESET)
                    .append("\n");
        }

        fullReport.append(sb).append("\n");
    }

    @Test
    public void audit5_MapDescriptionPlaceholders() {

        List<MapAuditResult> failures = new ArrayList<>();
        int totalMapsChecked = 0;

        for (Games game : Games.values()) {

            if (game == Games.Test) {
                continue;
            }

            List<Maps> maps = MapsWarehouse.getMapsForGame(game);

            for (Maps map : maps) {

                totalMapsChecked++;

                if (map.mapDescription == R.string.general_placeholder_mapdescription) {
                    failures.add(new MapAuditResult(
                            map.name(),
                            game.gameName,
                            "PLACEHOLDER"
                    ));
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append("\n");
        sb.append("============================================================\n");
        sb.append(YELLOW)
                .append("              MAP DESCRIPTION AUDIT")
                .append(RESET)
                .append("\n");
        sb.append("============================================================\n\n");

        sb.append("Maps Checked : ")
                .append(totalMapsChecked)
                .append("\n");

        sb.append("Issues Found : ")
                .append(failures.isEmpty() ? GREEN : YELLOW)
                .append(failures.size())
                .append(RESET)
                .append("\n\n");

        if (!failures.isEmpty()) {

            int maxMap = "Map".length();
            int maxGame = "Game".length();
            int maxStatus = "Status".length();

            for (MapAuditResult result : failures) {
                maxMap = Math.max(maxMap, result.mapName.length());
                maxGame = Math.max(maxGame, result.gameName.length());
                maxStatus = Math.max(maxStatus, result.issues.length());
            }

            String separator =
                    "+-" + "-".repeat(maxMap) +
                            "-+-" + "-".repeat(maxGame) +
                            "-+-" + "-".repeat(maxStatus) +
                            "-+\n";

            sb.append(separator);

            sb.append(String.format(
                    "| %-" + maxMap + "s | %-" + maxGame + "s | %-" + maxStatus + "s |%n",
                    "Map",
                    "Game",
                    "Status"
            ));

            sb.append(separator);

            for (MapAuditResult result : failures) {

                sb.append("| ")
                        .append(PURPLE)
                        .append(result.mapName)
                        .append(RESET)
                        .append(" ".repeat(maxMap - result.mapName.length()))
                        .append(" | ")

                        .append(BLUE)
                        .append(result.gameName)
                        .append(RESET)
                        .append(" ".repeat(maxGame - result.gameName.length()))
                        .append(" | ")

                        .append(YELLOW)
                        .append(result.issues)
                        .append(RESET)
                        .append(" ".repeat(maxStatus - result.issues.length()))
                        .append(" |\n");
            }

            sb.append(separator);

            sb.append("\n")
                    .append(YELLOW)
                    .append("WARNING: ")
                    .append(failures.size())
                    .append(
                            failures.size() == 1
                                    ? " map is still using the default description."
                                    : " maps are still using the default description."
                    )
                    .append(RESET)
                    .append("\n");

        } else {

            sb.append(GREEN)
                    .append("PASS: All production maps have unique descriptions.")
                    .append(RESET)
                    .append("\n");
        }

        fullReport.append(sb).append("\n");
    }

    private void checkEnum(IStorylineItems[] values, List<AuditResult> failures) {
        if (values.length == 0) return;
        String category = values[0].getClass().getSimpleName();
        for (IStorylineItems item : values) {
            if (item.toString().toLowerCase().contains("test")) continue;
            int imageId = item.GetImage();
            if (imageId == 0) {
                failures.add(new AuditResult(category, item.toString(), "Missing Image"));
            } else if (imageId == R.drawable.app_icon) {
                failures.add(new AuditResult(category, item.toString(), "Placeholder"));
            }
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
        if (clazz == QuickRefDisplay_PAGE.class) return "quick_ref_display_page";
        if (clazz == AboutMe_PAGE.class) return "about_me_page";
        if (clazz == InGameNotes_ToolPage.class) return "in_game_notes_tool_page";
        if (clazz == RecommendGums_ToolPage.class) return "recommend_gums_tool_page";
        if (clazz == ContactUs_PAGE.class) return "contact_us_page";
        return "unknown";
    }

    private boolean isUnderConstruction(PageController_BaseClass activity) {
        ViewGroup rootView = activity.findViewById(android.R.id.content);
        if (rootView == null) return false;
        for (int i = 0; i < rootView.getChildCount(); i++) {
            View child = rootView.getChildAt(i);
            if (child instanceof FrameLayout && child.isClickable() && child.isFocusable()) return true;
        }
        return false;
    }

    private static class AuditResult {
        final String category, itemName, reason;
        AuditResult(String c, String i, String r) { category = c; itemName = i; reason = r; }
    }

    private static class MapAuditResult {
        final String mapName, gameName, issues;
        MapAuditResult(String m, String g, String i) { mapName = m; gameName = g; issues = i; }
    }

    private static class GumAuditResult {
        final String sourceFile, gumName, displayName, status;
        GumAuditResult(String s, String n, String d, String st) { sourceFile = s; gumName = n; displayName = d; status = st; }
    }
}
