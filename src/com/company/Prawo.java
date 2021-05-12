package com.company;

import java.util.Scanner;


public class Prawo {

    public static void p(Postac postac){
        Scanner sc = new Scanner(System.in);

        int d = 0;
        int w = 0;
        System.out.println("P Gdzie chcesz iść?");
        System.out.println("1. W prawo");
        System.out.println("2. W lewo");
        d = sc.nextInt();
        switch (d){
            case 1:
                System.out.println("pp1-");
                postac.setZycie(-100);
                break;
            case 2:
                System.out.println("pl1-");
                postac.setZycie(-100);
                break;
        }
    }
}
