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
}
