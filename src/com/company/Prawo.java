package com.company;

import java.util.Scanner;


public class Prawo {

    public static void gdzie(Postac postac) {
        postac.statystyki();
        System.out.println("Gdzie chcesz iść?");
        System.out.println("1. W prawo.");
        System.out.println("2. W lewo.");

    }

    public static void p(Postac postac, Przedmiot toporek, Przedmiot tarcza, Przedmiot miecz, Przedmiot jablko, Przedmiot mieso, Przedmiot trutka, Przedmiot opatrunki, Przedmiot odtrutka, Przedmiot chlopiec) {
        Scanner sc = new Scanner(System.in);
        int d = 0;

        Pokoje.listy(sc, postac);
        Prawo.gdzie(postac);
            d = sc.nextInt();
            switch (d) {
                case 1:
                    Pokoje.jedzenie(postac, trutka, mieso, jablko);
                    if (postac.zycie > 0) {
                        Prawo.gdzie(postac);
                        d = sc.nextInt();
                    }
                    else break;

                    Pokoje.opatrunki(postac, opatrunki, odtrutka, trutka);
                    if (postac.zycie > 0) {
                        Prawo.gdzie(postac);
                        d = sc.nextInt();
                    }
                    else break;

                    Pokoje.aplubj(sc, postac, jablko, mieso, trutka, opatrunki, odtrutka);
                    if (postac.zycie > 0) {
                        System.out.println("Idziesz dalej? 1. tak / 2. nie");
                        d = sc.nextInt();
                    }
                    else break;

                    Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                    if (postac.zycie > 0) {
                        Prawo.gdzie(postac);
                        d = sc.nextInt();
                    }
                    else break;

                    Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                    if (postac.zycie > 0) {
                        Prawo.gdzie(postac);
                        d = sc.nextInt();
                    }
                    else break;

                    Pokoje.topor(sc, postac, toporek);
                    if (postac.zycie > 0) {
                        Prawo.gdzie(postac);
                        d = sc.nextInt();
                    }
                    else break;

                    switch (d) {
                        case 1:

                            Pokoje.smieci(sc, postac);
                            if (postac.zycie > 0) {
                            }
                            else break;

                                Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                                if (postac.zycie > 0) {
                                    Prawo.gdzie(postac);
                                    d = sc.nextInt();
                                } else break;


                            Pokoje.pusto(postac);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.jedzenie(postac, trutka, mieso, jablko);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.pusto(postac);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.opatrunki(postac, opatrunki, odtrutka, trutka);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.jedzenie(postac, trutka, mieso, jablko);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.pusto(postac);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.ksiezniczka(sc, postac);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.smok(sc, postac, miecz, toporek, tarcza, chlopiec);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.koniec(postac);
                            break;


                        case 2:

                            Pokoje.skrzynia(sc, postac, jablko, mieso, trutka, opatrunki, odtrutka, miecz, tarcza);
                            if (postac.zycie > 0) {
                            }
                            else break;

                            Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.pusto(postac);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.jedzenie(postac, trutka, mieso, jablko);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.pusto(postac);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.opatrunki(postac, opatrunki, odtrutka, trutka);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.jedzenie(postac, trutka, mieso, jablko);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.pusto(postac);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.ksiezniczka(sc, postac);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.smok(sc, postac, miecz, toporek, tarcza, chlopiec);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.koniec(postac);
                            break;
                    }
                    break;

                case 2:

                    Pokoje.bron(postac, miecz, tarcza);
                    if (postac.zycie > 0) {
                        Prawo.gdzie(postac);
                        d = sc.nextInt();
                    }
                    else break;

                    Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                    if (postac.zycie > 0) {
                        Prawo.gdzie(postac);
                        d = sc.nextInt();
                    }
                    else break;

                    Pokoje.aplubj(sc, postac, jablko, mieso, trutka, opatrunki, odtrutka);
                    if (postac.zycie > 0) {
                        System.out.println("Idziesz dalej? 1. tak / 2. nie");
                        d = sc.nextInt();
                    }
                    else break;

                    Pokoje.opatrunki(postac, opatrunki, odtrutka, trutka);
                    if (postac.zycie > 0) {
                        Prawo.gdzie(postac);
                        d = sc.nextInt();
                    }
                    else break;

                    Pokoje.pusto(postac);
                    if (postac.zycie > 0) {
                        Prawo.gdzie(postac);
                        d = sc.nextInt();
                    }
                    else break;

                    Pokoje.topor(sc, postac, toporek);
                    if (postac.zycie > 0) {
                        Prawo.gdzie(postac);
                        d = sc.nextInt();
                    }
                    else break;

                    switch (d) {
                        case 1:

                            Pokoje.smieci(sc, postac);
                            if (postac.zycie > 0) {
                            }
                            else break;

                            Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.pusto(postac);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.jedzenie(postac, trutka, mieso, jablko);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.pusto(postac);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.opatrunki(postac, opatrunki, odtrutka, trutka);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.jedzenie(postac, trutka, mieso, jablko);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.opatrunki(postac, opatrunki, odtrutka, trutka);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.przyjaciel(sc, postac, chlopiec);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.smok(sc, postac, miecz, toporek, tarcza, chlopiec);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.pusto(postac);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.koniec(postac);
                            break;


                        case 2:

                            Pokoje.skrzynia(sc, postac, jablko, mieso, trutka, opatrunki, odtrutka, miecz, tarcza);
                            if (postac.zycie > 0) {
                            }
                            else break;

                            Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.pusto(postac);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.jedzenie(postac, trutka, mieso, jablko);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.pusto(postac);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.opatrunki(postac, opatrunki, odtrutka, trutka);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.jedzenie(postac, trutka, mieso, jablko);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.pusto(postac);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.przyjaciel(sc, postac, chlopiec);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.smok(sc, postac, miecz, toporek, tarcza, chlopiec);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
                                d = sc.nextInt();
                            }
                            else break;

                            Pokoje.przeciwnik(postac, miecz, toporek, tarcza);
                            if (postac.zycie > 0) {
                                Prawo.gdzie(postac);
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