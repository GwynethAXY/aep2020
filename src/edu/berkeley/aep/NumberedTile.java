package edu.berkeley.aep;

import java.util.Arrays;

public class NumberedTile implements Tile {
    public Number number;
    public Suit suit;
    public Id id; // there should be 4 counts of each card

    NumberedTile(Suit suit, Number number, Id id) {
        this.number = number;
        this.suit = suit;
        this.id = id;
    }

    enum Suit {
        BAMBOO, DOTS, CHARACTER, POWER, FLOWER
    }

    enum Number {
        ONE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9);

        int number;
        Number(int number){
            this.number = number;
        }
    }


    enum Id {
        ONE(1),
        TWO(2),
        THREE(3),
        FOUR(4);

        int id;
        Id(int id){
            this.id = id;
        }
    }

    @Override
    public boolean equals(Tile other){
        if (other instanceof NumberedTile) {
            NumberedTile otherTile = (NumberedTile) other;
            return this.number == otherTile.number && this.suit == otherTile.suit;
        }
        return false;
    }

    public boolean canChow(NumberedTile inHandOne, NumberedTile inHandTwo){
        Suit suit = this.suit;
        if (inHandOne.suit != suit || inHandTwo.suit != suit) return false;
        int [] array = {this.number.number, inHandOne.number.number, inHandTwo.number.number};
        Arrays.sort(array);
        for (int i = 0; i < array.length-1; i++) {
            if(array[i+1] - array[i] != 1) return false;
        }
        return true;
    }
}