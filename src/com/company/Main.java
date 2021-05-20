package com.company;
import javax.swing.*;
import java.util.Scanner;
public class Main {

    public boolean start;
    public boolean game;
    public JFrame gra;
    Panel p = new Panel(this);
    informacja i = new informacja(this);
    wątek w = new wątek(this);

    public Main() {
        Scanner sc = new Scanner(System.in);
        gra = new JFrame();
        this.start = true;
        this.game = false;
        gra.add(p);
        gra.add(i);
        gra.getContentPane().getComponent(0).setVisible(true);
        gra.getContentPane().getComponent(1).setVisible(false);

        gra.setIconImage(new ImageIcon("").getImage());
        gra.setTitle("Labirynt");
        gra.setBounds(4, 4, 800, 800);
        gra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gra.setVisible(true);
        gra.setLocationRelativeTo(null);
        gra.setResizable(false);

        System.out.println("Jak masz na imię?");
        Postac postac = new Postac(sc.nextLine());


        Przedmiot mieso = new Przedmiot("mieso", 20, 10, 30, 50);
        Przedmiot jablko = new Przedmiot("jablko", 15, 25, 20, 20);
        Przedmiot trutka = new Przedmiot("trutka", -10, -40, -15, 5);

        Przedmiot miecz = new Przedmiot("miecz", 0, 0, 0, 0);
        Przedmiot toporek = new Przedmiot("topór", 0, 0, 0, 0);
        Przedmiot tarcza = new Przedmiot("tarcza", 0, 0, 0, 0);

        Przedmiot opatrunki = new Przedmiot("opatrunki", 20, 20, 10, 0);
        Przedmiot odtrutka = new Przedmiot("odtrutka", 20, 40, 15, 0);

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


        w.start();
        }
    }
