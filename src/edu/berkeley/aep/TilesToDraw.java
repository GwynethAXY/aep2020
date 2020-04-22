package edu.berkeley.aep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TilesToDraw {
    ArrayList<Tile> beginningTiles=new ArrayList<Tile>();

    public ArrayList<Tile> initTiles(){
        //Numbered Tiles - all suits
        for (NumberedTile.Suit suit : NumberedTile.Suit.values()){
            for(NumberedTile.Number number: NumberedTile.Number.values()){
                for(NumberedTile.Id id : NumberedTile.Id.values()){
                    beginningTiles.add(new NumberedTile(suit,number,id));
                }
            }
        }
        // Honor Tiles - three dragons and four winds
        for (HonorTile.Dragon dragon : HonorTile.Dragon.values()){
            for (HonorTile.Id id : HonorTile.Id.values()){
                beginningTiles.add(new HonorTile(dragon,id));
            }
        }
        for (HonorTile.Wind wind : HonorTile.Wind.values()){
            for (HonorTile.Id id : HonorTile.Id.values()){
                beginningTiles.add(new HonorTile(wind,id));
            }
        }
        // Bonus Tiles - all flowers
        for (BonusTile.Flower flower: BonusTile.Flower.values()) beginningTiles.add(new BonusTile(flower));
        for (BonusTile.Season season: BonusTile.Season.values()) beginningTiles.add(new BonusTile(season));
        for (BonusTile.Animal animal: BonusTile.Animal.values()) beginningTiles.add(new BonusTile(animal));


        System.out.println("size of beginningTiles: " + beginningTiles.size());

        return beginningTiles;
    }

    public ArrayList<ArrayList<Tile>> firstDraw(ArrayList<Tile> tiles) {
        Collections.shuffle(tiles);
        tiles = (ArrayList<Tile>) tiles;
        ArrayList<Tile> playerOne = new ArrayList<Tile>();
        ArrayList<Tile> playerTwo = new ArrayList<Tile>();
        ArrayList<Tile> playerThree = new ArrayList<Tile>();
        ArrayList<Tile> playerFour = new ArrayList<Tile>();
        ArrayList<ArrayList<Tile>> tileDeckAndPlayerHands = new ArrayList<ArrayList<Tile>>();
        int i = 148;
        int tracker = 1;
        while (i > 95){
            Tile tile = tiles.remove(0);
            if(tracker % 4 == 1) playerOne.add(tile);
            else if (tracker % 4 == 2) playerTwo.add(tile);
            else if (tracker % 4 == 3) playerThree.add(tile);
            else if (tracker % 4 == 0) playerFour.add(tile);
            tracker += 1;
            i -= 1;
        }
//            System.out.println("size of tiles: " + tiles.size());
        System.out.println("size of playerOne: " + playerOne.size());
        System.out.println("size of playerTwo: " + playerTwo.size());
        System.out.println("size of playerThree: " + playerThree.size());
        System.out.println("size of playerFour: " + playerFour.size());
        tileDeckAndPlayerHands.add(tiles);
        tileDeckAndPlayerHands.add(playerOne);
        tileDeckAndPlayerHands.add(playerTwo);
        tileDeckAndPlayerHands.add(playerThree);
        tileDeckAndPlayerHands.add(playerFour);
        return tileDeckAndPlayerHands;
    }

    public ArrayList<ArrayList<Tile>> replenishFlowers(ArrayList<Tile> tiles){
        System.out.println("size of tiles: " + tiles.size());
        ArrayList<Tile> newTileArr = new ArrayList<Tile>();
        ArrayList<ArrayList<Tile>> newDeckNewTile = new ArrayList<ArrayList<Tile>>();
        newTileArr.add(tiles.remove(tiles.size()-1));
        newDeckNewTile.add(tiles);
        newDeckNewTile.add(newTileArr);
        System.out.println("size of tiles: " + tiles.size());
        return newDeckNewTile;
    }
}
