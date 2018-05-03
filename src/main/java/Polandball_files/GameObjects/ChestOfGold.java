package Polandball_files.GameObjects;

import Polandball_files.Others.GetConstans;

import static Polandball_files.Others.GetConstans.ChestOfGoldString;

/**
 * Klasa reprezentujaca skrzynke ze zlotem
 */

public class ChestOfGold extends Item {

    /**
     * Konstruktor klasy ChestOfGold
     * @param x polozenie na osi x
     * @param y polozenie na osi y
     */
    public ChestOfGold(int x, int y){
        super();
        x_=x;
        y_=y;
        name_class_object=ChestOfGoldString;
        buffImage_= GetConstans.ChestOfGoldBuff;
    }

}
