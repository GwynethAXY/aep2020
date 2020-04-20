package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HonorTileTest {
    @Test
    public void westWindIdOneShouldEqualWestWindIdTwo(){
        HonorTile westWindIdOne = new HonorTile(HonorTile.Wind.WEST, HonorTile.Id.ONE);
        HonorTile westWindIdTwo = new HonorTile(HonorTile.Wind.WEST, HonorTile.Id.TWO);
        assertTrue(westWindIdOne.equals(westWindIdTwo));
    }

    @Test
    public void redDragonIdOneShouldEqualRedDragonIdTwo(){
        HonorTile redDragonIdOne = new HonorTile(HonorTile.Dragon.RED, HonorTile.Id.ONE);
        HonorTile redDragonIdTwo = new HonorTile(HonorTile.Dragon.RED, HonorTile.Id.TWO);
        assertTrue(redDragonIdOne.equals(redDragonIdTwo));
    }

    @Test
    public void tripleNorthWindPongIsLegal(){
        HonorTile northWindIdOne = new HonorTile(HonorTile.Wind.NORTH, HonorTile.Id.ONE);
        HonorTile northWindIdTwo = new HonorTile(HonorTile.Wind.NORTH, HonorTile.Id.TWO);
        HonorTile northWindIdThree = new HonorTile(HonorTile.Wind.NORTH, HonorTile.Id.THREE);
        assertTrue(northWindIdOne.canPong(northWindIdTwo,northWindIdThree));
        assertTrue(northWindIdTwo.canPong(northWindIdOne,northWindIdThree));
        assertTrue(northWindIdThree.canPong(northWindIdOne,northWindIdTwo));
    }

    @Test
    public void southWindThreeDotsNorthWindPongIsIllegal(){
        HonorTile northWind = new HonorTile(HonorTile.Wind.NORTH, HonorTile.Id.ONE);
        HonorTile southWind = new HonorTile(HonorTile.Wind.SOUTH, HonorTile.Id.TWO);
        NumberedTile threeDots = new NumberedTile(NumberedTile.Suit.DOTS, NumberedTile.Number.THREE, NumberedTile.Id.THREE);
        assertFalse(northWind.canPong(southWind,threeDots));
        assertFalse(southWind.canPong(northWind,threeDots));
        assertFalse(threeDots.canPong(northWind,southWind));
    }

    @Test
    public void fourWhiteDragonKangIsLegal(){
        HonorTile whiteDragonIdOne = new HonorTile(HonorTile.Dragon.WHITE, HonorTile.Id.ONE);
        HonorTile whiteDragonIdTwo = new HonorTile(HonorTile.Dragon.WHITE, HonorTile.Id.TWO);
        HonorTile whiteDragonIdThree = new HonorTile(HonorTile.Dragon.WHITE, HonorTile.Id.THREE);
        HonorTile whiteDragonIdFour = new HonorTile(HonorTile.Dragon.WHITE, HonorTile.Id.FOUR);
        assertTrue(whiteDragonIdFour.canKang(whiteDragonIdOne,whiteDragonIdTwo,whiteDragonIdThree));

    }

}
