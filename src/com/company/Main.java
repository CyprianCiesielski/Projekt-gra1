package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*JFrame gra = new JFrame();
        Panel p = new Panel();
        gra.add(p);
        gra.setIconImage(new ImageIcon("").getImage());

        gra.setTitle("Obraz");

        gra.setBounds(400,400,400 + 14, 400 + 14 + 23);
        gra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gra.setVisible(true);*/


Scanner sc = new Scanner(System.in);

Przedmiot jedzenie = new Przedmiot("jedzenie",10,20,10,50);
Przedmiot miecz = new Przedmiot("miecz",0,0,0,0);
Przedmiot opatrunki = new Przedmiot("opatrunki",0,0,0,0);
Przedmiot zapalki = new Przedmiot("zapałki",0,0,0,0);

System.out.println("Jak masz na imię?");
        Postac postac = new Postac(sc.nextLine());

        int d = 0;
        System.out.println("Jesteś w labiryncie. Gdzie chcesz iść?");
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
                    Lewo.l(postac);
                    break;

            }

        }
    }
}
