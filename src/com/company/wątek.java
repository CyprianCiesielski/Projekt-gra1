package com.company;

import javax.security.auth.Refreshable;
import javax.swing.*;

public class wątek extends Thread{

    public Main Main;

    public wątek(Main Main){
        this.Main = Main;
    }

    public void windows(){
        if(Main.start==false) {
            Main.gra.getContentPane().getComponent(0).setVisible(false);
        }
        if(Main.start==true) {
            Main.gra.getContentPane().getComponent(0).setVisible(true);
        }

        if(Main.game==false) {
            Main.gra.getContentPane().getComponent(1).setVisible(false);
        }
        if(Main.game==true) {
            Main.gra.getContentPane().getComponent(1).setVisible(true);
        }

        if(Main.pokój[0]==false) {
            Main.gra.getContentPane().getComponent(2).setVisible(false);
        }
        if(Main.pokój[0]==true) {
            Main.gra.getContentPane().getComponent(2).setVisible(true);
        }

        if(Main.pokój[1]==false) {
            Main.gra.getContentPane().getComponent(3).setVisible(false);
        }
        if(Main.pokój[1]==true) {
            Main.gra.getContentPane().getComponent(3).setVisible(true);
        }

        if(Main.pokój[2]==false) {
            Main.gra.getContentPane().getComponent(4).setVisible(false);
        }
        if(Main.pokój[2]==true) {
            Main.gra.getContentPane().getComponent(4).setVisible(true);
        }

        if(Main.pokój[3]==false) {
            Main.gra.getContentPane().getComponent(5).setVisible(false);
        }
        if(Main.pokój[3]==true) {
            Main.gra.getContentPane().getComponent(5).setVisible(true);
        }

        if(Main.pokój[4]==false) {
            Main.gra.getContentPane().getComponent(6).setVisible(false);
        }
        if(Main.pokój[4]==true) {
            Main.gra.getContentPane().getComponent(6).setVisible(true);
        }

        if(Main.pokój[5]==false) {
            Main.gra.getContentPane().getComponent(7).setVisible(false);
        }
        if(Main.pokój[5]==true) {
            Main.gra.getContentPane().getComponent(7).setVisible(true);
        }

        if(Main.pokój[6]==false) {
            Main.gra.getContentPane().getComponent(8).setVisible(false);
        }
        if(Main.pokój[6]==true) {
            Main.gra.getContentPane().getComponent(8).setVisible(true);
        }

        if(Main.pokój[7]==false) {
            Main.gra.getContentPane().getComponent(9).setVisible(false);
        }
        if(Main.pokój[7]==true) {
            Main.gra.getContentPane().getComponent(9).setVisible(true);
        }

        if(Main.pokój[8]==false) {
            Main.gra.getContentPane().getComponent(10).setVisible(false);
        }
        if(Main.pokój[8]==true) {
            Main.gra.getContentPane().getComponent(10).setVisible(true);
        }

        if(Main.pokój[9]==false) {
            Main.gra.getContentPane().getComponent(11).setVisible(false);
        }
        if(Main.pokój[9]==true) {
            Main.gra.getContentPane().getComponent(11).setVisible(true);
        }

        if(Main.pokój[10]==false) {
            Main.gra.getContentPane().getComponent(12).setVisible(false);
        }
        if(Main.pokój[10]==true) {
            Main.gra.getContentPane().getComponent(12).setVisible(true);
        }

        if(Main.pokój[11]==false) {
            Main.gra.getContentPane().getComponent(13).setVisible(false);
        }
        if(Main.pokój[11]==true) {
            Main.gra.getContentPane().getComponent(13).setVisible(true);
        }

        if(Main.pokój[12]==false) {
            Main.gra.getContentPane().getComponent(14).setVisible(false);
        }
        if(Main.pokój[12]==true) {
            Main.gra.getContentPane().getComponent(14).setVisible(true);
        }

        if(Main.pokój[13]==false) {
            Main.gra.getContentPane().getComponent(15).setVisible(false);
        }
        if(Main.pokój[13]==true) {
            Main.gra.getContentPane().getComponent(15).setVisible(true);
        }

        if(Main.pokój[14]==false) {
            Main.gra.getContentPane().getComponent(16).setVisible(false);
        }
        if(Main.pokój[14]==true) {
            Main.gra.getContentPane().getComponent(16).setVisible(true);
        }

        if(Main.pokój[15]==false) {
            Main.gra.getContentPane().getComponent(17).setVisible(false);
        }
        if(Main.pokój[15]==true) {
            Main.gra.getContentPane().getComponent(17).setVisible(true);
        }

        if(Main.pokój[16]==false) {
            Main.gra.getContentPane().getComponent(18).setVisible(false);
        }
        if(Main.pokój[16]==true) {
            Main.gra.getContentPane().getComponent(18).setVisible(true);
        }

        if(Main.pokój[17]==false) {
            Main.gra.getContentPane().getComponent(19).setVisible(false);
        }
        if(Main.pokój[17]==true) {
            Main.gra.getContentPane().getComponent(19).setVisible(true);
        }

        if(Main.pokój[18]==false) {
            Main.gra.getContentPane().getComponent(20).setVisible(false);
        }
        if(Main.pokój[18]==true) {
            Main.gra.getContentPane().getComponent(20).setVisible(true);
        }

        if(Main.pokój[19]==false) {
            Main.gra.getContentPane().getComponent(21).setVisible(false);
        }
        if(Main.pokój[19]==true) {
            Main.gra.getContentPane().getComponent(21).setVisible(true);
        }

        if(Main.pokój[20]==false) {
            Main.gra.getContentPane().getComponent(22).setVisible(false);
        }
        if(Main.pokój[20]==true) {
            Main.gra.getContentPane().getComponent(22).setVisible(true);
        }

        if(Main.pokój[21]==false) {
            Main.gra.getContentPane().getComponent(23).setVisible(false);
        }
        if(Main.pokój[21]==true) {
            Main.gra.getContentPane().getComponent(23).setVisible(true);
        }

        if(Main.pokój[22]==false) {
            Main.gra.getContentPane().getComponent(24).setVisible(false);
        }
        if(Main.pokój[22]==true) {
            Main.gra.getContentPane().getComponent(24).setVisible(true);
        }

        if(Main.pokój[23]==false) {
            Main.gra.getContentPane().getComponent(25).setVisible(false);
        }
        if(Main.pokój[23]==true) {
            Main.gra.getContentPane().getComponent(25).setVisible(true);
        }

        if(Main.pokój[24]==false) {
            Main.gra.getContentPane().getComponent(26).setVisible(false);
        }
        if(Main.pokój[24]==true) {
            Main.gra.getContentPane().getComponent(26).setVisible(true);
        }

        if(Main.pokój[25]==false) {
            Main.gra.getContentPane().getComponent(27).setVisible(false);
        }
        if(Main.pokój[25]==true) {
            Main.gra.getContentPane().getComponent(27).setVisible(true);
        }

        if(Main.pokój[26]==false) {
            Main.gra.getContentPane().getComponent(28).setVisible(false);
        }
        if(Main.pokój[26]==true) {
            Main.gra.getContentPane().getComponent(28).setVisible(true);
        }

        if(Main.pokój[27]==false) {
            Main.gra.getContentPane().getComponent(29).setVisible(false);
        }
        if(Main.pokój[27]==true) {
            Main.gra.getContentPane().getComponent(29).setVisible(true);
        }

        if(Main.pokój[28]==false) {
            Main.gra.getContentPane().getComponent(30).setVisible(false);
        }
        if(Main.pokój[28]==true) {
            Main.gra.getContentPane().getComponent(30).setVisible(true);
        }

        if(Main.pokój[29]==false) {
            Main.gra.getContentPane().getComponent(31).setVisible(false);
        }
        if(Main.pokój[29]==true) {
            Main.gra.getContentPane().getComponent(31).setVisible(true);
        }

        if(Main.pokój[30]==false) {
            Main.gra.getContentPane().getComponent(32).setVisible(false);
        }
        if(Main.pokój[30]==true) {
            Main.gra.getContentPane().getComponent(32).setVisible(true);
        }

        if(Main.pokój[31]==false) {
            Main.gra.getContentPane().getComponent(33).setVisible(false);
        }
        if(Main.pokój[31]==true) {
            Main.gra.getContentPane().getComponent(33).setVisible(true);
        }

        if(Main.pokój[32]==false) {
            Main.gra.getContentPane().getComponent(34).setVisible(false);
        }
        if(Main.pokój[32]==true) {
            Main.gra.getContentPane().getComponent(34).setVisible(true);
        }

        if(Main.pokój[33]==false) {
            Main.gra.getContentPane().getComponent(35).setVisible(false);
        }
        if(Main.pokój[33]==true) {
            Main.gra.getContentPane().getComponent(35).setVisible(true);
        }

        if(Main.pokój[34]==false) {
            Main.gra.getContentPane().getComponent(36).setVisible(false);
        }
        if(Main.pokój[34]==true) {
            Main.gra.getContentPane().getComponent(36).setVisible(true);
        }

        if(Main.pokój[35]==false) {
            Main.gra.getContentPane().getComponent(37).setVisible(false);
        }
        if(Main.pokój[35]==true) {
            Main.gra.getContentPane().getComponent(37).setVisible(true);
        }
    }


    public void run(){
        while (true){
            windows();
            try { Thread.sleep(40);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}