package com.company;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Scanner;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public boolean start;
    public boolean game;
    public boolean pokój[] = new boolean[36];
    public JFrame gra;
    public FloatControl fc;
    int musicsec;
    public Clip muzykadogry;
    public File muzyka = new File("src/Gra/audio/muzykadogry.wav");

    Panel p = new Panel(this);
    informacja i = new informacja(this);
    wątek w = new wątek(this);
    Pokoje p1 = new Pokoje(this);
    Pokojegraf g = new Pokojegraf(this);
    Pokojegraf g1 = new Pokojegraf(this);

    public Main() {
        Pokoje.Main = this;
        Scanner sc = new Scanner(System.in);
        gra = new JFrame();
        this.start = true;
        this.game = false;
        gra.add(p);
        gra.add(i);
        gra.add(g);
        gra.add(g1);
        gra.getContentPane().getComponent(0).setVisible(true);
        gra.getContentPane().getComponent(1).setVisible(false);
        gra.getContentPane().getComponent(2).setVisible(false);
        gra.getContentPane().getComponent(3).setVisible(false);
       /* gra.getContentPane().getComponent(4).setVisible(false);
        gra.getContentPane().getComponent(5).setVisible(false);
        gra.getContentPane().getComponent(6).setVisible(false);
        gra.getContentPane().getComponent(7).setVisible(false);
        gra.getContentPane().getComponent(8).setVisible(false);
        gra.getContentPane().getComponent(9).setVisible(false);
        gra.getContentPane().getComponent(10).setVisible(false);
        gra.getContentPane().getComponent(11).setVisible(false);
        gra.getContentPane().getComponent(12).setVisible(false);
        gra.getContentPane().getComponent(13).setVisible(false);
        gra.getContentPane().getComponent(14).setVisible(false);
        gra.getContentPane().getComponent(15).setVisible(false);
        gra.getContentPane().getComponent(16).setVisible(false);
        gra.getContentPane().getComponent(17).setVisible(false);
        gra.getContentPane().getComponent(18).setVisible(false);
        gra.getContentPane().getComponent(19).setVisible(false);
        gra.getContentPane().getComponent(20).setVisible(false);
        gra.getContentPane().getComponent(21).setVisible(false);
        gra.getContentPane().getComponent(22).setVisible(false);
        gra.getContentPane().getComponent(23).setVisible(false);
        gra.getContentPane().getComponent(24).setVisible(false);
        gra.getContentPane().getComponent(25).setVisible(false);
        gra.getContentPane().getComponent(26).setVisible(false);
        gra.getContentPane().getComponent(27).setVisible(false);
        gra.getContentPane().getComponent(28).setVisible(false);
        gra.getContentPane().getComponent(29).setVisible(false);
        gra.getContentPane().getComponent(30).setVisible(false);
        gra.getContentPane().getComponent(31).setVisible(false);
        gra.getContentPane().getComponent(32).setVisible(false);
        gra.getContentPane().getComponent(33).setVisible(false);
        gra.getContentPane().getComponent(34).setVisible(false);
        gra.getContentPane().getComponent(35).setVisible(false);
        gra.getContentPane().getComponent(36).setVisible(false);
        gra.getContentPane().getComponent(37).setVisible(false);
        gra.getContentPane().getComponent(38).setVisible(false);
        gra.getContentPane().getComponent(39).setVisible(false);
        gra.getContentPane().getComponent(40).setVisible(false);
        gra.getContentPane().getComponent(41).setVisible(false);
        gra.getContentPane().getComponent(42).setVisible(false);
        gra.getContentPane().getComponent(43).setVisible(false);
        gra.getContentPane().getComponent(44).setVisible(false);
        gra.getContentPane().getComponent(45).setVisible(false);

        ImageIcon logo = new ImageIcon("src/Gra/ikona.png");
        gra.setIconImage(logo.getImage());
        gra.setTitle("Labirynt");
        gra.setBounds(4, 4, 800, 800);
        gra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gra.setVisible(true);
        gra.setLocationRelativeTo(null);
        gra.setResizable(false);

        w.start();

        //System.out.println("Jak masz na imię?");
        Postac postac = new Postac();


        Przedmiot mieso = new Przedmiot("mieso", 10, 20, 30, 50);
        Przedmiot jablko = new Przedmiot("jablko", 25, 15, 20, 20);
        Przedmiot trutka = new Przedmiot("trutka", -40, -10, -15, 5);

        Przedmiot miecz = new Przedmiot("miecz", 0, 0, 0, 0);
        Przedmiot toporek = new Przedmiot("topór", 0, 0, 0, 0);
        Przedmiot tarcza = new Przedmiot("tarcza", 0, 0, 0, 0);

        Przedmiot opatrunki = new Przedmiot("opatrunki", 20, 20, 10, 0);
        Przedmiot odtrutka = new Przedmiot("odtrutka", 40, 20, 15, 0);

        Przedmiot chlopiec = new Przedmiot("chłopiec", 0, 0, 0, 0);



        int d = 0;
        System.out.println("Wchodzisz do labiryntu. Szukasz skarbu. Bardzo starasz się przy tym nie zginąć. To dla ciebie ważne.");
        System.out.println("Gdzie chcesz iść?");
        System.out.println("1. W prawo");
        System.out.println("2. W lewo");
        d = sc.nextInt();

        while (postac.gramy) {
            postac.statystyki();
            switch (d) {
                case 1:
                    Prawo.p(postac, toporek, tarcza, miecz, jablko, mieso, trutka, opatrunki, odtrutka, chlopiec);
                    break;
                case 2:
                    Lewo.l(postac, toporek, tarcza, miecz, jablko, mieso, trutka, opatrunki, odtrutka, chlopiec);
                    break;

            }

        }
    }
}
