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
        ArrayList<ArrayList<Tile>> result = startGame.firstDraw(startingTiles);
        assertEquals(13,result.get(2).size());
        assertEquals(13,result.get(3).size());
        assertEquals(13,result.get(4).size());
    }

}
