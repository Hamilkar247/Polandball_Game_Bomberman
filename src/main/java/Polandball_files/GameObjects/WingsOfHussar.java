package Polandball_files.GameObjects;

import Polandball_files.Others.GetConstans;

import static Polandball_files.Others.GetConstans.WingsOfHussarString;

/**
 * Klasa reprezentujaca skrzydla husarskie
 */
public class WingsOfHussar extends Item {
    /**
     * Konstruktor klasy WingsOfHussar
     * @param x polozenie na osi x
     * @param y polozenie na osi y
     */
    public WingsOfHussar(int x, int y){
        super();
        x_=x;
        y_=y;
        name_class_object=WingsOfHussarString;
        buffImage_= GetConstans.WingsOfHussarBuff;
    }

}
