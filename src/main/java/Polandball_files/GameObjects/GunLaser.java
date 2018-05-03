package Polandball_files.GameObjects;

import Polandball_files.Others.GetConstans;

import static Polandball_files.Others.GetConstans.GunLaserString;

/**
 * Klasa reprezentujaca bron-laser
 */
public class GunLaser extends Item {
    /**
     * Konstruktor klasy GunLaser
     * @param x polozenie na osi x
     * @param y polozenie na osi y
     */
    public GunLaser(int x, int y){
        super();
        x_=x;
        y_=y;
        name_class_object=GunLaserString;
        buffImage_= GetConstans.GunLaserBuff;
    }
}
