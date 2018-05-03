package Polandball_files.GameObjects;

import Polandball_files.Others.GetConstans;

import static Polandball_files.Others.GetConstans.BoxOfBombsString;

/**
 * Klasa reprezentujaca skrzynke z dodatkowymi bombami
 */
public class BoxOfBomb extends Item {

    /**
     * Konstruktor klasy BoxOfBomb
     * @param x polozenie na osi x
     * @param y polozenie na osi y
     */
    public BoxOfBomb(int x, int y){
        super();
        x_=x;
        y_=y;
        name_class_object=BoxOfBombsString;
        buffImage_= GetConstans.BoxOfBombBuff;
    }

    /**
     * Metoda udostepniająca obiektowi grafike
     * @return bufferedImage/null - zwraca stworzone zdjecie lub w wypadku zlapania wyjatku null
     */
    /*public BufferedImage createBufferedImage(){
        try {
            File file = new File(BoxOfBombsString);
            BufferedImage bufferedImage= ImageIO.read(file);
            return bufferedImage;
        }
        catch(IOException e ){
            e.printStackTrace();
            System.out.println("Blad wczytywania obiektu typu pudelko bomb");
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }*/
}
