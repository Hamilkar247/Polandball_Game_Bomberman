package Polandball_files.GameObjects;

import Polandball_files.Others.GetConstans;

import static Polandball_files.Others.GetConstans.DoorString;

/**
 * Klasa reprezentujaca drzwi do nastepnego poziomu
 */
public class Door extends Item {
    /**
     * Konstruktor klasy Door
     * @param x polozenie na osi x
     * @param y polozenie na osi y
     */
    public Door(int x,int y){
        super();
        x_=x;
        y_=y;
        name_class_object=DoorString;
        buffImage_= GetConstans.DoorBuff;
    }

}
