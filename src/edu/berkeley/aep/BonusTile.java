package edu.berkeley.aep;

public class BonusTile {
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

    public boolean bonusTilePair(BonusTile other){
        if ((this.season == Season.SPRING && other.flower == BonusTile.Flower.PLUM) || (other.season == BonusTile.Season.SPRING && this.flower == BonusTile.Flower.PLUM)){
            return true;
        } else if ((this.season == Season.SUMMER && other.flower == Flower.ORCHID) || (other.season == Season.SUMMER && this.flower == Flower.ORCHID)){
            return true;
        } else if ((this.season == Season.AUTUMN && other.flower == BonusTile.Flower.CHRYSANTHEMUM) || (other.season == BonusTile.Season.AUTUMN && this.flower == Flower.CHRYSANTHEMUM)){
            return true;
        }else if ((this.season == BonusTile.Season.WINTER && other.flower == BonusTile.Flower.BAMBOO) || (other.season == BonusTile.Season.WINTER && this.flower == BonusTile.Flower.BAMBOO)){
            return true;
        } else return false;
    }
}
