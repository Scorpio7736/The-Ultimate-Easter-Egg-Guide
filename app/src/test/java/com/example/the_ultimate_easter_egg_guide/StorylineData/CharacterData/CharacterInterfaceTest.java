package com.example.the_ultimate_easter_egg_guide.StorylineData.CharacterData;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.example.the_ultimate_easter_egg_guide.Models.Storyline.IStorylineItems;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.Player_CharacterGroups;

import com.example.the_ultimate_easter_egg_guide.Models.Storyline.NonPlayer_CharacterGroups;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class CharacterInterfaceTest {

    @Test
    public void testPolymorphicCharacterList() {
        List<IStorylineItems> characters = new ArrayList<>();
        
        // Add a Player Character
        characters.add(Player_Characters.EdwardRichtofen_Primis);
        // Add a Non-Player Character
        characters.add(NonPlayer_Characters.LudwigMaxis_Ultimis);

        assertEquals(2, characters.size());

        for (IStorylineItems character : characters) {
            assertNotNull("Name should be accessible via interface", character.GetDisplayName());
            assertNotNull("Group should be accessible via interface", character.GetGroup());
            assertTrue("Image ID should be valid", character.GetImage() != 0);
        }
    }

    @Test
    public void testPlayerCharacterInterfaceImplementation() {
        IStorylineItems character = Player_Characters.EdwardRichtofen_Primis;
        
        assertEquals("Dr. Edward Richtofen", character.GetDisplayName());
        assertEquals(Player_CharacterGroups.Primis, character.GetGroup());
        // Verify field matches getter
        assertEquals(Player_Characters.EdwardRichtofen_Primis.characterName, character.GetDisplayName());
        assertEquals(Player_Characters.EdwardRichtofen_Primis.playerCharacterGroup, character.GetGroup());
    }

    @Test
    public void testNonPlayerCharacterInterfaceImplementation() {
        IStorylineItems character = NonPlayer_Characters.LudwigMaxis_Ultimis;
        
        assertEquals("Dr. Ludwig Maxis", character.GetDisplayName());
        assertEquals(NonPlayer_CharacterGroups.Group935_Ultimis, character.GetGroup());
        // Verify field matches getter
        assertEquals(NonPlayer_Characters.LudwigMaxis_Ultimis.characterName, character.GetDisplayName());
        assertEquals(NonPlayer_Characters.LudwigMaxis_Ultimis.nonPlayerCharacterGroup, character.GetGroup());
    }

    @Test
    public void testAllPlayerCharactersImplementInterface() {
        for (Player_Characters pc : Player_Characters.values()) {
            assertTrue(pc instanceof IStorylineItems);
            IStorylineItems character = (IStorylineItems) pc;
            assertEquals(pc.characterName, character.GetDisplayName());
            assertEquals(pc.playerCharacterGroup, character.GetGroup());
        }
    }

    @Test
    public void testAllNonPlayerCharactersImplementInterface() {
        for (NonPlayer_Characters npc : NonPlayer_Characters.values()) {
            assertTrue(npc instanceof IStorylineItems);
            IStorylineItems character = (IStorylineItems) npc;
            assertEquals(npc.characterName, character.GetDisplayName());
            assertEquals(npc.nonPlayerCharacterGroup, character.GetGroup());
        }
    }
}
