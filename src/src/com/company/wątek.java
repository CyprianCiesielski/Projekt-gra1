package src.com.company;

import com.company.Main;

import javax.security.auth.Refreshable;
import javax.swing.*;

public class wątek extends Thread{

    public com.company.Main Main;

    public wątek(com.company.Main Main){
        this.Main = Main;
    }

    public void windows(){
        if(Main.start==false) {
            Main.gra.getContentPane().getComponent(0).setVisible(false);
            Main.gra.getContentPane().getComponent(2).setVisible(false);
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

        if(Main.pokój[0]==false){
            Main.gra.getContentPane().getComponent(2).setVisible(false);
        }
        if(Main.pokój[0]==true) {
            Main.gra.getContentPane().getComponent(2).setVisible(true);
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