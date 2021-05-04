package com.company;

import java.util.Scanner;

public class Lewo {

    public static void l(Postac postac){
        Scanner sc = new Scanner(System.in);

        int d = 0;
        int w = 0;
        System.out.println("L Gdzie chcesz iść?");
        System.out.println("1. W prawo");
        System.out.println("2. W lewo");
        d = sc.nextInt();
        switch (d){
            case 1:
                System.out.println("lp1-");
                System.out.println("Stało się...");
                System.out.println("Co chcesz z tym zrobić?");
                System.out.println("1. ...");
                System.out.println("2. ...");
                System.out.println("3. ...");
                System.out.println("4. ...");
                w = sc.nextInt();
                switch(w){
                    case 1:
                        System.out.println("lp1-1");
                        postac.setZycie(-100);
                        break;
                    case 2:
                        System.out.println("lp1-2");
                        postac.setZycie(-100);
                        break;
                    case 3:
                        System.out.println("lp1-3");
                        postac.setZycie(-100);
                        break;
                    case 4:
                        System.out.println("lp1-4");
                        postac.setZycie(-100);
                        break;
                }
                break;
            case 2:
                System.out.println("ll1-");
                postac.setZycie(-100);
                break;
        }
    }

}
