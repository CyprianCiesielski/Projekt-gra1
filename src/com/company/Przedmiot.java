package com.company;

public class Przedmiot {
    String nazwa;
    int zycie;
    int zdrowie;
    int sila;
    int sytosc;
    int ilosc;

    public Przedmiot(String nazwa, int zy, int zdr, int si, int sy){
        this.nazwa = nazwa;
        zdrowie = zdr;
        zycie = zy;
        sila = si;
        sytosc = sy;
        ilosc = 0;
    }

    public void uzyj(Postac p){
        p.setZycie(zycie);
        p.setZdrowie(zdrowie);
        p.setSila(sila);
        p.setSytosc(sytosc);
    }
}
