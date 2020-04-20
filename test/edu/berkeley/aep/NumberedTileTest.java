package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NumberedTileTest {

    @Test
    public void eightBambooIdOneEqualsEightBambooIdTwo(){
        NumberedTile eightbambooIdOne = new NumberedTile(NumberedTile.Suit.BAMBOO, NumberedTile.Number.EIGHT, NumberedTile.Id.ONE);
        NumberedTile eightBambooIdTwo = new NumberedTile(NumberedTile.Suit.BAMBOO, NumberedTile.Number.EIGHT, NumberedTile.Id.TWO);
        assertTrue(eightbambooIdOne.equals(eightBambooIdTwo));
    }

    @Test
    public void sevenBambooIdOneShouldNotEqualsEightBambooIdOne(){
        NumberedTile eightbambooIdOne = new NumberedTile(NumberedTile.Suit.BAMBOO, NumberedTile.Number.SEVEN, NumberedTile.Id.ONE);
        NumberedTile sevenbambooIdOne = new NumberedTile(NumberedTile.Suit.BAMBOO, NumberedTile.Number.EIGHT, NumberedTile.Id.ONE);
        assertFalse(eightbambooIdOne.equals(sevenbambooIdOne));
    }

    @Test
    public void fiveSixSevenBambooChowIsLegal(){
        NumberedTile fiveBamboo = new NumberedTile(NumberedTile.Suit.BAMBOO, NumberedTile.Number.FIVE, NumberedTile.Id.TWO);
        NumberedTile sixBamboo = new NumberedTile(NumberedTile.Suit.BAMBOO, NumberedTile.Number.SIX, NumberedTile.Id.TWO);
        NumberedTile sevenBamboo = new NumberedTile(NumberedTile.Suit.BAMBOO, NumberedTile.Number.SEVEN, NumberedTile.Id.TWO);
        assertTrue(fiveBamboo.canChow(sixBamboo,sevenBamboo));
        assertTrue(sixBamboo.canChow(fiveBamboo,sevenBamboo));
        assertTrue(sevenBamboo.canChow(fiveBamboo,sixBamboo));
    }

    @Test
    public void oneSixSevenCharactersChowIsIllegal(){
        NumberedTile oneCharacter = new NumberedTile(NumberedTile.Suit.CHARACTER, NumberedTile.Number.ONE, NumberedTile.Id.ONE);
        NumberedTile sixCharacter = new NumberedTile(NumberedTile.Suit.CHARACTER, NumberedTile.Number.SIX, NumberedTile.Id.TWO);
        NumberedTile sevenCharacter = new NumberedTile(NumberedTile.Suit.CHARACTER, NumberedTile.Number.SEVEN, NumberedTile.Id.THREE);
        assertFalse(oneCharacter.canChow(sixCharacter,sevenCharacter));
        assertFalse(sixCharacter.canChow(oneCharacter,sevenCharacter));
        assertFalse(sevenCharacter.canChow(oneCharacter,sixCharacter));
    }

    @Test
    public void fourDotsAndFiveSixBambooChowShouldBeIllegal(){
        NumberedTile fourDots = new NumberedTile(NumberedTile.Suit.DOTS, NumberedTile.Number.FOUR, NumberedTile.Id.TWO);
        NumberedTile fiveBamboo = new NumberedTile(NumberedTile.Suit.BAMBOO, NumberedTile.Number.FIVE, NumberedTile.Id.TWO);
        NumberedTile sixBamboo = new NumberedTile(NumberedTile.Suit.BAMBOO, NumberedTile.Number.SIX, NumberedTile.Id.TWO);
        assertFalse(fourDots.canChow(fiveBamboo,sixBamboo));
        assertFalse(fiveBamboo.canChow(fourDots,sixBamboo));
        assertFalse(sixBamboo.canChow(fourDots,fiveBamboo));
    }

    @Test
    public void tripleNineBamboosPongIsLegal(){
        NumberedTile nineBambooIdOne = new NumberedTile(NumberedTile.Suit.BAMBOO, NumberedTile.Number.NINE, NumberedTile.Id.ONE);
        NumberedTile nineBambooIdTwo = new NumberedTile(NumberedTile.Suit.BAMBOO, NumberedTile.Number.NINE, NumberedTile.Id.TWO);
        NumberedTile nineBambooIdFour = new NumberedTile(NumberedTile.Suit.BAMBOO, NumberedTile.Number.NINE, NumberedTile.Id.FOUR);
        assertTrue(nineBambooIdFour.canPong(nineBambooIdOne,nineBambooIdTwo));
    }

    @Test
    public void nineDotsNineCharacterNineBambooPongIsIllegal(){
        NumberedTile nineDots = new NumberedTile(NumberedTile.Suit.DOTS, NumberedTile.Number.NINE, NumberedTile.Id.ONE);
        NumberedTile nineCharacter = new NumberedTile(NumberedTile.Suit.CHARACTER, NumberedTile.Number.NINE, NumberedTile.Id.TWO);
        NumberedTile nineBamboo = new NumberedTile(NumberedTile.Suit.BAMBOO, NumberedTile.Number.NINE, NumberedTile.Id.FOUR);
        assertFalse(nineDots.canPong(nineCharacter,nineBamboo));
    }

    @Test
    public void fourTwoCharacterKangIsLegal(){
        NumberedTile twoCharacterIdOne = new NumberedTile(NumberedTile.Suit.CHARACTER, NumberedTile.Number.TWO, NumberedTile.Id.ONE);
        NumberedTile twoCharacterIdTwo = new NumberedTile(NumberedTile.Suit.CHARACTER, NumberedTile.Number.TWO, NumberedTile.Id.TWO);
        NumberedTile twoCharacterIdThree = new NumberedTile(NumberedTile.Suit.CHARACTER, NumberedTile.Number.TWO, NumberedTile.Id.THREE);
        NumberedTile twoCharacterIdFour = new NumberedTile(NumberedTile.Suit.CHARACTER, NumberedTile.Number.TWO, NumberedTile.Id.FOUR);
        assertTrue(twoCharacterIdFour.canKang(twoCharacterIdOne,twoCharacterIdTwo,twoCharacterIdThree));
    }


}
