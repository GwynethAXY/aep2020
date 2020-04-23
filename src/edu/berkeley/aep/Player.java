package edu.berkeley.aep;

import java.util.ArrayList;

public class Player {
    ArrayList<Tile> concealedHand;
    ArrayList<Tile> bonusTiles;
    ArrayList<Tile> openHand;

    Player(ArrayList<Tile> concealedHand, ArrayList<Tile> bonusTiles, ArrayList<Tile> openHand){
        this.concealedHand = concealedHand;
        this.bonusTiles = bonusTiles;
        this. openHand = openHand;
    }

//    public ArrayList<Tile> discardFromConcealedHand(Tile discardTile){
//        System.out.println("concealedHand1: " + concealedHand.size());
//        concealedHand.remove(discardTile);
//        System.out.println(concealedHand.remove(discardTile));
//        System.out.println("concealedHand2: " + concealedHand.size());
//        return concealedHand;
//    }

    public ArrayList<Tile> discardFromConcealedHandUsingIndex(int index){
        concealedHand.remove(index);
        return concealedHand;
    }

}
