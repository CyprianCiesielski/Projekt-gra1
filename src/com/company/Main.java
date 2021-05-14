package com.company;
import javax.swing.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

       JFrame gra = new JFrame();
        Panel p = new Panel();
        gra.add(p);
        gra.setIconImage(new ImageIcon("").getImage());
        gra.setTitle("Obraz");
        gra.setBounds(4,4,800, 800);
        gra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gra.setVisible(true);


Scanner sc = new Scanner(System.in);

        Przedmiot mieso = new Przedmiot("jablko",10,10,20,50);
        Przedmiot jablko = new Przedmiot("mieso",10,20,10,20);
        Przedmiot trutka = new Przedmiot("trutka",-10,-40,-15,5);

        Przedmiot miecz = new Przedmiot("miecz",0,0,0,0);
        Przedmiot toporek = new Przedmiot("topór",0,0,0,0);
        Przedmiot tarcza = new Przedmiot("tarcza",0,0,0,0);

        Przedmiot opatrunki = new Przedmiot("opatrunki",10,20,10,0);
        Przedmiot odtrutka = new Przedmiot("odtrutka",20,30,12,0);


System.out.println("Jak masz na imię?");
        Postac postac = new Postac(sc.nextLine());

        int d = 0;
        System.out.println("Wchodzisz do labiryntu. Szukasz skarbu. Bardzo starasz się przy tym nie zginąć. To dla ciebie ważne.");
        System.out.println("Gdzie chcesz iść?");
        System.out.println("1. W prawo");
        System.out.println("2. W lewo");
        d = sc.nextInt();

        while(postac.gramy){
            postac.statystyki();
            switch (d){
                case 1:
                    Prawo.p(postac);
                    break;
                case 2:
                    Lewo.l(postac, toporek, tarcza, miecz, jablko, mieso, trutka, opatrunki, odtrutka);
                    break;

            }

        }
    }
}
