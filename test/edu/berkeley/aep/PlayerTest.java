package edu.berkeley.aep;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class PlayerTest {
    @Test
    public void playerHandWithNoOpenHandToHaveTwelveTilesAltogetherAfterDiscard(){
        ArrayList<Tile> playerHand = handOfThirteenTiles();
        ArrayList<Tile> bonusTiles = new ArrayList<>();
        ArrayList<Tile> openHand = new ArrayList<>();

        Player player = new Player(playerHand,bonusTiles,openHand);
        ArrayList<Tile> hand = player.discardFromConcealedHandUsingIndex(0);
        assertEquals(12,hand.size());
    }

    @Test
    public void sumOfPlayerHandAndOpenHandToHaveTwelveTilesAltogetherAfterDiscard(){
        ArrayList<Tile> playerHand = handOfTenTiles();
        ArrayList<Tile> bonusTiles = new ArrayList<>();
        ArrayList<Tile> openHand = openHandOfThreeTiles();

        Player player = new Player(playerHand,bonusTiles,openHand);
        ArrayList<Tile> hand = player.discardFromConcealedHandUsingIndex(0);
        assertEquals(12,hand.size()+openHand.size());
    }

    public ArrayList<Tile> handOfThirteenTiles(){
        ArrayList<Tile> playerHand = new ArrayList<>();
        playerHand.add(new NumberedTile(NumberedTile.Suit.BAMBOO, NumberedTile.Number.FOUR, NumberedTile.Id.THREE));
        playerHand.add(new NumberedTile(NumberedTile.Suit.BAMBOO, NumberedTile.Number.SEVEN, NumberedTile.Id.ONE));
        playerHand.add(new NumberedTile(NumberedTile.Suit.BAMBOO, NumberedTile.Number.EIGHT, NumberedTile.Id.ONE));
        playerHand.add(new HonorTile(HonorTile.Dragon.RED, HonorTile.Id.ONE));
        playerHand.add(new HonorTile(HonorTile.Dragon.RED, HonorTile.Id.TWO));
        playerHand.add(new NumberedTile(NumberedTile.Suit.CHARACTER, NumberedTile.Number.ONE, NumberedTile.Id.ONE));
        playerHand.add(new NumberedTile(NumberedTile.Suit.CHARACTER, NumberedTile.Number.SIX, NumberedTile.Id.TWO));
        playerHand.add(new HonorTile(HonorTile.Dragon.WHITE, HonorTile.Id.THREE));
        playerHand.add(new HonorTile(HonorTile.Dragon.WHITE, HonorTile.Id.FOUR));
        playerHand.add(new HonorTile(HonorTile.Dragon.GREEN, HonorTile.Id.THREE));
        playerHand.add(new NumberedTile(NumberedTile.Suit.CHARACTER, NumberedTile.Number.SEVEN, NumberedTile.Id.THREE));
        playerHand.add(new NumberedTile(NumberedTile.Suit.DOTS, NumberedTile.Number.FOUR, NumberedTile.Id.TWO));
        playerHand.add(new NumberedTile(NumberedTile.Suit.DOTS, NumberedTile.Number.NINE, NumberedTile.Id.ONE));
        System.out.println(playerHand.size());
        return playerHand;
    }

    public ArrayList<Tile> handOfTenTiles(){
        ArrayList<Tile> playerHand = new ArrayList<>();
        playerHand.add(new NumberedTile(NumberedTile.Suit.BAMBOO, NumberedTile.Number.FOUR, NumberedTile.Id.THREE));
        playerHand.add(new NumberedTile(NumberedTile.Suit.BAMBOO, NumberedTile.Number.SEVEN, NumberedTile.Id.ONE));
        playerHand.add(new NumberedTile(NumberedTile.Suit.BAMBOO, NumberedTile.Number.EIGHT, NumberedTile.Id.ONE));
        playerHand.add(new NumberedTile(NumberedTile.Suit.CHARACTER, NumberedTile.Number.ONE, NumberedTile.Id.ONE));
        playerHand.add(new NumberedTile(NumberedTile.Suit.CHARACTER, NumberedTile.Number.SIX, NumberedTile.Id.TWO));
        playerHand.add(new HonorTile(HonorTile.Dragon.WHITE, HonorTile.Id.THREE));
        playerHand.add(new HonorTile(HonorTile.Dragon.WHITE, HonorTile.Id.FOUR));
        playerHand.add(new NumberedTile(NumberedTile.Suit.CHARACTER, NumberedTile.Number.SEVEN, NumberedTile.Id.THREE));
        playerHand.add(new NumberedTile(NumberedTile.Suit.DOTS, NumberedTile.Number.FOUR, NumberedTile.Id.TWO));
        playerHand.add(new NumberedTile(NumberedTile.Suit.DOTS, NumberedTile.Number.NINE, NumberedTile.Id.ONE));
        System.out.println(playerHand.size());
        return playerHand;
    }

    public ArrayList<Tile> openHandOfThreeTiles(){
        ArrayList<Tile> openHand = new ArrayList<>();
        openHand.add(new HonorTile(HonorTile.Dragon.RED, HonorTile.Id.ONE));
        openHand.add(new HonorTile(HonorTile.Dragon.RED, HonorTile.Id.TWO));
        openHand.add(new HonorTile(HonorTile.Dragon.RED, HonorTile.Id.THREE));
        return openHand;
    }

}
