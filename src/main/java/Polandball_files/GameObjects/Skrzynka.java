package Polandball_files.GameObjects;

import Polandball_files.Others.GetConstans;

import static Polandball_files.Others.GetConstans.SkrzynkaString;

/**
 * Klasa reprezentujaca skrzynke - zniszczalny element terenu
 */
public class Skrzynka extends Terrain {
    /**
     * Konstruktor klasy Skrzynka
     * @param x polozenie na osi x
     * @param y polozenie na osi y
     */
    public Skrzynka(int x,int y){
        super();
        x_=x;
        y_=y;
        name_class_object=SkrzynkaString;
        buffImage_= GetConstans.SkrzynkaBuff;
    }

}
