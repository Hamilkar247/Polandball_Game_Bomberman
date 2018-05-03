package Polandball_files.GameObjects;

import Polandball_files.Others.GetConstans;

import static Polandball_files.Others.GetConstans.NaziBallString;

/**
 * Klasa reprezentujaca wroga typu NaziBall
 */
public class Naziball extends Enemy {

    /**
     * Konstruktor klasy Naziball
     * @param x obecne polozenie obiektu na osi x
     * @param y obecne polozenie obiektu na osi y
     */
    public Naziball(int x,int y){
        super();
        x_=x;
        y_=y;
        velX_=0;
        velY_=0;
        buffImage_= GetConstans.NaziBallBuff;
        name_class_object=NaziBallString;
        distance_from_elevation_walls=1/16;
        distance_from_azimuth_walls=1/8;
    }


}
