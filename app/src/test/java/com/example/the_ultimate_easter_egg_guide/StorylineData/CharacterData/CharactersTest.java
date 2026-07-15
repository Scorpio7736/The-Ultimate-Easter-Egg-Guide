package com.example.the_ultimate_easter_egg_guide.StorylineData.CharacterData;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.example.the_ultimate_easter_egg_guide.Models.Storyline.NonPlayer_CharacterGroups;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.Player_CharacterGroups;
import com.example.the_ultimate_easter_egg_guide.Models.Storyline.CharacterVersions;

import org.junit.Test;

public class CharactersTest {

    @Test
    public void testPlayerCharactersNotNull() {
        for (Player_Characters character : Player_Characters.values()) {
            assertNotNull("Character name should not be null for " + character.name(), character.characterName);
            assertNotNull("Character group should not be null for " + character.name(), character.playerCharacterGroup);
            assertNotNull("Character version should not be null for " + character.name(), character.characterVersions);
            assertNotNull("Nicknames list should not be null for " + character.name(), character.characterNicknames);
            assertTrue("Character image should be valid for " + character.name(), character.characterImage != 0);
        }
    }

    @Test
    public void testNonPlayerCharactersNotNull() {
        for (NonPlayer_Characters character : NonPlayer_Characters.values()) {
            assertNotNull("Character name should not be null for " + character.name(), character.characterName);
            assertNotNull("Character group should not be null for " + character.name(), character.nonPlayerCharacterGroup);
            assertNotNull("Character version should not be null for " + character.name(), character.characterVersions);
            assertNotNull("Nicknames list should not be null for " + character.name(), character.characterNicknames);
            assertTrue("Character image should be valid for " + character.name(), character.characterImage != 0);
        }
    }

    @Test
    public void testSpecificPlayerCharacter() {
        Player_Characters richtofen = Player_Characters.EdwardRichtofen_Primis;
        assertEquals("Dr. Edward Richtofen", richtofen.characterName);
        assertEquals(Player_CharacterGroups.Primis, richtofen.playerCharacterGroup);
        assertEquals(CharacterVersions.Primis, richtofen.characterVersions);
    }

    @Test
    public void testSpecificNonPlayerCharacter() {
        NonPlayer_Characters maxis = NonPlayer_Characters.LudwigMaxis_Ultimis;
        assertEquals("Dr. Ludwig Maxis", maxis.characterName);
        assertEquals(NonPlayer_CharacterGroups.Group935_Ultimis, maxis.nonPlayerCharacterGroup);
        assertEquals(CharacterVersions.Ultimis, maxis.characterVersions);
    }
}
