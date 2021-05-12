package com.company;

import java.util.Scanner;

public class Pokoje {

     public static void Llekow(Postac postac, Przedmiot opatrunki, Przedmiot odtrutka, Przedmiot trutka){
         int c = 0;
         c = (int)(Math.random()*3);
         if(c>=0 && c<=1){
             if(postac.zycie < 60 && trutka.ilosc == 0){
                 System.out.println("Znalazłeś opatrunki (właśnie to czego najbardziej potrzebowałeś).");
                 opatrunki.uzyj(postac);
             }
             if(postac.zycie >= 60){
                 System.out.println("Znalazłeś opatrunki, szkoda, żę do niczego ci się nie przydadzą.");
             }
         }

         else{
             if(trutka.ilosc == 0){
                 System.out.println("Znalazłeś odtrutkę. Zaczynasz żałować, żę niczym się nie otrułeś.");
             }
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
                 System.out.println("Znalazłeś drugi miecz. Szkoda, żę nie możesz zabrać go ze sobą");
             }
             if(miecz.ilosc == 0) {
                 System.out.println("Znalazłeś miecz.");
                 miecz.ilosc++;
             }
         }
         else{
             if(tarcza.ilosc == 1){
             System.out.println("Znalazłeś drugą tarczę. Szkoda, żę nie możesz zabrać jej ze sobą");
             }
             if(tarcza.ilosc == 0){
                 System.out.println("Znalazłeś tarczę");
                 tarcza.ilosc++;
             }
         }

     }


     public static void Lposilku(Postac postac,Przedmiot jablko, Przedmiot trutka, Przedmiot mieso){
         int c = 0;
         c = (int)(Math.random()*9);
if(c>=0 && c<=2){
    System.out.println("Znalazłeś jabłko. Smacznego!");
    jablko.uzyj(postac);
}
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
        postac.setZycie(-30);
        postac.setSila(-20);
        postac.setSytosc(-10);
    }
    if(miecz.ilosc == 1 && tarcza.ilosc == 1 && c%3==0) {
        postac.setZycie(-40);
        postac.setSila(-30);
        postac.setSytosc(-10);
    }
    if(miecz.ilosc == 1 &&  c%4==0) {
        postac.setZycie(-50);
        postac.setSila(-40);
        postac.setSytosc(-20);
    }
    if(c%5==0) {
        postac.setZycie(-70);
        postac.setSila(-50);
        postac.setSytosc(-20);
    }
    else{
        postac.setZycie(-100);
    }
}


    public static void listy(Scanner sc, Postac postac){
        int w = 0;
            System.out.println("W tym pokoju jest wielka sterta listów. Trudno się będzie przez nią przedrzeć. Co chcesz zrobić?");
            System.out.println("1. Chcę posortować te listy.");
            System.out.println("2. Chcę poszukać listu do mnie przechodząc.");
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




    public static void smok(Scanner sc, Postac postac, Przedmiot miecz, Przedmiot toporek, Przedmiot tarcza){
        int w = 0;
        System.out.println("Spotkałeś strasznego smokależącego na górze złota. Na szczęście śpi.");
        System.out.println("Co chcesz zrobić?");
        System.out.println("1. Chcę przemknąć się cichaczem.");
        System.out.println("2. Chcę spróbować zabić smoka.");
        System.out.println("3. Chcę z nim porozmawiać.");
        w = sc.nextInt();
        switch(w){
        case 1: {
            System.out.println("Smok się obudził i musiałeś z niim walczyć, niestety przegrałeś");
            if(miecz.ilosc == 1 && toporek.ilosc == 1 && tarcza.ilosc == 1){
                postac.setZycie(-50);
                postac.setSila(-60);
                postac.setSytosc(-15);
                if(miecz.ilosc == 1 && tarcza.ilosc == 1) {
                    postac.setZycie(-60);
                    postac.setSila(-60);
                    postac.setSytosc(-15);
                }
                if(miecz.ilosc == 1){
                    postac.setZycie(-70);
                    postac.setSila(-70);
                    postac.setSytosc(-20);
                }
                else{
                    postac.setZycie(-100);
                }
}
            break;
        }
            case 2:{
                System.out.println("Smoka niezwykle zdenerwowało to, że odważyłeś się wyzwwać go na pojedynek. Nieszczęście.");
                postac.setZycie(-100);
                break;
            }
            case 3:{
                System.out.println("Smok okazał się bardzo uprzejmy. Rozmowa z nim była dobrym pomyślem. Zdradził ci, że teraz powinieneś pójść w prawo");
                postac.setSila(-5);
                postac.setZdrowie(-5);
                break;
            }
        }
    }

    public static void kisezniczka(Scanner sc, Postac postac){
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

    public static void koniec(Postac postac){
         System.out.println("Wygrałeś");
         postac.gramy = false;
    }

public static void przeciwnik(Postac postac, Przedmiot miecz, Przedmiot toporek, Przedmiot tarcza){
System.out.println("Spotkałeś coś potwornego. musisz z tym walczyć.");
Lwygranej( postac, miecz, toporek, tarcza);
}

public static void jedzenie(Postac postac, Przedmiot trutka, Przedmiot mieso, Przedmiot jablko){
Lposilku(postac, trutka, mieso, jablko);
}

public static void bron(Postac postac, Przedmiot miecz, Przedmiot toporek, Przedmiot tarcza){
Lbroni(postac, miecz, tarcza);
}

public static void opatrunki(Postac postac, Przedmiot opatrunki, Przedmiot odtrutka, Przedmiot trutka){
Llekow(postac, opatrunki, odtrutka, trutka);
}

}
