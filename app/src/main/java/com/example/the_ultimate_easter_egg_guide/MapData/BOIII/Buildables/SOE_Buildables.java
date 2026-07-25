package com.example.the_ultimate_easter_egg_guide.MapData.BOIII.Buildables;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.Buildable;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.Buildable;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.BuildableStep;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.Procedure;

import java.util.Arrays;
import java.util.List;

public class SOE_Buildables
{

    public static final Buildable ApothiconServant =
            new Buildable("Apothicon Servant")

                    .addStep(new BuildableStep("Collect the Margwa Heart")
                            .addSubStep(new BuildableStep(
                                    "Kill a Margwa and collect the Margwa Heart that it drops."
                            ))
                            .addSubStep(new BuildableStep(
                                            "The first defeated Margwa will normally drop the Heart. Later Margwas can drop it if it was not collected."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Xenomatter")
                            .addSubStep(new BuildableStep(
                                    "Beginning around Round 13, kill Parasites and Insanity Elementals until one drops the glowing Xenomatter."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Collect the Xenomatter before it disappears."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Margwa Tentacle")
                            .addSubStep(new BuildableStep(
                                    "Obtain a Fumigator and use it to open Harvest Pods."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Allow Harvest Pods to mature until they are purple, then open them until a Margwa Tentacle appears."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Take the Margwa Heart, Xenomatter, and Margwa Tentacle to a crafting table in the Footlight, Canals, or Waterfront District."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Assemble and collect the Apothicon Servant."
                                    )
                                            .addImage()
                            )
                    )
            ;

    public static final Buildable RocketShield =
            new Buildable("Rocket Shield")

                    .addStep(new BuildableStep("Collect the Footlight Shield Window")
                            .addSubStep(new BuildableStep(
                                    "Open the Beast Mode staircase near the front of the Footlight District."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Search the upper Footlight area for the shield window. It can appear on the bench across from the perk machine."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "It can appear leaning against the fence to the left of the perk machine."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "It can also appear on the chair inside the staircase room near the Mystery Box location."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Canals Shield Base")
                            .addSubStep(new BuildableStep(
                                    "Open the Beast Mode staircase near the front of the Canals District."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Search the room containing the four lion statues. The part can appear against the wall beside the Harvest Pod."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "It can appear on the elevated walkway leading toward the perk-machine room."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "It can also appear leaning against the window inside the perk-machine room."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Waterfront Rocket Canisters")
                            .addSubStep(new BuildableStep(
                                    "Open the Beast Mode staircase near the front of the Waterfront District."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Search immediately at the top of the powered staircase."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "The canisters can appear beneath the window across from the Beast Mode chalice in the perk-machine room."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "They can also appear inside the damaged building, leaning against an overturned table near the train-station gate."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Take all three parts to a crafting table in the Footlight, Canals, or Waterfront District and assemble the Rocket Shield."
                                    )
                                            .addImage()
                            )
                    )
            ;

    public static final List<Buildable> SOE_Buildables = Arrays.asList(
            RocketShield,
            ApothiconServant
    );
}
