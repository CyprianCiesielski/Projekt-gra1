package com.company;


public class Przedmiot {
    String nazwa;
    int zycie;
    int zdrowie;
    int sila;
    int sytosc;
    int ilosc;

    public Przedmiot(String nazwa, int zycie, int zdrowie, int sila, int sytosc){
        this.nazwa = nazwa;
        this.zdrowie = zdrowie;
        this.zycie = zycie;
        this.sila = sila;
        this.sytosc = sytosc;
        ilosc = 0;
    }

    public void uzyj(Postac p){
        p.setZycie(zycie);
        p.setZdrowie(zdrowie);
        p.setSila(sila);
        p.setSytosc(sytosc);
    }
}
