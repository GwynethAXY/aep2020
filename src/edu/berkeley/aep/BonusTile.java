package edu.berkeley.aep;

public class BonusTile implements Tile{
    public Season season;
    public Flower flower;
    public Animal animal;

    BonusTile(Season season){
        this.season = season;
    }

    BonusTile(Flower flower){
        this.flower = flower;
    }

    BonusTile(Animal animal){
        this.animal = animal;
    }


    enum Season {
        SPRING, SUMMER, AUTUMN, WINTER;
    }

    enum Flower {
        PLUM, ORCHID, CHRYSANTHEMUM, BAMBOO;
    }

    enum Animal {
        CAT, RAT, ROOSTER, CENTIPEDE;
    }

    public boolean bonusTileFlowerSeasonPair(BonusTile other){
        if ((this.season == Season.SPRING && other.flower == Flower.PLUM) || (other.season == Season.SPRING && this.flower == Flower.PLUM)){
            return true;
        } else if ((this.season == Season.SUMMER && other.flower == Flower.ORCHID) || (other.season == Season.SUMMER && this.flower == Flower.ORCHID)){
            return true;
        } else if ((this.season == Season.AUTUMN && other.flower == Flower.CHRYSANTHEMUM) || (other.season == Season.AUTUMN && this.flower == Flower.CHRYSANTHEMUM)){
            return true;
        }else if ((this.season == Season.WINTER && other.flower == Flower.BAMBOO) || (other.season == Season.WINTER && this.flower == Flower.BAMBOO)){
            return true;
        } else return false;
    }

    public boolean bonusTileAnimalPair(BonusTile other){
        if ((this.animal == Animal.CAT && other.animal == Animal.RAT) || (other.animal == Animal.CAT && this.animal == Animal.RAT)){
            return true;
        } else if ((this.animal == Animal.ROOSTER && other.animal == Animal.CENTIPEDE) || (other.animal == Animal.ROOSTER && this.animal == Animal.CENTIPEDE)){
            return true;
        } else return false;
    }
    @Override
    public boolean equals(Tile other) {
        return false;
    }
}
