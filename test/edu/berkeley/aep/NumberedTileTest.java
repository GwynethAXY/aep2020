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


}
