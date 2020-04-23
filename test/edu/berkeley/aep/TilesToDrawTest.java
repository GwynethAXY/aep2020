package edu.berkeley.aep;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TilesToDrawTest {
    @Test
    public void startOfGameShouldHaveHundredFortyEightTiles(){
        TilesToDraw startGame = new TilesToDraw();
        assertEquals(148,startGame.initTiles().size());
    }

    @Test
    public void tilePileShouldHaveNinetyFiveTilesAfterFirstDraw(){
        TilesToDraw startGame = new TilesToDraw();
        ArrayList<Tile> startingTiles = startGame.initTiles();
        startingTiles = startGame.firstDraw(startingTiles).get(0);
        assertEquals(95,startingTiles.size());
    }

    @Test
    public void playerOneShouldStartWithFourteenTiles(){
        TilesToDraw startGame = new TilesToDraw();
        ArrayList<Tile> startingTiles = startGame.initTiles();
        ArrayList<Tile> playerOneTiles = startGame.firstDraw(startingTiles).get(1);
        assertEquals(14,playerOneTiles.size());
    }

    @Test
    public void playerTwoThreeFourShouldStartWithFourteenTiles(){
        TilesToDraw startGame = new TilesToDraw();
        ArrayList<Tile> startingTiles = startGame.initTiles();
        ArrayList<ArrayList<Tile>> tileDeckAndPlayerHands = startGame.firstDraw(startingTiles);
        assertEquals(13,tileDeckAndPlayerHands.get(2).size());
        assertEquals(13,tileDeckAndPlayerHands.get(3).size());
        assertEquals(13,tileDeckAndPlayerHands.get(4).size());
    }

    @Test
    public void replenishTilesFromBackOfTileDeckAfterDrawingBonusTile(){
        TilesToDraw startGame = new TilesToDraw();
        ArrayList<Tile> tileDeck = new ArrayList<>();

        tileDeck.add(new NumberedTile(NumberedTile.Suit.DOTS, NumberedTile.Number.NINE, NumberedTile.Id.ONE));
        tileDeck.add(new NumberedTile(NumberedTile.Suit.CHARACTER, NumberedTile.Number.NINE, NumberedTile.Id.TWO));
        tileDeck.add(new NumberedTile(NumberedTile.Suit.DOTS, NumberedTile.Number.FOUR, NumberedTile.Id.TWO));

        tileDeck = startGame.replenishFlowers(tileDeck).get(0);

        ArrayList<Tile> desiredDeck = new ArrayList<>();
        desiredDeck.add(new NumberedTile(NumberedTile.Suit.DOTS, NumberedTile.Number.NINE, NumberedTile.Id.ONE));
        desiredDeck.add(new NumberedTile(NumberedTile.Suit.CHARACTER, NumberedTile.Number.NINE, NumberedTile.Id.TWO));

        assertEquals(((NumberedTile) desiredDeck.get(0)).suit,((NumberedTile)tileDeck.get(0)).suit);
        assertEquals(((NumberedTile) desiredDeck.get(0)).number,((NumberedTile)tileDeck.get(0)).number);
        assertEquals(((NumberedTile) desiredDeck.get(0)).id,((NumberedTile)tileDeck.get(0)).id);
        assertEquals(((NumberedTile) desiredDeck.get(1)).suit,((NumberedTile)tileDeck.get(1)).suit);
        assertEquals(((NumberedTile) desiredDeck.get(1)).number,((NumberedTile)tileDeck.get(1)).number);
        assertEquals(((NumberedTile) desiredDeck.get(1)).id,((NumberedTile)tileDeck.get(1)).id);

    }

    @Test
    public void eachTileDrawShouldBeFromFront(){
        TilesToDraw startGame = new TilesToDraw();
        ArrayList<Tile> tileDeck = new ArrayList<>();

        tileDeck.add(new NumberedTile(NumberedTile.Suit.DOTS, NumberedTile.Number.FOUR, NumberedTile.Id.TWO));
        tileDeck.add(new NumberedTile(NumberedTile.Suit.DOTS, NumberedTile.Number.NINE, NumberedTile.Id.ONE));
        tileDeck.add(new NumberedTile(NumberedTile.Suit.CHARACTER, NumberedTile.Number.NINE, NumberedTile.Id.TWO));


        tileDeck = startGame.drawTile(tileDeck).get(0);

        ArrayList<Tile> desiredDeck = new ArrayList<>();
        desiredDeck.add(new NumberedTile(NumberedTile.Suit.DOTS, NumberedTile.Number.NINE, NumberedTile.Id.ONE));
        desiredDeck.add(new NumberedTile(NumberedTile.Suit.CHARACTER, NumberedTile.Number.NINE, NumberedTile.Id.TWO));

        assertEquals(((NumberedTile) desiredDeck.get(0)).suit,((NumberedTile)tileDeck.get(0)).suit);
        assertEquals(((NumberedTile) desiredDeck.get(0)).number,((NumberedTile)tileDeck.get(0)).number);
        assertEquals(((NumberedTile) desiredDeck.get(0)).id,((NumberedTile)tileDeck.get(0)).id);
        assertEquals(((NumberedTile) desiredDeck.get(1)).suit,((NumberedTile)tileDeck.get(1)).suit);
        assertEquals(((NumberedTile) desiredDeck.get(1)).number,((NumberedTile)tileDeck.get(1)).number);
        assertEquals(((NumberedTile) desiredDeck.get(1)).id,((NumberedTile)tileDeck.get(1)).id);
    }

//    @Test
//    public void gameShouldEndWhenTileDeckHasFifteenTilesLeft(){
//        TilesToDraw game = new TilesToDraw();
//    }


}
