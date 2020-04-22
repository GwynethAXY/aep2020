package edu.berkeley.aep;

import java.util.ArrayList;
import java.util.List;

public class TilesToDraw {
    List<Tile> beginningTiles=new ArrayList<Tile>();

    public List<Tile> initTiles(){
        for (NumberedTile.Suit suit : NumberedTile.Suit.values()){
            for(NumberedTile.Number number: NumberedTile.Number.values()){
                for(NumberedTile.Id id : NumberedTile.Id.values()){
                    beginningTiles.add(new NumberedTile(suit,number,id));
                }
            }
        }

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

        for (BonusTile.Flower flower: BonusTile.Flower.values()){
            beginningTiles.add(new BonusTile(flower));
        }

        for (BonusTile.Season season: BonusTile.Season.values()){
            beginningTiles.add(new BonusTile(season));
        }

        for (BonusTile.Animal animal: BonusTile.Animal.values()){
            beginningTiles.add(new BonusTile(animal));
        }

        System.out.println("size of beginningTiles: " + beginningTiles.size());

        return beginningTiles;
    }
}
