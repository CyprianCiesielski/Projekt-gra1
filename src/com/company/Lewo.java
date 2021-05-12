package com.company;


import java.util.Scanner;

public class Lewo {

//zakręty w lewo

    public static void ll1(Scanner sc, Postac postac, Przedmiot toporek){
        int w = 0;
        int d = 0;
        if(toporek.ilosc == 0) {
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
        }else {
            System.out.println("To jest naprawdę dziwne, ale wszystkie listy zniknęły.");
        }
        postac.statystyki();
            System.out.println("To gdzie chcesz iść?");
            System.out.println("1. W prawo");
            System.out.println("2. W lewo");
        System.out.println("3. Chcę zawrócić.");
        d = sc.nextInt();
            switch(d){
                case 1:
                    ll2(sc, postac, toporek);
                    break;
                case 2:

                    break;
                case 3:
                    Lewo.l(postac, toporek);
                    break;
        }
    }

    public static void ll2(Scanner sc, Postac postac, Przedmiot toporek) {
        int w = 0;
        int d = 0;
        if (toporek.ilosc == 0) {
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
                    System.out.println("Ten miły pan, w ramach podziąkowań, dał ci toporek.");
                    System.out.println("Myślisz, że to dobrze?");
                    toporek.ilosc = +1;
                    break;
            }
        } else {
            System.out.println("Ten miły pan do ciebie macha!");
        }
        if (postac.zycie > 0) {
            postac.statystyki();
            System.out.println("Gdzie chcesz iść?");
            System.out.println("1. Prosto");
            System.out.println("2. Chcę zawrócić.");
            d = sc.nextInt();
            switch (d) {
                case 1:

                    break;
                case 2:
                    Lewo.ll1(sc, postac, toporek);
                    break;
            }
        }
    }


    public static void l(Postac postac, Przedmiot toporek){
        Scanner sc = new Scanner(System.in);

        int d = 0;
        int w = 0;
        System.out.println("W tym pokoju jest całkiem pusto. Chyba masz szczęscie. Gdzie chcesz iść taraz?");
        System.out.println("1. W prawo");
        System.out.println("2. W lewo");
        System.out.println("3. Chcę zawrócić na początek labiryntu i iść w prawo.");
        d = sc.nextInt();

        switch (d) {
            case 1:
                postac.setZycie(-100);
                break;
            case 2:
                Lewo.ll1(sc, postac, toporek);
                break;
            case 3:
                Prawo.p(postac);
                break;
        }
    }
}



