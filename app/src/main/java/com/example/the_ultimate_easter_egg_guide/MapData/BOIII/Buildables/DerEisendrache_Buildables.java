package com.example.the_ultimate_easter_egg_guide.MapData.BOIII.Buildables;

import com.example.the_ultimate_easter_egg_guide.Models.Maps.Buildable;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.BuildableStep;
import com.example.the_ultimate_easter_egg_guide.Models.Maps.Procedure;

import java.util.Arrays;
import java.util.List;

public class DerEisendrache_Buildables
{
    public static final Buildable RagnarokDG4 =
            new Buildable("Ragnarok DG-4")

                    .addStep(new BuildableStep("Collect the Panzer Soldat Part")
                            .addSubStep(new BuildableStep(
                                    "Kill the first Panzer Soldat, which normally appears around Round 12."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Collect the Ragnarok DG-4 part dropped by the defeated Panzer."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Death Ray Part")
                            .addSubStep(new BuildableStep(
                                            "Activate the Death Ray trap for 1,000 points."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "After the trap finishes, look into the sky for the floating Ragnarok part."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Use the correct Wunder Sphere to fly through and collect the part before it disappears."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Rocket Test Part and Build the Ragnarok")
                            .addSubStep(new BuildableStep(
                                    "Travel to the Rocket Launch Site and wait for a rocket test to begin."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Pull the lever underneath the left staircase when the rocket-test announcement begins."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Enter the safe teleporter room and wait for the rocket test to finish."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Watch the three lights on the control box beside the teleporter."
                            ))
                            .addSubStep(new BuildableStep(
                                            "When all three lights turn green, immediately activate the control box."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Collect the final Ragnarok part from inside the teleporter."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Take all three parts to any crafting table and build the Ragnarok DG-4."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable RocketShield =
            new Buildable("Rocket Shield")

                    .addStep(new BuildableStep("Collect the Rocket Canisters")
                            .addSubStep(new BuildableStep(
                                    "Search the upper courtyard near the Death Ray."
                            ))
                            .addSubStep(new BuildableStep(
                                            "The canisters can appear on the crates immediately after entering the courtyard."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "They can appear beside the lower staircase leading toward the bridge."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "They can also appear at the top of the staircase leading toward the Bastion and Death Ray."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Griffin Plate")
                            .addSubStep(new BuildableStep(
                                    "Search the courtyard in front of the Church."
                            ))
                            .addSubStep(new BuildableStep(
                                            "The Griffin Plate can appear beside the stairs leading down from the Clock Tower."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "It can appear beside the main Church entrance."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "It can also appear inside the Clock Tower near the dead zombie."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Collect the Shield Frame and Build the Shield")
                            .addSubStep(new BuildableStep(
                                    "Turn on the power and wait for anti-gravity to activate in the Pyramid Room."
                            ))
                            .addSubStep(new BuildableStep(
                                            "The frame can appear on the wall decoration above the Pyramid Room crafting table."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "It can appear above the doorway leading into the teleporter room."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "It can also appear above the Pack-A-Punch teleporter pad."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Wall-run over the part to collect it."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Take all three parts to a crafting table and build the Rocket Shield."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable WrathOfTheAncients =
            new Buildable("Wrath of the Ancients")

                    .addStep(new BuildableStep("Feed the Courtyard Dragon")
                            .addSubStep(new BuildableStep(
                                            "Locate the dragon head in the courtyard beyond Double Tap Root Beer."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Kill approximately eight zombies close to the dragon."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Wait for the dragon to finish eating each zombie before killing the next."
                            ))
                            .addSubStep(new BuildableStep(
                                    "The dragon will turn back into stone and break apart when fully fed."
                            ))
                    )

                    .addStep(new BuildableStep("Feed the Church Dragon")
                            .addSubStep(new BuildableStep(
                                            "Locate the dragon head above the fireplace inside the Church."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Feed it approximately eight zombies, waiting for each eating animation to finish."
                            ))
                    )

                    .addStep(new BuildableStep("Feed the Pyramid Dragon")
                            .addSubStep(new BuildableStep(
                                            "Locate the third dragon near the Pyramid and four bow pedestals in the underground area."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Feed it approximately eight zombies."
                            ))
                    )

                    .addStep(new BuildableStep("Collect the Wrath of the Ancients")
                            .addSubStep(new BuildableStep(
                                    "After all three dragons have been fed, go to the knight's tomb above the Pyramid Room."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Collect the Wrath of the Ancients from the opened stone coffin."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable StormBow =
            new Buildable("Storm Bow")

                    .addStep(new BuildableStep("Begin the Storm Bow Quest")
                            .addSubStep(new BuildableStep(
                                            "Shoot the dragon-shaped weather vane on top of the castle using the Wrath of the Ancients."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Collect the broken blue arrow that falls from the weather vane."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Ignite the Three Bonfires")
                            .addSubStep(new BuildableStep(
                                            "Use charged arrows to ignite the bonfire on the distant hillside below the castle."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Ignite the bonfire on the castle rampart outside the Clock Tower."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Ignite the bonfire on the mountain above the Rocket Launch Site."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Activate the Wall-Run Symbols")
                            .addSubStep(new BuildableStep(
                                    "Wait for anti-gravity to activate inside the Pyramid Room."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Wall-run across all five blue wind symbols without touching the floor."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "The symbols will remain illuminated when completed correctly."
                            ))
                    )

                    .addStep(new BuildableStep("Charge the Three Electrical Urns")
                            .addSubStep(new BuildableStep(
                                            "Kill approximately six zombies beside the urn inside the Clock Tower."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Charge the urn inside the room above Double Tap Root Beer."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Charge the urn inside the tunnel connecting the teleporter to the Rocket Launch Site."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Electrify the Bonfires")
                            .addSubStep(new BuildableStep(
                                    "Draw the bow while standing beside a charged urn to electrify the arrow."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Without releasing the draw, shoot one of the previously ignited bonfires."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Each urn can electrify only one bonfire. Repeat the process for all three bonfires."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Return to the weather vane and interact with the blue electrical smoke to collect the reforged arrow."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Charge and Collect the Storm Bow")
                            .addSubStep(new BuildableStep(
                                            "Place the reforged arrow onto the blue pedestal beside the Pyramid."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Kill zombies near the pedestal until the arrow is fully charged."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Interact with the charged arrow and collect Kreema'ahm la Ahmahm, the Storm Bow."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable WolfBow =
            new Buildable("Wolf Bow")

                    .addStep(new BuildableStep("Activate the Four Wolf Paintings")
                            .addSubStep(new BuildableStep(
                                    "Interact with the four paintings in the correct chronological order."
                            ))
                            .addSubStep(new BuildableStep(
                                    "First activate the painting of the king sitting on his throne with the wolf."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Next activate the painting of the armored king riding his horse."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Next activate the painting of the burning castle and dark creature."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Finally activate the painting of the king's skeleton."
                            ))
                            .addSubStep(new BuildableStep(
                                            "The paintings are found near Samantha's room, on the Church balcony, inside the Clock Tower, and in the room beneath the Clock Tower."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Collect the broken green arrow from the wall beside the Wolf Bow pedestal in the Pyramid Room."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Retrieve the Wolf Skull")
                            .addSubStep(new BuildableStep(
                                    "Travel to the Rocket Launch Site."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Shoot the base of the red flag on the mountain above the tunnel entrance."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Collect the glowing wolf skull that falls from the mountain."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Place the skull onto the headless wolf skeleton beside the green pedestal in the Pyramid Room."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Follow the Spectral Wolf")
                            .addSubStep(new BuildableStep(
                                    "Follow the spectral wolf to its first burial site."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Kill zombies near the glowing pile of bones until the wolf digs up a bone."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Collect the bone and follow the wolf to the next location."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Repeat the soul collection process at all three burial sites."
                            ))
                            .addSubStep(new BuildableStep(
                                    "The sites are in the main courtyard, near Double Tap Root Beer, and in the Pyramid Room near Pack-A-Punch."
                            ))
                    )

                    .addStep(new BuildableStep("Retrieve, Charge, and Collect the Wolf Bow")
                            .addSubStep(new BuildableStep(
                                    "Follow the wolf to the wall inside the Pyramid Room."
                            ))
                            .addSubStep(new BuildableStep(
                                            "During anti-gravity, wall-run past the glowing wolf symbol and shoot it with the Wrath of the Ancients."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Stand on the revealed platform and interact with the opening above the wolf."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Collect the reforged arrow from the opening."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Place the arrow onto the green Pyramid pedestal and kill zombies nearby."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Collect Kreeholo lu Kreemasaleet, the Wolf Bow, after the arrow is fully charged."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable VoidBow =
            new Buildable("Void Bow")

                    .addStep(new BuildableStep("Begin the Void Bow Quest")
                            .addSubStep(new BuildableStep(
                                            "Shoot the purple Void symbol above the tunnel doorway near Double Tap Root Beer."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Collect the broken purple arrow that falls from the wall."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Go to the Trophy Room beneath the Clock Tower."
                            ))
                            .addSubStep(new BuildableStep("Melee-kill a zombie while it is standing on the glowing purple floor tile.").addImage())
                            .addSubStep(new BuildableStep(
                                    "Interact with the broken tile to release the floating urn."
                            ))
                    )

                    .addStep(new BuildableStep("Collect the Six Skulls and Feed the Urn")
                            .addSubStep(new BuildableStep(
                                            "Collect the skull on the broken wall near Mule Kick."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Collect the skull on the exterior Church window to the right of the entrance."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Collect the skull inside the toy chest in Samantha's bedroom."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Collect the skull on the wall near Double Tap Root Beer."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Collect the skull inside the sink in the castle teleporter room."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                            "Collect the skull inside the truck at the Rocket Launch Site."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Return to the Trophy Room and lead six crawler zombies into the purple circle so the skulls consume them."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Shoot the floating urn with a charged arrow and remember the three spoken object names in their exact order."
                            ))
                    )

                    .addStep(new BuildableStep("Collect the Purple Runes")
                            .addSubStep(new BuildableStep(
                                    "Kill zombies anywhere on the map until six purple rune drops appear."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Collect each rune quickly because it disappears after only a few seconds."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Continue until all six runes are displayed inside the purple circle in the Trophy Room."
                            ))
                    )

                    .addStep(new BuildableStep("Decode the Knights and Retrieve the Arrow")
                            .addSubStep(new BuildableStep(
                                    "Enter the corridor connecting the Power Room to Samantha's room."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Find the knight statues whose emblems match the three object names spoken by the urn."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Interact with those knights in the exact order spoken by the urn."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Remember the three purple symbols revealed by the selected knights."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Return to the Trophy Room and shoot the matching floor symbols in the same order."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Collect the reforged Void arrow after the puzzle is completed."
                            ))
                    )

                    .addStep(new BuildableStep("Charge and Collect the Void Bow")
                            .addSubStep(new BuildableStep(
                                            "Place the reforged arrow onto the purple pedestal beside the Pyramid."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Kill zombies near the pedestal until the arrow is fully charged."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Interact with the arrow and collect Kreegakaleet lu Gosata'ahm, the Void Bow."
                                    )
                                            .addImage()
                            )
                    )
            ;


    public static final Buildable FireBow =
            new Buildable("Fire Bow")

                    .addStep(new BuildableStep("Begin the Fire Bow Quest")
                            .addSubStep(new BuildableStep(
                                    "Go to the upper floor of the Clock Tower."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Shoot a charged arrow into the marked wall to destroy it and collect the broken red arrow."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Travel to the Rocket Launch Site and wait for a rocket test."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Remain inside the safe teleporter room until the test finishes."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Immediately leave the room and shoot the glowing fireball above the concrete building before it moves out of range."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "A large fireball will move toward the castle and remain in the sky."
                            ))
                    )

                    .addStep(new BuildableStep("Activate and Charge the Three Fire Circles")
                            .addSubStep(new BuildableStep(
                                    "Use the Wunder Spheres to launch through the air and shoot the three glowing red circles with charged arrows."
                            ))
                            .addSubStep(new BuildableStep(
                                            "One circle is near the Death Ray, one is near the Wunderfizz machine on the castle roof, and one is near the vehicle on the uphill route from Double Tap."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "After activating the circles, stand inside each one and kill zombies."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Continue until energy travels from each circle into the fireball in the sky."
                            ))
                    )

                    .addStep(new BuildableStep("Move the Fire Rock into the Fireplace")
                            .addSubStep(new BuildableStep(
                                            "Interact with the clock mechanism in the Clock Tower."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "The displayed symbol identifies one of three fireplaces."
                            ))
                            .addSubStep(new BuildableStep(
                                            "The possible fireplaces are inside the Church, inside the room above Double Tap, and near Samantha's bedroom."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "One of the three charged circles will glow."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Stand inside the glowing circle and fire a charged arrow at the ground to create a fire rock."
                            ))
                            .addSubStep(new BuildableStep(
                                    "Move the fire rock from the circle to the selected fireplace using no more than three charged-arrow shots."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Interact with the fireplace after the rock reaches it to collect the transformed arrow."
                                    )
                                            .addImage()
                            )
                    )

                    .addStep(new BuildableStep("Reforge, Charge, and Collect the Fire Bow")
                            .addSubStep(new BuildableStep(
                                            "Return to the top of the castle and interact with the large fireball."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "The fireball will rise and explode, leaving the reforged arrow behind."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Collect the arrow and place it onto the red pedestal beside the Pyramid."
                                    )
                                            .addImage()
                            )
                            .addSubStep(new BuildableStep(
                                    "Kill zombies near the pedestal until the arrow is fully charged."
                            ))
                            .addSubStep(new BuildableStep(
                                            "Collect Kreeaho'ahm nal Ahmhogaroc, the Fire Bow."
                                    )
                                            .addImage()
                            )
                    )
            ;

    public static final List<Buildable> DerEisendrache_Buildables = Arrays.asList(
            RagnarokDG4,
            RocketShield,
            WrathOfTheAncients,
            StormBow,
            WolfBow,
            VoidBow,
            FireBow
    );
}
