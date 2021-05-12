package com.company;


public class Postac {
    String imie;
    int zycie;
    int zdrowie;
    int sila;
    int sytosc;
    boolean gramy;


    public Postac(String imie) {
        this.imie = imie;
        zycie = 100;
        zdrowie = 100;
        sila = 100;
        sytosc = 100;
        gramy = true;
    }

    public String pasek(int n, int max) {
        String p = "";
        p += "|";
        for (int i = 0; i < n / 5; i++)
            p += "#";
        for (int i = 0; i < (max - n) / 5; i++)
            p += " ";

        p += "|";

        return p;
    }

    public int getZycie() {
        return zycie;
    }

    public void setZycie(int zycie) {
        if(this.zycie > 0){
            this.zycie += zycie;
            if(this.zycie <= 0){
                this.zycie = 0;
                gramy = false;
                System.out.println("Nie żyjesz");
            }
        }
        if(this.zdrowie > 100)
            this.zycie = 100;
    }

    public int getZdrowie() {
        return zdrowie;
    }

    public void setZdrowie(int zdrowie) {
        if(this.zdrowie >0){
            this.zdrowie += zdrowie;
            if(this.zdrowie <= 0 ){
                this.zdrowie = 0;
                setZycie(-40);
                setSytosc(-40);
                setSila(-40);
            }else
                if(zdrowie < 20){
                    setZycie(-10);
                    setSytosc(-10);
                    setSila(-10);
                }
        }
        if(this.zdrowie > 100){
            this.zdrowie = 100;
            setZycie(5);
            setSila(5);
        }
    }

    public int getSila() {
        return sila;
    }

    public void setSila(int sila) {
        if(this.sila >0) {
            this.sila += sila;
            if(this.sila <= 0){
                this.sila = 0;
                setZdrowie(-10);
                setZycie(-10);
                setSytosc(-10);
            }
        }
        if(this.sila > 100)
            this.sila = 100;
    }

    public int getSytosc() {
        return sytosc;
    }

    public void setSytosc(int sytosc) {
        if (this.sytosc > 0) {
            this.sytosc += sytosc;
            if (this.sytosc <= 0) {
                this.sytosc = 0;
                setSila(-20);
                setZdrowie(-20);
            } else if (this.sytosc < 20) {
                setSila(-10);
                setZdrowie(-10);
            }
        }
        if (this.sytosc > 100) {
            this.sytosc = 100;
            setSila(10);
            setZdrowie(10);
        }

    }

     public void statystyki(){
            System.out.println("Życie:   " + pasek(zycie, 100));
            System.out.println("Zdrowie: " + pasek(zdrowie, 100));
            System.out.println("Siła:    " + pasek(sila, 100));
            System.out.println("Sytość:  " + pasek(sytosc, 100));
        }


}
