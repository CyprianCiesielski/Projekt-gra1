package src.com.company;
import com.company.Pokoje;
import com.company.Postac;
import com.company.Przedmiot;

import java.util.Scanner;

public class Lewo {

    public static void gdzie(com.company.Postac postac){
            postac.statystyki();
            System.out.println("Gdzie chcesz iść?");
            System.out.println("1. W prawo.");
            System.out.println("2. W lewo.");

    }

    public static void l(Postac postac, com.company.Przedmiot toporek, com.company.Przedmiot tarcza, com.company.Przedmiot miecz, com.company.Przedmiot jablko, com.company.Przedmiot mieso, com.company.Przedmiot trutka, com.company.Przedmiot opatrunki, com.company.Przedmiot odtrutka, Przedmiot chlopiec){
        Scanner sc = new Scanner(System.in);
        int d = 0;

        com.company.Pokoje.pusto(postac);
            Lewo.gdzie(postac);
        d = sc.nextInt();
        switch (d){
            case 1:
                    com.company.Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                if(postac.zycie > 0) {
                    Lewo.gdzie(postac);
                    d = sc.nextInt();
                }
                else break;

                    com.company.Pokoje.listy(sc, postac);
                if(postac.zycie > 0) {
                    Lewo.gdzie(postac);
                    d = sc.nextInt();
                }
                else break;

                    com.company.Pokoje.jedzenie(postac, trutka, mieso, jablko);
                if(postac.zycie > 0) {
                    Lewo.gdzie(postac);
                    d = sc.nextInt();
                }
                else break;

                    com.company.Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                if(postac.zycie > 0) {
                    Lewo.gdzie(postac);
                    d = sc.nextInt();
                }
                else break;

                    com.company.Pokoje.opatrunki(postac, opatrunki, odtrutka, trutka);
                if(postac.zycie > 0) {
                    Lewo.gdzie(postac);
                    d = sc.nextInt();
                }
                else break;

                switch (d){
                    case 1:
                            com.company.Pokoje.ksiezniczka(sc, postac);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.pusto(postac);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;;

                        com.company.Pokoje.jedzenie(postac, trutka, mieso, jablko);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.pusto(postac);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.opatrunki(postac, opatrunki, odtrutka, trutka);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.jedzenie(postac, trutka, mieso, jablko);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.pusto(postac);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.topor(sc, postac, toporek);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.smok(sc, postac, miecz, toporek, tarcza, chlopiec);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.koniec(postac);
                        break;

                    case 2 :

                        com.company.Pokoje.przyjaciel(sc, postac, chlopiec);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.pusto(postac);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.jedzenie(postac, trutka, mieso, jablko);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.pusto(postac);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.opatrunki(postac, opatrunki, odtrutka, trutka);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.jedzenie(postac, trutka, mieso, jablko);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.pusto(postac);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.topor(sc, postac, toporek);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.smok(sc, postac, miecz, toporek, tarcza, chlopiec);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.koniec(postac);
                        break;
                }
                break;

            case 2:

                com.company.Pokoje.bron(postac, miecz, tarcza);
                if(postac.zycie > 0) {
                    Lewo.gdzie(postac);
                    d = sc.nextInt();
                }
                else break;

                com.company.Pokoje.listy(sc, postac);
                if(postac.zycie > 0) {
                    Lewo.gdzie(postac);
                    d = sc.nextInt();
                }
                else break;

                com.company.Pokoje.jedzenie(postac, trutka, mieso, jablko);
                if(postac.zycie > 0) {
                    Lewo.gdzie(postac);
                    d = sc.nextInt();
                }
                else break;

                com.company.Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                if(postac.zycie > 0) {
                    Lewo.gdzie(postac);
                    d = sc.nextInt();
                }
                else break;

                com.company.Pokoje.opatrunki(postac, opatrunki, odtrutka, trutka);
                if(postac.zycie > 0) {
                    Lewo.gdzie(postac);
                    d = sc.nextInt();
                }
                else break;

                switch (d) {
                    case 1:
                        com.company.Pokoje.smieci(sc, postac);
                        if (postac.zycie > 0) {
                        }
                        else break;

                        com.company.Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.pusto(postac);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.jedzenie(postac, trutka, mieso, jablko);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.pusto(postac);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.opatrunki(postac, opatrunki, odtrutka, trutka);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.jedzenie(postac, trutka, mieso, jablko);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.opatrunki(postac, opatrunki, odtrutka, trutka);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.aplubj(sc, postac, jablko, miecz, trutka, opatrunki, odtrutka);
                        if (postac.zycie > 0) {
                            System.out.println("Idziesz dalej? 1. tak / 2. nie");
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.smok(sc, postac, miecz, toporek, tarcza, chlopiec);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.koniec(postac);
                        break;


                    case 2:

                        com.company.Pokoje.skrzynia(sc, postac, jablko, mieso, trutka, opatrunki, odtrutka, miecz, tarcza);
                        if (postac.zycie > 0) {
                            System.out.println("Idziesz dalej? 1. tak / 2. nie");
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.pusto(postac);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.jedzenie(postac, trutka, mieso, jablko);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.pusto(postac);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.opatrunki(postac, opatrunki, odtrutka, trutka);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.jedzenie(postac, trutka, mieso, jablko);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.pusto(postac);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.topor(sc, postac, toporek);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.smok(sc, postac, miecz, toporek, tarcza, chlopiec);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        com.company.Pokoje.pusto(postac);
                        if(postac.zycie > 0) {
                            Lewo.gdzie(postac);
                            d = sc.nextInt();
                        }
                        else break;

                        Pokoje.koniec(postac);
                        break;
                }
                break;
        }

    }
}



