package com.example.the_ultimate_easter_egg_guide.ToolsData;

import com.example.the_ultimate_easter_egg_guide.R;
import com.example.the_ultimate_easter_egg_guide.Models.Games;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.ArrayList;
import java.util.List;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class GobbleGumsAuditTest {

    @Test
    public void auditGobbleGumImages() {
        List<GumAuditResult> failures = new ArrayList<>();

        for (GobbleGums gum : GobbleGums.values()) {

            // Ignore TEST gum
            if (gum.game == Games.Test || gum.name().equalsIgnoreCase("TEST")) {
                continue;
            }

            if (gum.gumCover <= 0 || gum.gumCover == R.drawable.app_icon) {
                failures.add(new GumAuditResult(
                        "GobbleGums.java",
                        gum.name(),
                        "DEFAULTED"
                ));
            }
        }

        if (!failures.isEmpty()) {

            // ANSI Color Codes
            String PURPLE = "\u001B[35m";
            String BLUE = "\u001B[34m";
            String YELLOW = "\u001B[33m";
            String RESET = "\u001B[0m";

            System.out.println("\n### " + YELLOW + "GOBBLE GUM IMAGE AUDIT" + RESET + " ###\n");

            // Calculate max column widths
            int maxFile = "File Name".length();
            int maxName = "Gum".length();
            int maxStatus = "Status".length();

            for (GumAuditResult res : failures) {
                maxFile = Math.max(maxFile, res.sourceFile.length());
                maxName = Math.max(maxName, res.gumName.length());
                maxStatus = Math.max(maxStatus, res.status.length());
            }

            String format = "| %-" + maxFile + "s | %-" + maxName + "s | %-" + maxStatus + "s |%n";

            // Print Header
            System.out.printf(format, "File Name", "Gum", "Status");

            // Print Separator
            System.out.println(
                    "|-" + "-".repeat(maxFile) +
                            "-|-" + "-".repeat(maxName) +
                            "-|-" + "-".repeat(maxStatus) + "-|"
            );

            // Print Rows
            for (GumAuditResult res : failures) {

                String fileStr =
                        BLUE + res.sourceFile + RESET +
                                " ".repeat(Math.max(0, maxFile - res.sourceFile.length()));

                String nameStr =
                        PURPLE + res.gumName + RESET +
                                " ".repeat(Math.max(0, maxName - res.gumName.length()));

                String statusStr =
                        YELLOW + res.status + RESET +
                                " ".repeat(Math.max(0, maxStatus - res.status.length()));

                System.out.println(
                        "| " + fileStr +
                                " | " + nameStr +
                                " | " + statusStr + " |"
                );
            }

            System.out.println();

        } else {
            System.out.println("\nAll GobbleGums have valid images.\n");
        }
    }

    private static class GumAuditResult {
        final String sourceFile;
        final String gumName;
        final String status;

        GumAuditResult(String sourceFile, String gumName, String status) {
            this.sourceFile = sourceFile;
            this.gumName = gumName;
            this.status = status;
        }
    }
}