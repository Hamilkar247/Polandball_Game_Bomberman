package Polandball_files.Frames;


import Polandball_files.Panels.SetNameFramePanel;

import javax.swing.*;

/**
 * Klasa tworzaca okno wyboru nazwy gracza
 */
public class SetNameFrame extends JFrame {

    /**
     * Obiekt panelu SetNameFramePanel, zawierajacy wyglad okna wyboru nazwy gracza
     */
    public static SetNameFramePanel setNameFramePanel;
    /**
     * Konstruktor klasy SetConnection, zawierajacy metode createFrame()
     */
    public SetNameFrame(){ createFrame();}
    /**
     * Metoda tworzaca okno wyboru nazwy gracza
     */
    private void createFrame(){
        //okno wyboru, czy chcemy korzystac z uslug serwera czy nie + odpowiednie parametry dla okna
        //setNameFramePanel=new SetNameFramePanel();
            this.setTitle("Wybór nazwy gracza");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setNameFramePanel=new SetNameFramePanel();
            this.getContentPane().add(setNameFramePanel);
            this.pack();
            this.setLocationRelativeTo(null);//ustawienie ramki na srodku
            this.setVisible(true);
    }
}