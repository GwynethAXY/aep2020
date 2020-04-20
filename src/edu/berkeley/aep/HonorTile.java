package edu.berkeley.aep;

public class HonorTile implements Tile {
    public Wind wind;
    public Dragon dragon;
    public Id id;

    HonorTile(Wind wind, Id id){
        this.wind = wind;
        this.id = id;
    }

    HonorTile(Dragon dragon, Id id){
        this.dragon = dragon;
        this.id = id;
    }

    enum Wind{
        EAST, SOUTH, WEST, NORTH //dong, nan, xi, bei
    }

    enum Dragon{
        RED, GREEN, WHITE // zhong, fa, bai
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
    public boolean equals(Tile other) {
        if (other instanceof HonorTile) {
            HonorTile otherTile = (HonorTile) other;
            if (this.wind == otherTile.wind) return true;
            else if (this.dragon == otherTile.dragon) return true;
            else return false;
        }
        return false;
    }

    @Override
    public boolean canPong(Tile inHandOne, Tile inHandTwo){
        if (this.equals(inHandOne) && this.equals(inHandTwo)) return true;
        return false;
    }

    @Override
    public boolean canKang(Tile inHandOne, Tile inHandTwo, Tile inHandThree){
        if (this.equals(inHandOne) && this.equals(inHandTwo) && this.equals(inHandThree)) return true;
        return false;
    }
}
