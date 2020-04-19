package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BonusTileTest {
    @Test
    public void springBonusTileShouldPairPlumBonusTile(){
        BonusTile springBonusTile = new BonusTile(BonusTile.Season.SPRING);
        BonusTile plumBonusTile = new BonusTile(BonusTile.Flower.PLUM);
        assertTrue(springBonusTile.bonusTilePair(plumBonusTile));
        assertTrue(plumBonusTile.bonusTilePair(springBonusTile));
    }

    @Test
    public void summerBonusTileShouldPairOrchidBonusTile(){
        BonusTile summerBonusTile = new BonusTile(BonusTile.Season.SUMMER);
        BonusTile orchidBonusTile = new BonusTile(BonusTile.Flower.ORCHID);
        assertTrue(summerBonusTile.bonusTilePair(orchidBonusTile));
        assertTrue(orchidBonusTile.bonusTilePair(summerBonusTile));
    }

    @Test
    public void autumnBonusTileShouldEqualChrysanthemumBonusTile(){
        BonusTile autumnBonusTile = new BonusTile(BonusTile.Season.AUTUMN);
        BonusTile chrysanthemumBonusTile = new BonusTile(BonusTile.Flower.CHRYSANTHEMUM);
        assertTrue(autumnBonusTile.bonusTilePair(chrysanthemumBonusTile));
        assertTrue(chrysanthemumBonusTile.bonusTilePair(autumnBonusTile));
    }

    @Test
    public void winterBonusTileShouldPairBambooBonusTile(){
        BonusTile winterBonusTile = new BonusTile(BonusTile.Season.WINTER);
        BonusTile bambooBonusTile = new BonusTile(BonusTile.Flower.BAMBOO);
        assertTrue(winterBonusTile.bonusTilePair(bambooBonusTile));
        assertTrue(bambooBonusTile.bonusTilePair(winterBonusTile));
    }


}