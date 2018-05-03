package Polandball_files.GameObjects;

import Polandball_files.Others.GetConstans;

import static Polandball_files.Others.GetConstans.Remote_BombString;


/**
 * Klasa reprezentujaca bomby zdalne
 */
public class Remote_Bomb extends Bomb {

    /**
     * Konstruktor klasy Remote_Bomb
     * @param x polozenie na osi x
     * @param y polozenie na osi y
     */
    public Remote_Bomb(int x, int y){
        super();
        x_=x;
        y_=y;
        buffImage_= GetConstans.Remote_BombBuff;
        image_=null;
        name_class_object=Remote_BombString;
        explosionflag_=false;
    }

}
