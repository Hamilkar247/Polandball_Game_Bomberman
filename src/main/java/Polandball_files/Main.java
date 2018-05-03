package Polandball_files;

import Polandball_files.Others.*;
import Polandball_files.Frames.SetConnection;

import java.io.IOException;
import java.net.URL;


/**
 * Klasa glownej funkcji programu
 * @author Adrian Szymowiat and Mateusz Kusy
 */

public class Main {

    /**
     * Obiekt klasy Setconnection, tworzenie okna wyboru trybu rozgrywki
     */
    public static SetConnection setconnection;
    /**
     * Funkcja główna programu, stworzenie okna menu głównego
     * @param args parametr funkcji glownej programy
     * @throws IOException wyjatek rzucany przez funkcje glown programu
     */
    public static void main(String[]args)throws IOException {
        //utworzenie okna nawiazywania polaczenia w serwerem
        GetConstans.read_path_to_graphics();//wczytywanie grafik z folderu gry
        setconnection = new SetConnection();
        setconnection.setVisible(true);
    }
}
