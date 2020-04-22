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
}
