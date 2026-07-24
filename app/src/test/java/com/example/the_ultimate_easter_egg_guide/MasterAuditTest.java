package com.example.the_ultimate_easter_egg_guide;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.the_ultimate_easter_egg_guide.MapData.Maps;
import com.example.the_ultimate_easter_egg_guide.MapData.MapsWarehouse;
import com.example.the_ultimate_easter_egg_guide.Models.Games;
import com.example.the_ultimate_easter_egg_guide.Models.PageController_BaseClass;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEgg;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.EasterEggStep;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.IStorylineItems;
import com.example.the_ultimate_easter_egg_guide.Pages.AboutMe_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.ContactUs_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.EggDisplay_Page;
import com.example.the_ultimate_easter_egg_guide.Pages.MapDisplay_Page;
import com.example.the_ultimate_easter_egg_guide.Pages.QuickRefDisplay_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.Home_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.MapsSelection_Page;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.Settings_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.StorylineSelection_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.Navigation.Tools_PAGE;
import com.example.the_ultimate_easter_egg_guide.Pages.Tools.InGameNotes_ToolPage;
import com.example.the_ultimate_easter_egg_guide.Pages.Tools.RecommendGums_ToolPage;
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
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MasterAuditTest {

    private static final StringBuilder fullReport = new StringBuilder();

    private static final int REPORT_WIDTH = 68;
    private static final int STEP_NAME_WIDTH_LIMIT = 40;

    // ANSI console colors.
    // These names prevent conflicts with android.graphics.Color constants.
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_RESET = "\u001B[0m";

    @AfterClass
    public static void printFinalReport() {

        String separator = "=".repeat(REPORT_WIDTH);
        String title = "MASTER PROJECT AUDIT REPORT";
        int titlePadding = Math.max(0, (REPORT_WIDTH - title.length()) / 2);

        System.out.println();
        System.out.println(separator);
        System.out.println(
                " ".repeat(titlePadding)
                        + ANSI_YELLOW
                        + title
                        + ANSI_RESET
        );
        System.out.println(separator);

        System.out.print(fullReport);

        System.out.println(separator);
        System.out.println();
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

        List<PageAuditResult> failures = new ArrayList<>();

        for (Class<? extends PageController_BaseClass> pageClass : pages) {

            String layoutFile = getLayoutName(pageClass) + ".xml";
            String controllerFile = pageClass.getSimpleName() + ".java";

            try {
                PageController_BaseClass activity =
                        Robolectric.buildActivity(pageClass)
                                .create()
                                .get();

                if (isUnderConstruction(activity)) {
                    failures.add(new PageAuditResult(
                            layoutFile,
                            controllerFile,
                            "UNDER CONSTRUCTION"
                    ));
                }

            } catch (Exception exception) {
                failures.add(new PageAuditResult(
                        layoutFile,
                        controllerFile,
                        "AUDIT ERROR"
                ));
            }
        }

        StringBuilder sb = new StringBuilder();

        appendAuditHeader(sb, "CONSTRUCTION STATUS AUDIT");
        appendAuditSummary(sb, "Pages Checked", pages.length, failures.size());

        if (!failures.isEmpty()) {

            int maxXml = "XML Page".length();
            int maxController = "Page Controller".length();
            int maxStatus = "Status".length();

            for (PageAuditResult result : failures) {
                maxXml = Math.max(maxXml, result.xmlPage.length());
                maxController = Math.max(
                        maxController,
                        result.controller.length()
                );
                maxStatus = Math.max(maxStatus, result.status.length());
            }

            int[] widths = {
                    maxXml,
                    maxController,
                    maxStatus
            };

            String separator = buildTableSeparator(widths);

            sb.append(separator);
            appendTableRow(
                    sb,
                    widths,
                    new String[]{"XML Page", "Page Controller", "Status"},
                    null
            );
            sb.append(separator);

            for (PageAuditResult result : failures) {
                appendTableRow(
                        sb,
                        widths,
                        new String[]{
                                result.xmlPage,
                                result.controller,
                                result.status
                        },
                        new String[]{
                                ANSI_PURPLE,
                                ANSI_BLUE,
                                result.status.equals("AUDIT ERROR")
                                        ? ANSI_RED
                                        : ANSI_YELLOW
                        }
                );
            }

            sb.append(separator);

            appendWarning(
                    sb,
                    failures.size(),
                    "page requires attention.",
                    "pages require attention."
            );

        } else {
            appendPass(sb, "All pages are completed.");
        }

        fullReport.append(sb).append("\n");
    }

    @Test
    public void audit2_StorylineItems() {

        List<AuditResult> failures = new ArrayList<>();
        int totalItemsChecked = 0;

        totalItemsChecked += checkEnum(
                Enemy_Creatures.values(),
                failures
        );
        totalItemsChecked += checkEnum(
                Friendly_Creatures.values(),
                failures
        );
        totalItemsChecked += checkEnum(
                NonPlayer_Characters.values(),
                failures
        );
        totalItemsChecked += checkEnum(
                Player_Characters.values(),
                failures
        );
        totalItemsChecked += checkEnum(
                Items.values(),
                failures
        );
        totalItemsChecked += checkEnum(
                StorylineMaps.values(),
                failures
        );
        totalItemsChecked += checkEnum(
                Organizations.values(),
                failures
        );
        totalItemsChecked += checkEnum(
                CodZombies_Youtubers.values(),
                failures
        );

        StringBuilder sb = new StringBuilder();

        appendAuditHeader(sb, "STORYLINE IMAGE AUDIT");
        appendAuditSummary(
                sb,
                "Items Checked",
                totalItemsChecked,
                failures.size()
        );

        if (!failures.isEmpty()) {

            int maxCategory = "Category".length();
            int maxItem = "Item".length();
            int maxStatus = "Status".length();

            for (AuditResult result : failures) {
                maxCategory = Math.max(
                        maxCategory,
                        result.category.length()
                );
                maxItem = Math.max(
                        maxItem,
                        result.itemName.length()
                );
                maxStatus = Math.max(
                        maxStatus,
                        result.reason.length()
                );
            }

            int[] widths = {
                    maxCategory,
                    maxItem,
                    maxStatus
            };

            String separator = buildTableSeparator(widths);

            sb.append(separator);
            appendTableRow(
                    sb,
                    widths,
                    new String[]{"Category", "Item", "Status"},
                    null
            );
            sb.append(separator);

            for (AuditResult result : failures) {
                appendTableRow(
                        sb,
                        widths,
                        new String[]{
                                result.category,
                                result.itemName,
                                result.reason
                        },
                        new String[]{
                                ANSI_BLUE,
                                ANSI_PURPLE,
                                ANSI_YELLOW
                        }
                );
            }

            sb.append(separator);

            appendWarning(
                    sb,
                    failures.size(),
                    "storyline item has an invalid or placeholder image.",
                    "storyline items have invalid or placeholder images."
            );

        } else {
            appendPass(
                    sb,
                    "All storyline items have valid images."
            );
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

                if (map.mapCover <= 0
                        || map.mapCover == R.drawable.app_icon) {
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

        appendAuditHeader(sb, "MAP DATA AUDIT");
        appendAuditSummary(
                sb,
                "Maps Checked",
                totalMapsChecked,
                failures.size()
        );

        if (!failures.isEmpty()) {

            int maxMap = "Map".length();
            int maxGame = "Game".length();
            int maxIssues = "Issues".length();

            for (MapAuditResult result : failures) {
                maxMap = Math.max(
                        maxMap,
                        result.mapName.length()
                );
                maxGame = Math.max(
                        maxGame,
                        result.gameName.length()
                );
                maxIssues = Math.max(
                        maxIssues,
                        result.issues.length()
                );
            }

            int[] widths = {
                    maxMap,
                    maxGame,
                    maxIssues
            };

            String separator = buildTableSeparator(widths);

            sb.append(separator);
            appendTableRow(
                    sb,
                    widths,
                    new String[]{"Map", "Game", "Issues"},
                    null
            );
            sb.append(separator);

            for (MapAuditResult result : failures) {
                appendTableRow(
                        sb,
                        widths,
                        new String[]{
                                result.mapName,
                                result.gameName,
                                result.issues
                        },
                        new String[]{
                                ANSI_PURPLE,
                                ANSI_BLUE,
                                ANSI_YELLOW
                        }
                );
            }

            sb.append(separator);

            appendWarning(
                    sb,
                    failures.size(),
                    "map has incomplete data.",
                    "maps have incomplete data."
            );

        } else {
            appendPass(sb, "All map data is complete.");
        }

        fullReport.append(sb).append("\n");
    }

    @Test
    public void audit4_GobbleGums() {

        List<GumAuditResult> failures = new ArrayList<>();
        int totalGumsChecked = 0;

        for (GobbleGums_boiii gum : GobbleGums_boiii.values()) {

            if (gum.game == Games.Test
                    || gum.name().equalsIgnoreCase("TEST")) {
                continue;
            }

            totalGumsChecked++;

            if (gum.gumCover <= 0
                    || gum.gumCover == R.drawable.app_icon) {
                failures.add(new GumAuditResult(
                        "GobbleGums_boiii.java",
                        gum.name(),
                        "PLACEHOLDER"
                ));
            }
        }

        StringBuilder sb = new StringBuilder();

        appendAuditHeader(sb, "GOBBLEGUM IMAGE AUDIT");
        appendAuditSummary(
                sb,
                "GobbleGums Checked",
                totalGumsChecked,
                failures.size()
        );

        if (!failures.isEmpty()) {

            int maxFile = "File".length();
            int maxGum = "Gum".length();
            int maxStatus = "Status".length();

            for (GumAuditResult result : failures) {
                maxFile = Math.max(
                        maxFile,
                        result.sourceFile.length()
                );
                maxGum = Math.max(
                        maxGum,
                        result.gumName.length()
                );
                maxStatus = Math.max(
                        maxStatus,
                        result.status.length()
                );
            }

            int[] widths = {
                    maxFile,
                    maxGum,
                    maxStatus
            };

            String separator = buildTableSeparator(widths);

            sb.append(separator);
            appendTableRow(
                    sb,
                    widths,
                    new String[]{"File", "Gum", "Status"},
                    null
            );
            sb.append(separator);

            for (GumAuditResult result : failures) {
                appendTableRow(
                        sb,
                        widths,
                        new String[]{
                                result.sourceFile,
                                result.gumName,
                                result.status
                        },
                        new String[]{
                                ANSI_BLUE,
                                ANSI_PURPLE,
                                ANSI_YELLOW
                        }
                );
            }

            sb.append(separator);

            appendWarning(
                    sb,
                    failures.size(),
                    "GobbleGum is using a placeholder image.",
                    "GobbleGums are using placeholder images."
            );

        } else {
            appendPass(
                    sb,
                    "All GobbleGums have valid images."
            );
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

                if (map.mapDescription
                        == R.string.general_placeholder_mapdescription) {
                    failures.add(new MapAuditResult(
                            map.name(),
                            game.gameName,
                            "PLACEHOLDER"
                    ));
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        appendAuditHeader(sb, "MAP DESCRIPTION AUDIT");
        appendAuditSummary(
                sb,
                "Maps Checked",
                totalMapsChecked,
                failures.size()
        );

        if (!failures.isEmpty()) {

            int maxMap = "Map".length();
            int maxGame = "Game".length();
            int maxStatus = "Status".length();

            for (MapAuditResult result : failures) {
                maxMap = Math.max(
                        maxMap,
                        result.mapName.length()
                );
                maxGame = Math.max(
                        maxGame,
                        result.gameName.length()
                );
                maxStatus = Math.max(
                        maxStatus,
                        result.issues.length()
                );
            }

            int[] widths = {
                    maxMap,
                    maxGame,
                    maxStatus
            };

            String separator = buildTableSeparator(widths);

            sb.append(separator);
            appendTableRow(
                    sb,
                    widths,
                    new String[]{"Map", "Game", "Status"},
                    null
            );
            sb.append(separator);

            for (MapAuditResult result : failures) {
                appendTableRow(
                        sb,
                        widths,
                        new String[]{
                                result.mapName,
                                result.gameName,
                                result.issues
                        },
                        new String[]{
                                ANSI_PURPLE,
                                ANSI_BLUE,
                                ANSI_YELLOW
                        }
                );
            }

            sb.append(separator);

            appendWarning(
                    sb,
                    failures.size(),
                    "map is still using the default description.",
                    "maps are still using the default description."
            );

        } else {
            appendPass(
                    sb,
                    "All production maps have unique descriptions."
            );
        }

        fullReport.append(sb).append("\n");
    }

    @Test
    public void audit6_EasterEggSteps() {

        List<MapAuditResult> failures = new ArrayList<>();
        int totalEggsChecked = 0;

        for (Maps map : Maps.values()) {

            if (map.gameName == Games.Test || map.eggData == null) {
                continue;
            }

            List<EasterEgg> allEggs = getAllEasterEggs(map);

            for (EasterEgg egg : allEggs) {

                totalEggsChecked++;

                if (egg.easterEggSteps == null
                        || egg.easterEggSteps.isEmpty()) {
                    failures.add(new MapAuditResult(
                            map.name(),
                            egg.easterEggName,
                            "NO STEPS"
                    ));
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        appendAuditHeader(sb, "EASTER EGG STEPS AUDIT");
        appendAuditSummary(
                sb,
                "Easter Eggs Checked",
                totalEggsChecked,
                failures.size()
        );

        if (!failures.isEmpty()) {

            int maxMap = "Map".length();
            int maxEgg = "Easter Egg".length();
            int maxStatus = "Status".length();

            for (MapAuditResult result : failures) {
                maxMap = Math.max(
                        maxMap,
                        result.mapName.length()
                );
                maxEgg = Math.max(
                        maxEgg,
                        result.gameName.length()
                );
                maxStatus = Math.max(
                        maxStatus,
                        result.issues.length()
                );
            }

            int[] widths = {
                    maxMap,
                    maxEgg,
                    maxStatus
            };

            String separator = buildTableSeparator(widths);

            sb.append(separator);
            appendTableRow(
                    sb,
                    widths,
                    new String[]{"Map", "Easter Egg", "Status"},
                    null
            );
            sb.append(separator);

            for (MapAuditResult result : failures) {
                appendTableRow(
                        sb,
                        widths,
                        new String[]{
                                result.mapName,
                                result.gameName,
                                result.issues
                        },
                        new String[]{
                                ANSI_PURPLE,
                                ANSI_BLUE,
                                ANSI_YELLOW
                        }
                );
            }

            sb.append(separator);

            appendWarning(
                    sb,
                    failures.size(),
                    "Easter Egg has no steps defined.",
                    "Easter Eggs have no steps defined."
            );

        } else {
            appendPass(
                    sb,
                    "All Easter Eggs have steps defined."
            );
        }

        fullReport.append(sb).append("\n");
    }

    @Test
    public void audit7_EasterEggStepImages() {

        List<StepAuditResult> failures = new ArrayList<>();
        int totalStepsChecked = 0;

        for (Maps map : Maps.values()) {

            if (map.gameName == Games.Test || map.eggData == null) {
                continue;
            }

            List<EasterEgg> allEggs = getAllEasterEggs(map);

            for (EasterEgg egg : allEggs) {
                totalStepsChecked += scanStepsForImages(
                        map.name(),
                        egg.easterEggName,
                        egg.easterEggSteps,
                        failures
                );
            }
        }

        StringBuilder sb = new StringBuilder();

        appendAuditHeader(sb, "EASTER EGG STEP IMAGE AUDIT");
        appendAuditSummary(
                sb,
                "Steps Checked",
                totalStepsChecked,
                failures.size()
        );

        if (!failures.isEmpty()) {

            int maxMap = "Map".length();
            int maxEgg = "Easter Egg".length();
            int maxStep = "Step".length();
            int maxStatus = "Status".length();

            for (StepAuditResult result : failures) {
                maxMap = Math.max(
                        maxMap,
                        result.map.length()
                );
                maxEgg = Math.max(
                        maxEgg,
                        result.egg.length()
                );
                maxStep = Math.max(
                        maxStep,
                        result.step.length()
                );
                maxStatus = Math.max(
                        maxStatus,
                        result.issue.length()
                );
            }

            // Keep long step names from making the report excessively wide.
            maxStep = Math.min(
                    maxStep,
                    STEP_NAME_WIDTH_LIMIT
            );

            int[] widths = {
                    maxMap,
                    maxEgg,
                    maxStep,
                    maxStatus
            };

            String separator = buildTableSeparator(widths);

            sb.append(separator);
            appendTableRow(
                    sb,
                    widths,
                    new String[]{
                            "Map",
                            "Easter Egg",
                            "Step",
                            "Status"
                    },
                    null
            );
            sb.append(separator);

            for (StepAuditResult result : failures) {

                String displayStep = truncate(
                        result.step,
                        maxStep
                );

                appendTableRow(
                        sb,
                        widths,
                        new String[]{
                                result.map,
                                result.egg,
                                displayStep,
                                result.issue
                        },
                        new String[]{
                                ANSI_BLUE,
                                ANSI_PURPLE,
                                null,
                                ANSI_YELLOW
                        }
                );
            }

            sb.append(separator);

            appendWarning(
                    sb,
                    failures.size(),
                    "step has a missing or placeholder image.",
                    "steps have missing or placeholder images."
            );

        } else {
            appendPass(
                    sb,
                    "All Easter Egg steps have valid images."
            );
        }

        fullReport.append(sb).append("\n");
    }

    private List<EasterEgg> getAllEasterEggs(Maps map) {

        List<EasterEgg> allEggs = new ArrayList<>();

        if (map.eggData == null) {
            return allEggs;
        }

        if (map.eggData.mainQuests != null) {
            allEggs.addAll(map.eggData.mainQuests);
        }

        if (map.eggData.sideQuests != null) {
            allEggs.addAll(map.eggData.sideQuests);
        }

        if (map.eggData.Buildables != null) {
            allEggs.addAll(map.eggData.Buildables);
        }

        return allEggs;
    }

    private int scanStepsForImages(
            String mapName,
            String eggName,
            List<EasterEggStep> steps,
            List<StepAuditResult> failures
    ) {

        if (steps == null) {
            return 0;
        }

        int count = 0;

        for (EasterEggStep step : steps) {

            count++;

            String stepName = step.stepName == null
                    ? "UNNAMED STEP"
                    : step.stepName;

            if (isUsingPlaceholder(step)) {
                failures.add(new StepAuditResult(
                        mapName,
                        eggName,
                        stepName,
                        "PLACEHOLDER"
                ));
            }

            count += scanStepsForImages(
                    mapName,
                    eggName,
                    step.subSteps,
                    failures
            );
        }

        return count;
    }

    private boolean isUsingPlaceholder(EasterEggStep step) {

        if (step.images == null || step.images.isEmpty()) {
            return false;
        }

        try {
            int firstImage = step.GetImageOnStep(0);
            return firstImage <= 0
                    || firstImage == R.drawable.app_icon;

        } catch (Exception exception) {
            return false;
        }
    }

    private int checkEnum(
            IStorylineItems[] values,
            List<AuditResult> failures
    ) {

        if (values == null || values.length == 0) {
            return 0;
        }

        int checked = 0;
        String category = values[0]
                .getClass()
                .getSimpleName();

        for (IStorylineItems item : values) {

            if (item.toString()
                    .toLowerCase(Locale.ROOT)
                    .contains("test")) {
                continue;
            }

            checked++;

            int imageId = item.GetImage();

            if (imageId <= 0) {
                failures.add(new AuditResult(
                        category,
                        item.toString(),
                        "MISSING IMAGE"
                ));
            } else if (imageId == R.drawable.app_icon) {
                failures.add(new AuditResult(
                        category,
                        item.toString(),
                        "PLACEHOLDER"
                ));
            }
        }

        return checked;
    }

    private static void appendAuditHeader(
            StringBuilder sb,
            String title
    ) {

        String separator = "=".repeat(REPORT_WIDTH);
        int titlePadding = Math.max(
                0,
                (REPORT_WIDTH - title.length()) / 2
        );

        sb.append("\n")
                .append(separator)
                .append("\n")
                .append(" ".repeat(titlePadding))
                .append(ANSI_YELLOW)
                .append(title)
                .append(ANSI_RESET)
                .append("\n")
                .append(separator)
                .append("\n\n");
    }

    private static void appendAuditSummary(
            StringBuilder sb,
            String checkedLabel,
            int checkedCount,
            int issueCount
    ) {

        int labelWidth = Math.max(
                checkedLabel.length(),
                "Issues Found".length()
        );

        sb.append(String.format(
                "%-" + labelWidth + "s : %d%n",
                checkedLabel,
                checkedCount
        ));

        sb.append(String.format(
                        "%-" + labelWidth + "s : ",
                        "Issues Found"
                ))
                .append(issueCount == 0
                        ? ANSI_GREEN
                        : ANSI_YELLOW)
                .append(issueCount)
                .append(ANSI_RESET)
                .append("\n\n");
    }

    private static String buildTableSeparator(int[] widths) {

        StringBuilder separator = new StringBuilder("+");

        for (int width : widths) {
            separator.append("-".repeat(width + 2))
                    .append("+");
        }

        separator.append("\n");

        return separator.toString();
    }

    private static void appendTableRow(
            StringBuilder sb,
            int[] widths,
            String[] values,
            String[] colors
    ) {

        sb.append("|");

        for (int index = 0; index < widths.length; index++) {

            String value = values[index] == null
                    ? ""
                    : values[index];

            String color = colors == null
                    ? null
                    : colors[index];

            sb.append(" ");

            if (color != null) {
                sb.append(color);
            }

            sb.append(value);

            if (color != null) {
                sb.append(ANSI_RESET);
            }

            sb.append(" ".repeat(Math.max(
                            0,
                            widths[index] - value.length()
                    )))
                    .append(" |");
        }

        sb.append("\n");
    }

    private static void appendPass(
            StringBuilder sb,
            String message
    ) {

        sb.append(ANSI_GREEN)
                .append("PASS: ")
                .append(message)
                .append(ANSI_RESET)
                .append("\n");
    }

    private static void appendWarning(
            StringBuilder sb,
            int issueCount,
            String singularMessage,
            String pluralMessage
    ) {

        sb.append("\n")
                .append(ANSI_YELLOW)
                .append("WARNING: ")
                .append(issueCount)
                .append(" ")
                .append(issueCount == 1
                        ? singularMessage
                        : pluralMessage)
                .append(ANSI_RESET)
                .append("\n");
    }

    private static String truncate(
            String value,
            int maxLength
    ) {

        if (value == null) {
            return "";
        }

        if (value.length() <= maxLength) {
            return value;
        }

        if (maxLength <= 3) {
            return value.substring(0, maxLength);
        }

        return value.substring(0, maxLength - 3) + "...";
    }

    private String getLayoutName(Class<?> clazz) {

        if (clazz == Home_PAGE.class) {
            return "home_page";
        }

        if (clazz == MapsSelection_Page.class) {
            return "maps_selection_page";
        }

        if (clazz == StorylineSelection_PAGE.class) {
            return "storyline_page";
        }

        if (clazz == Tools_PAGE.class) {
            return "tools_page";
        }

        if (clazz == Settings_PAGE.class) {
            return "settings_page";
        }

        if (clazz == MapDisplay_Page.class) {
            return "map_display_page";
        }

        if (clazz == EggDisplay_Page.class) {
            return "egg_display_page";
        }

        if (clazz == QuickRefDisplay_PAGE.class) {
            return "quick_ref_display_page";
        }

        if (clazz == AboutMe_PAGE.class) {
            return "about_me_page";
        }

        if (clazz == InGameNotes_ToolPage.class) {
            return "in_game_notes_tool_page";
        }

        if (clazz == RecommendGums_ToolPage.class) {
            return "recommend_gums_tool_page";
        }

        if (clazz == ContactUs_PAGE.class) {
            return "contact_us_page";
        }

        return "unknown";
    }

    private boolean isUnderConstruction(
            PageController_BaseClass activity
    ) {

        ViewGroup rootView =
                activity.findViewById(android.R.id.content);

        if (rootView == null) {
            return false;
        }

        for (int index = 0;
             index < rootView.getChildCount();
             index++) {

            View child = rootView.getChildAt(index);

            if (child instanceof FrameLayout
                    && child.isClickable()
                    && child.isFocusable()) {
                return true;
            }
        }

        return false;
    }

    private static class PageAuditResult {

        final String xmlPage;
        final String controller;
        final String status;

        PageAuditResult(
                String xmlPage,
                String controller,
                String status
        ) {
            this.xmlPage = xmlPage;
            this.controller = controller;
            this.status = status;
        }
    }

    private static class AuditResult {

        final String category;
        final String itemName;
        final String reason;

        AuditResult(
                String category,
                String itemName,
                String reason
        ) {
            this.category = category;
            this.itemName = itemName;
            this.reason = reason;
        }
    }

    private static class MapAuditResult {

        final String mapName;
        final String gameName;
        final String issues;

        MapAuditResult(
                String mapName,
                String gameName,
                String issues
        ) {
            this.mapName = mapName;
            this.gameName = gameName;
            this.issues = issues;
        }
    }

    private static class GumAuditResult {

        final String sourceFile;
        final String gumName;
        final String status;

        GumAuditResult(
                String sourceFile,
                String gumName,
                String status
        ) {
            this.sourceFile = sourceFile;
            this.gumName = gumName;
            this.status = status;
        }
    }

    private static class StepAuditResult {

        final String map;
        final String egg;
        final String step;
        final String issue;

        StepAuditResult(
                String map,
                String egg,
                String step,
                String issue
        ) {
            this.map = map;
            this.egg = egg;
            this.step = step;
            this.issue = issue;
        }
    }
}