package com.example.the_ultimate_easter_egg_guide;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.MapData.MapsWarehouse;
import com.example.the_ultimate_easter_egg_guide.Models.Games;
import com.example.the_ultimate_easter_egg_guide.Models.PageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.IStorylineItems;
import com.example.the_ultimate_easter_egg_guide.Pages.AboutMe_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.CharacterDisplay_PAGE;
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
                CharacterDisplay_PAGE.class,
                QuickRefDisplay_PAGE.class,
                AboutMe_PAGE.class,
                RecommendGums_ToolPage.class,
                InGameNotes_ToolPage.class
        };

        List<String[]> failures = new ArrayList<>();
        for (Class<? extends PageController_BaseClass> pageClass : pages) {
            try {
                PageController_BaseClass activity = Robolectric.buildActivity(pageClass).create().get();
                if (isUnderConstruction(activity)) {
                    failures.add(new String[]{getLayoutName(pageClass), pageClass.getSimpleName()});
                }
            } catch (Exception ignored) {}
        }

        StringBuilder sb = new StringBuilder();
        sb.append("\n### ").append(YELLOW).append("UNDER CONSTRUCTION").append(RESET).append(" Audit ###\n\n");
        
        if (!failures.isEmpty()) {
            int maxXml = "XML Page".length();
            int maxController = "Page Controller".length();
            for (String[] f : failures) {
                maxXml = Math.max(maxXml, f[0].length() + 4);
                maxController = Math.max(maxController, f[1].length() + 5);
            }

            String format = "| %-" + maxXml + "s | %-" + maxController + "s | %-18s |%n";
            sb.append(String.format(format, "XML Page", "Page Controller", "Status"));
            sb.append("| ").append("-".repeat(maxXml)).append(" | ").append("-".repeat(maxController)).append(" | ").append("-".repeat(18)).append(" |\n");

            for (String[] f : failures) {
                String xml = PURPLE + f[0] + ".xml" + RESET;
                String controller = BLUE + f[1] + ".java" + RESET;
                String status = YELLOW + "UNDER CONSTRUCTION" + RESET;
                
                String rowXml = xml + " ".repeat(Math.max(0, maxXml - (f[0].length() + 4)));
                String rowController = controller + " ".repeat(Math.max(0, maxController - (f[1].length() + 5)));
                sb.append("| ").append(rowXml).append(" | ").append(rowController).append(" | ").append(status).append(" |\n");
            }
        } else {
            sb.append("All pages are completed.\n");
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
        sb.append("### ").append(YELLOW).append("STORYLINE IMAGE AUDIT").append(RESET).append(" ###\n\n");

        if (!failures.isEmpty()) {
            int maxCategory = "Category".length();
            int maxItem = "Item Name".length();
            for (AuditResult res : failures) {
                maxCategory = Math.max(maxCategory, res.category.length());
                maxItem = Math.max(maxItem, res.itemName.length());
            }

            String format = "| %-" + maxCategory + "s | %-" + maxItem + "s | %-15s |%n";
            sb.append(String.format(format, "Category", "Item Name", "Reason"));
            sb.append("| ").append("-".repeat(maxCategory)).append(" | ").append("-".repeat(maxItem)).append(" | ").append("-".repeat(15)).append(" |\n");

            for (AuditResult res : failures) {
                String catStr = BLUE + res.category + RESET + " ".repeat(Math.max(0, maxCategory - res.category.length()));
                String itemStr = PURPLE + res.itemName + RESET + " ".repeat(Math.max(0, maxItem - res.itemName.length()));
                String reasonStr = YELLOW + res.reason + RESET;
                sb.append("| ").append(catStr).append(" | ").append(itemStr).append(" | ").append(reasonStr).append(" |\n");
            }
        } else {
            sb.append("All storyline items have valid images.\n");
        }
        fullReport.append(sb).append("\n");
    }

    @Test
    public void audit3_MapData() {
        List<MapAuditResult> failures = new ArrayList<>();
        for (Games game : Games.values()) {
            if (game == Games.Test) continue;
            List<Maps> maps = MapsWarehouse.getMapsForGame(game);
            for (Maps map : maps) {
                List<String> issues = new ArrayList<>();
                if (map.mapCover <= 0 || map.mapCover == R.drawable.app_icon) issues.add("Missing Cover");
                if (map.mapDescription <= 0) issues.add("Missing Desc");
                if (map.mapTrailer == -1) issues.add("Missing Trailer");
                if (map.eggData == null) issues.add("Missing EggData");

                if (!issues.isEmpty()) {
                    failures.add(new MapAuditResult(map.name(), game.gameName, String.join(", ", issues)));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("### ").append(YELLOW).append("MAP DATA AUDIT").append(RESET).append(" ###\n\n");

        if (!failures.isEmpty()) {
            int maxMap = "Map Name".length();
            int maxGame = "Game".length();
            int maxIssue = "Issues".length();
            for (MapAuditResult res : failures) {
                maxMap = Math.max(maxMap, res.mapName.length());
                maxGame = Math.max(maxGame, res.gameName.length());
                maxIssue = Math.max(maxIssue, res.issues.length());
            }

            String format = "| %-" + maxMap + "s | %-" + maxGame + "s | %-" + maxIssue + "s |%n";
            sb.append(String.format(format, "Map Name", "Game", "Issues"));
            sb.append("| ").append("-".repeat(maxMap)).append(" | ").append("-".repeat(maxGame)).append(" | ").append("-".repeat(maxIssue)).append(" |\n");

            for (MapAuditResult res : failures) {
                String mapStr = PURPLE + res.mapName + RESET + " ".repeat(Math.max(0, maxMap - res.mapName.length()));
                String gameStr = BLUE + res.gameName + RESET + " ".repeat(Math.max(0, maxGame - res.gameName.length()));
                String issueStr = YELLOW + res.issues + RESET;
                sb.append("| ").append(mapStr).append(" | ").append(gameStr).append(" | ").append(issueStr).append(" |\n");
            }
        } else {
            sb.append("All map data is complete.\n");
        }
        fullReport.append(sb).append("\n");
    }

    @Test
    public void audit4_GobbleGums() {
        List<GumAuditResult> failures = new ArrayList<>();
        for (GobbleGums_boiii gum : GobbleGums_boiii.values()) {
            if (gum.game == Games.Test || gum.name().equalsIgnoreCase("TEST")) continue;
            if (gum.gumCover <= 0 || gum.gumCover == R.drawable.app_icon) {
                failures.add(new GumAuditResult("GobbleGums.java", gum.name(), gum.gumName, "DEFAULTED"));
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("### ").append(YELLOW).append("GOBBLE GUM IMAGE AUDIT").append(RESET).append(" ###\n\n");

        if (!failures.isEmpty()) {
            int maxFile = "File Name".length();
            int maxName = "Gum name".length();
            int maxDisplay = "Display Name".length();
            for (GumAuditResult res : failures) {
                maxFile = Math.max(maxFile, res.sourceFile.length());
                maxName = Math.max(maxName, res.gumName.length());
                maxDisplay = Math.max(maxDisplay, res.displayName.length());
            }

            String format = "| %-" + maxFile + "s | %-" + maxName + "s | %-" + maxDisplay + "s | %-15s |%n";
            sb.append(String.format(format, "File Name", "Gum name", "Display Name", "ICON"));
            sb.append("| ").append("-".repeat(maxFile)).append(" | ").append("-".repeat(maxName)).append(" | ").append("-".repeat(maxDisplay)).append(" | ").append("-".repeat(15)).append(" |\n");

            for (GumAuditResult res : failures) {
                String fileStr = BLUE + res.sourceFile + RESET + " ".repeat(Math.max(0, maxFile - res.sourceFile.length()));
                String nameStr = PURPLE + res.gumName + RESET + " ".repeat(Math.max(0, maxName - res.gumName.length()));
                String displayStr = res.displayName + " ".repeat(Math.max(0, maxDisplay - res.displayName.length()));
                String statusStr = YELLOW + res.status + RESET;
                sb.append("| ").append(fileStr).append(" | ").append(nameStr).append(" | ").append(displayStr).append(" | ").append(statusStr).append(" |\n");
            }
        } else {
            sb.append("All GobbleGums have valid images.\n");
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
