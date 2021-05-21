package com.company;


public class Przedmiot {
    String nazwa;
    int zycie;
    int zdrowie;
    int sila;
    int sytosc;
    int ilosc;

    public Przedmiot(String nazwa, int zdrowie, int zycie, int sila, int sytosc){
        this.nazwa = nazwa;
        this.zdrowie = zdrowie;
        this.zycie = zycie;
        this.sila = sila;
        this.sytosc = sytosc;
        ilosc = 0;
    }

    public void uzyj(Postac p){
        p.setZdrowie(this.zdrowie);
        p.setZycie(this.zycie);
        p.setSila(this.sila);
        p.setSytosc(this.sytosc);
    }
}
