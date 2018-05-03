package Polandball_files.GameObjects;

import Polandball_files.Others.GetConstans;

import static Polandball_files.Others.GetConstans.KeyString;

public class Key extends Item {

    /**
     * Konstruktor klasy Key
     * @param x polozenie na osi x
     * @param y polozenie na osi y
     */
    public Key(int x,int y){
        super();
        x_=x;
        y_=y;
        name_class_object=KeyString;
        buffImage_= GetConstans.KeyBuff;
    }

}
