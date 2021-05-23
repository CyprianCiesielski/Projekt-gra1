package com.company;

import java.util.Scanner;

public class Pokoje {
    Main Main = new Main();

    public static void Llekow(Postac postac, Przedmiot opatrunki, Przedmiot odtrutka, Przedmiot trutka){
        int c = 0;
        c = (int)(Math.random()*3);
        if(c>=0 && c<=1){
            if(postac.zycie < 70 && trutka.ilosc == 0){
                System.out.println("Znalazłeś opatrunki (właśnie to czego najbardziej potrzebowałeś).");
                opatrunki.uzyj(postac);
            }else
            if(postac.zycie >= 70){
                System.out.println("Znalazłeś opatrunki, szkoda, że do niczego ci się nie przydadzą.");
            }
        }

        else{
            if(trutka.ilosc == 0){
                System.out.println("Znalazłeś odtrutkę. Zaczynasz żałować, żę niczym się nie otrułeś.");
            }else
            if(trutka.ilosc > 0){
                System.out.println("Znalazłeś odtrunkę na truciznę, którą wcześniej zażyłeś.");
                odtrutka.uzyj(postac);
                trutka.ilosc--;
            }
        }

    }


    public static void Lbroni(Postac postac, Przedmiot miecz, Przedmiot tarcza){
        int c = 0;
        c = (int)(Math.random()*3);
        if(c>=0 && c<=1){
            if(miecz.ilosc == 1){
                System.out.println("Znalazłeś drugi miecz. Szkoda, że nie możesz zabrać go ze sobą");
            }else
            if(miecz.ilosc == 0) {
                System.out.println("Znalazłeś miecz.");
                miecz.ilosc++;
            }
        }
        else{
            if(tarcza.ilosc == 1){
                System.out.println("Znalazłeś drugą tarczę. Szkoda, żę nie możesz zabrać jej ze sobą");
            }else
            if(tarcza.ilosc == 0){
                System.out.println("Znalazłeś tarczę");
                tarcza.ilosc++;
            }
        }

    }


    public static void Lposilku(Postac postac, Przedmiot jablko, Przedmiot trutka, Przedmiot mieso){
        int c = 0;
        c = (int)(Math.random()*9);
        if(c>=0 && c<=2){
            System.out.println("Znalazłeś jabłko. Smacznego!");
            jablko.uzyj(postac);
        }else
        if(c>=3 && c<=5){
            System.out.println("Znalazłeś mięso. Smacznego!");
            mieso.uzyj(postac);
        }
        else{
            System.out.println("Znalazłeś coś dziwnego i zjadłeś. Na nieszczęście było zatrute. Szkoda.");
            trutka.uzyj(postac);
            trutka.ilosc++;
        }
    }


    public static void Lwygranej(Postac postac, Przedmiot miecz, Przedmiot toporek, Przedmiot tarcza){
        int c = 0;
        c = (int)(Math.random()*100);
        if(miecz.ilosc == 1 && toporek.ilosc == 1 && tarcza.ilosc == 1 && c%2==0){
            postac.setZycie(-10);
            postac.setSila(-10);
            postac.setSytosc(-10);
            if(postac.zycie >0)
                System.out.println("Wygrałeś!");
        }else
        if(miecz.ilosc == 1 && tarcza.ilosc == 1 && c%2==0) {
            postac.setZycie(-20);
            postac.setSila(-20);
            postac.setSytosc(-10);
            if(postac.zycie >0)
                System.out.println("Wygrałeś!");
        }else
        if(miecz.ilosc == 1 &&  c%2==0) {
            postac.setZycie(-30);
            postac.setSila(-30);
            postac.setSytosc(-20);
            if(postac.zycie >0)
                System.out.println("Wygrałeś!");
        }else
        if(c%2==0) {
            postac.setZycie(-40);
            postac.setSila(-40);
            postac.setSytosc(-20);
            if(postac.zycie >0)
                System.out.println("Wygrałeś!");
        }
        else {
            postac.setZycie(-1);
        }
    }


    public static void listy(Main Main, Scanner sc, Postac postac){
        int w = 0;
        Main.pokój[1] = true;
        System.out.println("W tym pokoju jest wielka sterta listów. Trudno się będzie przez nią przedrzeć. Co chcesz zrobić?");
        System.out.println("1. Chcę posortować te listy.");
        System.out.println("2. Poszukam listu, kiedy będę przechodził.");
        w = sc.nextInt();
        switch (w) {
            case 1:
                System.out.println("Surtując strasznie się zmęczyłeś, ale znalazłeś list wysłany do ciebie.");
                System.out.println("Otworzyłeś go i przeczytałeś 'Powinieneś pójść w prawo'");
                postac.setSila(-20);
                postac.setSytosc(-5);
                break;
            case 2:
                System.out.println("Przedzierając się przez listy zmęczyłeś się, ale nic nie znalazłeś. Szkoda. Ten list gdziś tam jest.");
                postac.setSila(-10);
                postac.setSytosc(-5);
                break;
        }
    }



    public static void topor(Scanner sc, Postac postac, Przedmiot toporek) {
        int w = 0;
        System.out.println("Spotkałeś jakiegoś miłego pana. Prosi cię o trochę jedzenia. Niestety to trochę to wszystko co ci zostało.");
        System.out.println("Co chcesz zrobić?");
        System.out.println("1. Chcę przjś obok udając, że go nie zauważyłem.");
        System.out.println("2. Chcę oddeć mu całe jedzenie, które mi zostało.");
        w = sc.nextInt();
        switch (w) {
            case 1:
                System.out.println("Ten miły pan rzucił się na ciebie z toporkiem.");
                System.out.println("Szkoda, że nie masz żadniej broni.");
                postac.setZycie(-100);
                break;
            case 2:
                System.out.println("Ten miły pan, w ramach podziąkowań, dał ci topór.");
                System.out.println("Myślisz, że to dobrze?");
                toporek.ilosc++;
                break;
        }
    }




    public static void pusto(Postac postac) {
        System.out.println("W tym pokoju jest całkiem pusto. Chyba masz szczęście.");
    }




    public static void smok(Scanner sc, Postac postac, Przedmiot miecz, Przedmiot toporek, Przedmiot tarcza, Przedmiot chlopiec){
        int w = 0;
        System.out.println("Spotkałeś strasznego smokależącego na górze złota. Na szczęście śpi.");
        System.out.println("Co chcesz zrobić?");
        System.out.println("1. Chcę przemknąć się cichaczem.");
        System.out.println("2. Chcę spróbować zabić smoka.");
        System.out.println("3. Chcę z nim porozmawiać.");
        w = sc.nextInt();
        switch(w){
            case 1: {
                System.out.println("Smok się obudził i musiałeś z nim walczyć.");
                if(miecz.ilosc == 1 && toporek.ilosc == 1 && tarcza.ilosc == 1 && chlopiec.ilosc == 1) {
                    System.out.println("Twój przyjaciel zginął w walce.");
                    postac.setZycie(-50);
                    postac.setSila(-60);
                    postac.setSytosc(-15);
                }else
                if(miecz.ilosc == 1 && toporek.ilosc == 1 && tarcza.ilosc == 1) {
                    postac.setZycie(-50);
                    postac.setSila(-60);
                    postac.setSytosc(-15);
                }else
                if(miecz.ilosc == 1 && tarcza.ilosc == 1) {
                    postac.setZycie(-60);
                    postac.setSila(-60);
                    postac.setSytosc(-15);
                }else
                if(miecz.ilosc == 1){
                    postac.setZycie(-70);
                    postac.setSila(-70);
                    postac.setSytosc(-20);
                }
                else{
                    System.out.println("Niestety przegrałeś.");
                    postac.setZycie(-100);
                }

                break;
            }
            case 2:{
                System.out.println("Smoka niezwykle zdenerwowało to, że odważyłeś się wyzwwać go na pojedynek. Nieszczęście.");
                postac.setZycie(-100);
                break;
            }
            case 3:{
                postac.setSila(-5);
                postac.setZdrowie(-5);
                System.out.println("Smok okazał się bardzo uprzejmy. Rozmowa z nim była dobrym pomyślem. Zdradził ci, że teraz powinieneś pójść w prawo");
                break;
            }
        }
    }

    public static void ksiezniczka(Scanner sc, Postac postac){
        int w = 0;
        System.out.println("Księżniczka pyta cię jak wygląda jej nowa sukienka.");
        System.out.println("Co chcesz zrobić?");
        System.out.println("1. Powiem jej , że sukienka jest piękna.");
        System.out.println("2. Powiem je , że sukienka jest brzydka.");
        System.out.println("3. Ucieknę.");
        w = sc.nextInt();
        switch(w){
            case 1: {
                System.out.println("Oskarżyła cię o kłamstwo. To nie był najlepszy pomysł.");
                postac.setZdrowie(-10);
                break;
            }
            case 2:{
                System.out.println("Jest wściekła. To nie był najlepszy pomysł.");
                postac.setZdrowie(-10);
                break;
            }
            case 3:{
                System.out.println("Udało się!");
                break;
            }
        }
    }

    public static void przyjaciel(Scanner sc, Postac postac, Przedmiot chlopiec){
        int w = 0;
        System.out.println("Spotkałeś chłopoca, który pyta czy chcesz zostać jego przyjacielem. Co mu powiesz?");
        System.out.println("1. Tak.");
        System.out.println("2. Nie.");
        w = sc.nextInt();
        switch(w){
            case 1: {
                System.out.println("Chłopiec bardzo się ucieszył i postaniwił towarzyszyć ci na dobre i na złe. Idzie z tobą.");
                chlopiec.ilosc++;
                break;
            }
            case 2:{
                System.out.println("Chłopiec jestniezwykle smutny, ale puszcza cię dalej.");
                postac.setZdrowie(-5);
                break;
            }

        }
    }

    public static void skrzynia(Scanner sc, Postac postac, Przedmiot jablko, Przedmiot mieso, Przedmiot trutka, Przedmiot opatrunki, Przedmiot odtrutka, Przedmiot miecz, Przedmiot tarcza){
        int w = 0;
        System.out.println("W tym pokoju leży skrzynia. Możesz albo ją otworzyć i iść w lewo albo pójść w prawo. Co zrobisz?");
        System.out.println("1. Pójdę w prawo");
        System.out.println("2. Otworzę skrzynię");
        w = sc.nextInt();
        int c = (int)(Math.random()*4);
        switch (w){
            case 1:
                break;
            case 2:
                if (c == 0) {
                    Pokoje.Llekow(postac, opatrunki, odtrutka, trutka);
                }else
                if(c == 1){
                    Pokoje.Lposilku(postac, jablko, trutka, mieso);
                }else
                if(c == 2){
                    Pokoje.Lbroni(postac, miecz, tarcza);
                }
                else{
                    System.out.println("Skrzynia jest pusta");
                }
                break;
        }

    }

    public static void smieci(Scanner sc, Postac postac){
        int w = 0;
        System.out.println("Przed prawymi drzwiami leży wielka sterta śmieci. CHcesz ją przesunąć czy iść w lewo?");
        System.out.println("1. Chcę posprzątać i iść w prawo.");
        System.out.println("2. Chcę iść w lewo.");
        w = sc.nextInt();
        switch (w){
            case 1:
                break;
            case 2:
                postac.setSila(-10);
                break;
        }
    }

    public static void aplubj(Scanner sc, Postac postac, Przedmiot jablko, Przedmiot mieso, Przedmiot trutka, Przedmiot opatrunki, Przedmiot odtrutka){
        int w = 0;
        System.out.println("Czeka cię trudna decyzja. Możesz albo otworzyć skrzynkę z jedzeniem i pójść w prawo, albo otworzyć skrzynkę z opatrunkami i iść w lewo. Co wolisc?");
        System.out.println("1. Chcę otworzyć skrzynkę z jedzeniem");
        System.out.println("2. Chcę otworzyć skrzynkę z apteczką");
        w = sc.nextInt();
        switch (w){
            case 1:
                Pokoje.Lposilku(postac, jablko, trutka, mieso);
                break;
            case 2:
                Pokoje.Llekow(postac, opatrunki, odtrutka, trutka);
                break;
        }

    }

    public static void koniec(Postac postac){
        System.out.println("Wygrałeś");
        postac.gramy = false;
    }

    public static void przeciwnik(Postac postac, Przedmiot miecz, Przedmiot toporek, Przedmiot tarcza) {
        System.out.println("Spotkałeś coś potwornego. Musisz z tym walczyć.");
        Lwygranej(postac, miecz, toporek, tarcza);

    }

    public static void jedzenie(Postac postac, Przedmiot trutka, Przedmiot mieso, Przedmiot jablko){
        Lposilku(postac, jablko, trutka, mieso);

    }

    public static void bron(Postac postac, Przedmiot miecz, Przedmiot tarcza){
        Lbroni(postac, miecz, tarcza);

    }

    public static void opatrunki(Postac postac, Przedmiot opatrunki, Przedmiot odtrutka, Przedmiot trutka){
        Llekow(postac, opatrunki, odtrutka, trutka);

    }

}