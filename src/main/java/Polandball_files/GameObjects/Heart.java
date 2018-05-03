package Polandball_files.GameObjects;

import Polandball_files.Others.GetConstans;

import static Polandball_files.Others.GetConstans.HeartString;

/**
 * Klasa reprezentujaca pojedyncze zycie w grze
 */
public class Heart extends Item {
    /**
     * Konstruktor klasy Heart
     * @param x polozenie na osi x
     * @param y polozenie na osi y
     */
    public Heart(int x, int y){
        super();
        x_=x;
        y_=y;
        name_class_object=HeartString;
        buffImage_= GetConstans.HeartBuff;
    }
}
