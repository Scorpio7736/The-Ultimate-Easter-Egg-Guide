package com.example.the_ultimate_easter_egg_guide.MapData.BOIII.Buildables;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.Buildable;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.Buildable;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.BuildableStep;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.Procedure;

import java.util.Arrays;
import java.util.List;

public class Revelations_Buildables
{
    public static final Buildable GuardOfFafnir =
            new Buildable("Guard of Fafnir")

                    .addStep(new BuildableStep("Collect the Dragon Head")
                            .addSubStep(new BuildableStep("Search the Origins wall to the left of the Spawn jump pad.").addImage())
                            .addSubStep(new BuildableStep("Search the box beside the KRM-262 in Origins.").addImage())
                            .addSubStep(new BuildableStep("Search the chair beside the lower Origins door.").addImage())
                    )

                    .addStep(new BuildableStep("Collect the Dragon Heart")
                            .addSubStep(new BuildableStep("Search the counter on the upper floor of Verrückt.").addImage())
                            .addSubStep(new BuildableStep("Search beside the Zetsubou No Shima-style test tubes.").addImage())
                            .addSubStep(new BuildableStep("Search the chair immediately after climbing the Verrückt staircase.").addImage())
                    )

                    .addStep(new BuildableStep("Collect the Dragon Mouth and Build the Shield")
                            .addSubStep(new BuildableStep("Activate anti-gravity in the Der Eisendrache Undercroft."))
                            .addSubStep(new BuildableStep("Search the wall above the former Wolf Bow soul area.").addImage())
                            .addSubStep(new BuildableStep("Search the wall panels above the Pyramid.").addImage())
                            .addSubStep(new BuildableStep("Search the wall between the Pyramid and Primis statue room.").addImage())
                            .addSubStep(new BuildableStep("Take all three pieces to the crafting table upstairs in Nacht der Untoten."))
                            .addSubStep(new BuildableStep("Build and collect the Guard of Fafnir.").addImage())
                    )
            ;


    public static final Buildable ApothiconServantUpgrade =
            new Buildable(
                    "Apothicon Servant Upgrade (Estoom-oth)",
                    "Upgrades the Apothicon Servant into Estoom-oth with increased ammunition and stronger singularities."
            )

                    .addStep(new BuildableStep("Prepare the Apothicon Servant")
                            .addSubStep(new BuildableStep("Override all four Corruption Engines and unlock Pack-A-Punch."))
                            .addSubStep(new BuildableStep("Obtain the Apothicon Servant from the Mystery Box."))
                    )

                    .addStep(new BuildableStep("Shoot the Spawn Element 115 Cube")
                            .addSubStep(new BuildableStep("From Spawn, shoot the floating blue Element 115 cube above the House or Corruption Engine using the Apothicon Servant.").addImage())
                    )

                    .addStep(new BuildableStep("Shoot the Shangri-La and Mob of the Dead Cubes")
                            .addSubStep(new BuildableStep("Shoot the cube floating above the Shangri-La temple staircase.").addImage())
                            .addSubStep(new BuildableStep("Shoot the cube above the Mob of the Dead Corruption Engine in front of the blue sun.").addImage())
                    )

                    .addStep(new BuildableStep("Shoot the Two Verrückt Cubes")
                            .addSubStep(new BuildableStep("Shoot the cube above the Mob of the Dead jump-pad landing area in Verrückt.").addImage())
                            .addSubStep(new BuildableStep("Shoot the cube floating to the right of the Verrückt Corruption Engine portal.").addImage())
                            .addSubStep(new BuildableStep("Each successful cube disappears and briefly distorts the player's screen."))
                    )

                    .addStep(new BuildableStep("Upgrade the Apothicon Servant")
                            .addSubStep(new BuildableStep("Confirm that the collected Element 115 cubes have appeared around the Pack-A-Punch Machine.").addImage())
                            .addSubStep(new BuildableStep("Place the Apothicon Servant into Pack-A-Punch for 5,000 points."))
                            .addSubStep(new BuildableStep("Collect Estoom-oth from the machine.").addImage())
                    )
            ;


    public static final Buildable PackAPunch =
            new Buildable("Pack-a-Punch (Revelations)")

                    .addStep(new BuildableStep("Override the Four Corruption Engines")
                            .addSubStep(new BuildableStep("Activate the Spawn Corruption Engine for 500 points and survive the override.").addImage())
                            .addSubStep(new BuildableStep("Activate the Der Eisendrache Corruption Engine for 500 points.").addImage())
                            .addSubStep(new BuildableStep("Activate the Mob of the Dead Corruption Engine for 500 points.").addImage())
                            .addSubStep(new BuildableStep("Activate the Verrückt Corruption Engine for 500 points.").addImage())
                            .addSubStep(new BuildableStep("Each completed override activates power in that section and opens a portal to Nacht der Untoten."))
                    )

                    .addStep(new BuildableStep("Trap the Giant Apothicon")
                            .addSubStep(new BuildableStep("Go to the upper floor of Nacht der Untoten and locate the terminal displaying the four Corruption Engines.").addImage())
                            .addSubStep(new BuildableStep("Wait for the Giant Apothicon to fly in front of the terminal."))
                            .addSubStep(new BuildableStep("Activate the terminal to fire the Tesla beams and trap the creature."))
                    )

                    .addStep(new BuildableStep("Enter the Giant Apothicon")
                            .addSubStep(new BuildableStep("Approach the trapped Giant Apothicon's open mouth from Nacht der Untoten.").addImage())
                            .addSubStep(new BuildableStep("Walk into its mouth to be swallowed and transported into its body."))
                    )

                    .addStep(new BuildableStep("Release Pack-A-Punch")
                            .addSubStep(new BuildableStep("Locate Pack-A-Punch hanging above the main stomach chamber.").addImage())
                            .addSubStep(new BuildableStep("Shoot each of the three glowing yellow tendons holding the machine."))
                            .addSubStep(new BuildableStep("Pack-A-Punch will fall into the lower alcove and remain usable for the rest of the match.").addImage())
                    )
            ;


    public static final List<Buildable> Revelations_Buildables = Arrays.asList(
            GuardOfFafnir,
            ApothiconServantUpgrade,
            PackAPunch
    );
}
