package com.example.the_ultimate_easter_egg_guide.Models;

import com.example.the_ultimate_easter_egg_guide.Models.Storyline.IStorylineItems;
import com.example.the_ultimate_easter_egg_guide.R;
import com.example.the_ultimate_easter_egg_guide.StorylineData.CharacterData.NonPlayer_Characters;
import com.example.the_ultimate_easter_egg_guide.StorylineData.CharacterData.Player_Characters;
import com.example.the_ultimate_easter_egg_guide.StorylineData.CodZombiesYoutubersData.CodZombies_Youtubers;
import com.example.the_ultimate_easter_egg_guide.StorylineData.CreaturesData.Enemy_Creatures;
import com.example.the_ultimate_easter_egg_guide.StorylineData.CreaturesData.Friendly_Creatures;
import com.example.the_ultimate_easter_egg_guide.StorylineData.ItemsData.Items;
import com.example.the_ultimate_easter_egg_guide.StorylineData.MapsData.StorylineMaps;
import com.example.the_ultimate_easter_egg_guide.StorylineData.OrganizationsData.Organizations;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.ArrayList;
import java.util.List;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 33)
public class StorylineItemsImageAuditTest {

    @Test
    public void auditStorylineItemImages() {
        List<AuditResult> failures = new ArrayList<>();

        checkEnum(Enemy_Creatures.values(), failures);
        checkEnum(Friendly_Creatures.values(), failures);
        checkEnum(NonPlayer_Characters.values(), failures);
        checkEnum(Player_Characters.values(), failures);
        checkEnum(Items.values(), failures);
        checkEnum(StorylineMaps.values(), failures);
        checkEnum(Organizations.values(), failures);
        checkEnum(CodZombies_Youtubers.values(), failures);

        if (!failures.isEmpty()) {
            // ANSI Color Codes
            String PURPLE = "\u001B[35m";
            String BLUE = "\u001B[34m";
            String YELLOW = "\u001B[33m";
            String RESET = "\u001B[0m";

            System.out.println("\n### " + YELLOW + "STORYLINE IMAGE AUDIT" + RESET + " ###\n");

            // Calculate max column widths
            int maxCategory = "Category".length();
            int maxItem = "Item Name".length();
            for (AuditResult res : failures) {
                maxCategory = Math.max(maxCategory, res.category.length());
                maxItem = Math.max(maxItem, res.itemName.length());
            }

            String format = "| %-" + maxCategory + "s | %-" + maxItem + "s | %-15s |%n";
            
            // Print Header
            System.out.format(format, "Category", "Item Name", "Reason");
            System.out.println("| " + "-".repeat(maxCategory) + " | " + "-".repeat(maxItem) + " | " + "-".repeat(15) + " |");

            // Print Rows
            for (AuditResult res : failures) {
                String catStr = BLUE + res.category + RESET + " ".repeat(Math.max(0, maxCategory - res.category.length()));
                String itemStr = PURPLE + res.itemName + RESET + " ".repeat(Math.max(0, maxItem - res.itemName.length()));
                String reasonStr = YELLOW + res.reason + RESET;
                
                System.out.println("| " + catStr + " | " + itemStr + " | " + reasonStr + " |");
            }
            System.out.println();
        } else {
            System.out.println("\nAll storyline items have valid images.\n");
        }
    }

    private void checkEnum(IStorylineItems[] values, List<AuditResult> failures) {
        if (values.length == 0) return;
        String category = values[0].getClass().getSimpleName();
        
        for (IStorylineItems item : values) {
            // Ignore TEST items
            if (item.toString().equalsIgnoreCase("test") || item.toString().toLowerCase().contains("test")) {
                continue;
            }

            int imageId = item.GetImage();
            if (imageId == 0) {
                failures.add(new AuditResult(category, item.toString(), "Missing Image"));
            } else if (imageId == R.drawable.app_icon) {
                failures.add(new AuditResult(category, item.toString(), "Placeholder"));
            }
        }
    }

    private static class AuditResult {
        final String category;
        final String itemName;
        final String reason;

        AuditResult(String category, String itemName, String reason) {
            this.category = category;
            this.itemName = itemName;
            this.reason = reason;
        }
    }
}
