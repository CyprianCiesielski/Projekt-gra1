package src.com.company;
import com.company.Lewo;
import com.company.Panel;
import com.company.Pokojegraf;
import com.company.Postac;
import com.company.Prawo;
import com.company.Przedmiot;
import com.company.informacja;
import com.company.wątek;

import javax.swing.*;
import java.util.Scanner;
public class Main extends com.company.Main {

    public boolean start;
    public boolean game;
    public boolean[] pokój;
    public boolean[] przedmioty;
    public JFrame gra;
    com.company.Panel p = new Panel(this);
    com.company.informacja i = new informacja(this);
    com.company.wątek w = new wątek(this);
    com.company.Pokojegraf g = new Pokojegraf(this);

    public Main() {
        super();
        Scanner sc = new Scanner(System.in);
        gra = new JFrame();
        this.start = true;
        this.game = false;
        pokój = new boolean[36];
        this.pokój[0] = false;
        przedmioty = new boolean[3];
        this.przedmioty[0] = false;
        this.przedmioty[1] = false;
        this.przedmioty[2] = false;
        gra.add(p);
        gra.add(i);
        gra.add(g);

        gra.getContentPane().getComponent(0).setVisible(true);
        gra.getContentPane().getComponent(1).setVisible(false);
        gra.getContentPane().getComponent(2).setVisible(false);

        gra.setIconImage(new ImageIcon("").getImage());
        gra.setTitle("Labirynt");
        gra.setBounds(4, 4, 800, 800);
        gra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gra.setVisible(true);
        gra.setLocationRelativeTo(null);
        gra.setResizable(false);

        w.start();

        System.out.println("Jak masz na imię?");
        com.company.Postac postac = new Postac(sc.nextLine());



        com.company.Przedmiot mieso = new com.company.Przedmiot("mieso", 20, 10, 30, 50);
        com.company.Przedmiot jablko = new com.company.Przedmiot("jablko", 15, 25, 20, 20);
        com.company.Przedmiot trutka = new com.company.Przedmiot("trutka", -10, -40, -15, 5);

        com.company.Przedmiot miecz = new com.company.Przedmiot("miecz", 0, 0, 0, 0);
        com.company.Przedmiot toporek = new com.company.Przedmiot("topór", 0, 0, 0, 0);
        com.company.Przedmiot tarcza = new com.company.Przedmiot("tarcza", 0, 0, 0, 0);

        com.company.Przedmiot opatrunki = new com.company.Przedmiot("opatrunki", 20, 20, 10, 0);
        com.company.Przedmiot odtrutka = new com.company.Przedmiot("odtrutka", 20, 40, 15, 0);

        com.company.Przedmiot chlopiec = new Przedmiot("chłopiec", 0, 0, 0, 0);



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
