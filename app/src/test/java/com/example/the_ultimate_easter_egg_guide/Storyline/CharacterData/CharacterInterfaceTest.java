package com.example.the_ultimate_easter_egg_guide.Storyline.CharacterData;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.example.the_ultimate_easter_egg_guide.Models.Storyline.IStorylineItem;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.Player_CharacterGroup;

import com.example.the_ultimate_easter_egg_guide.Models.Storyline.NonPlayer_CharacterGroup;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class CharacterInterfaceTest {

    @Test
    public void testPolymorphicCharacterList() {
        List<IStorylineItem> characters = new ArrayList<>();
        
        // Add a Player Character
        characters.add(Player_Characters.EdwardRichtofen_Primis);
        // Add a Non-Player Character
        characters.add(NonPlayer_Characters.LudwigMaxis_Ultimis);

        assertEquals(2, characters.size());

        for (IStorylineItem character : characters) {
            assertNotNull("Name should be accessible via interface", character.getCharacterName());
            assertNotNull("Group should be accessible via interface", character.getCharacterGroup());
            assertTrue("Image ID should be valid", character.getCharacterImage() != 0);
        }
    }

    @Test
    public void testPlayerCharacterInterfaceImplementation() {
        IStorylineItem character = Player_Characters.EdwardRichtofen_Primis;
        
        assertEquals("Dr. Edward Richtofen", character.getCharacterName());
        assertEquals(Player_CharacterGroup.Primis, character.getCharacterGroup());
        // Verify field matches getter
        assertEquals(Player_Characters.EdwardRichtofen_Primis.characterName, character.getCharacterName());
        assertEquals(Player_Characters.EdwardRichtofen_Primis.playerCharacterGroup, character.getCharacterGroup());
    }

    @Test
    public void testNonPlayerCharacterInterfaceImplementation() {
        IStorylineItem character = NonPlayer_Characters.LudwigMaxis_Ultimis;
        
        assertEquals("Dr. Ludwig Maxis", character.getCharacterName());
        assertEquals(NonPlayer_CharacterGroup.Group935_Ultimis, character.getCharacterGroup());
        // Verify field matches getter
        assertEquals(NonPlayer_Characters.LudwigMaxis_Ultimis.characterName, character.getCharacterName());
        assertEquals(NonPlayer_Characters.LudwigMaxis_Ultimis.nonPlayerCharacterGroup, character.getCharacterGroup());
    }

    @Test
    public void testAllPlayerCharactersImplementInterface() {
        for (Player_Characters pc : Player_Characters.values()) {
            assertTrue(pc instanceof IStorylineItem);
            IStorylineItem character = (IStorylineItem) pc;
            assertEquals(pc.characterName, character.getCharacterName());
            assertEquals(pc.playerCharacterGroup, character.getCharacterGroup());
        }
    }

    @Test
    public void testAllNonPlayerCharactersImplementInterface() {
        for (NonPlayer_Characters npc : NonPlayer_Characters.values()) {
            assertTrue(npc instanceof IStorylineItem);
            IStorylineItem character = (IStorylineItem) npc;
            assertEquals(npc.characterName, character.getCharacterName());
            assertEquals(npc.nonPlayerCharacterGroup, character.getCharacterGroup());
        }
    }
}
