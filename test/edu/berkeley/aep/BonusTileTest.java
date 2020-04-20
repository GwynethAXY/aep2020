package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BonusTileTest {
    @Test
    public void springBonusTileShouldPairPlumBonusTile(){
        BonusTile springBonusTile = new BonusTile(BonusTile.Season.SPRING);
        BonusTile plumBonusTile = new BonusTile(BonusTile.Flower.PLUM);
        assertTrue(springBonusTile.bonusTileFlowerSeasonPair(plumBonusTile));
        assertTrue(plumBonusTile.bonusTileFlowerSeasonPair(springBonusTile));
    }

    @Test
    public void summerBonusTileShouldPairOrchidBonusTile(){
        BonusTile summerBonusTile = new BonusTile(BonusTile.Season.SUMMER);
        BonusTile orchidBonusTile = new BonusTile(BonusTile.Flower.ORCHID);
        assertTrue(summerBonusTile.bonusTileFlowerSeasonPair(orchidBonusTile));
        assertTrue(orchidBonusTile.bonusTileFlowerSeasonPair(summerBonusTile));
    }

    @Test
    public void autumnBonusTileShouldEqualChrysanthemumBonusTile(){
        BonusTile autumnBonusTile = new BonusTile(BonusTile.Season.AUTUMN);
        BonusTile chrysanthemumBonusTile = new BonusTile(BonusTile.Flower.CHRYSANTHEMUM);
        assertTrue(autumnBonusTile.bonusTileFlowerSeasonPair(chrysanthemumBonusTile));
        assertTrue(chrysanthemumBonusTile.bonusTileFlowerSeasonPair(autumnBonusTile));
    }

    @Test
    public void winterBonusTileShouldPairBambooBonusTile(){
        BonusTile winterBonusTile = new BonusTile(BonusTile.Season.WINTER);
        BonusTile bambooBonusTile = new BonusTile(BonusTile.Flower.BAMBOO);
        assertTrue(winterBonusTile.bonusTileFlowerSeasonPair(bambooBonusTile));
        assertTrue(bambooBonusTile.bonusTileFlowerSeasonPair(winterBonusTile));
    }

    @Test
    public void winterBonusTileShouldNotPairPlumBonusTile() {
        BonusTile winterBonusTile = new BonusTile(BonusTile.Season.WINTER);
        BonusTile plumBonusTile = new BonusTile(BonusTile.Flower.PLUM);
        assertFalse(winterBonusTile.bonusTileFlowerSeasonPair(plumBonusTile));
        assertFalse(plumBonusTile.bonusTileFlowerSeasonPair(winterBonusTile));
    }

    @Test
    public void catBonusTileShouldPairRatBonusTile(){
        BonusTile catBonusTile = new BonusTile(BonusTile.Animal.CAT);
        BonusTile ratBonusTile = new BonusTile(BonusTile.Animal.RAT);
        assertTrue(catBonusTile.bonusTileAnimalPair(ratBonusTile));
        assertTrue(ratBonusTile.bonusTileAnimalPair(catBonusTile));
    }

    @Test
    public void roosterBonusTileShouldPairCentipedeBonusTile(){
        BonusTile roosterBonusTile = new BonusTile(BonusTile.Animal.ROOSTER);
        BonusTile centipedeBonusTile = new BonusTile(BonusTile.Animal.CENTIPEDE);
        assertTrue(roosterBonusTile.bonusTileAnimalPair(centipedeBonusTile));
        assertTrue(centipedeBonusTile.bonusTileAnimalPair(roosterBonusTile));
    }


}