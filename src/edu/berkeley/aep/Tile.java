package edu.berkeley.aep;

/**
 * Understands the characteristics of a card
 */
public interface Tile {
    boolean equals(Tile other);
//    boolean canChow(NumberedTile inHandOne, NumberedTile inHandTwo);
    boolean canPong(Tile inHandOne, Tile inHandTwo);
    boolean canKang(Tile inHandOne, Tile inHandTwo, Tile inHandThree);
}
