package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Pokojegraf extends JPanel implements MouseListener {

    Main Main;
    public Pokojegraf(Main Main){
        this.Main = Main;
        setSize(800, 800);
        addMouseListener(this);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(Main.pokój[0] == true) {
            ImageIcon pokoj0 = new ImageIcon("src/Gra/pokoje/pokoje z 2 drzwiami/podstawowy_pokój.png");
            g.drawImage(pokoj0.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[1] == true) {
            ImageIcon pokoj1 = new ImageIcon("");
            g.drawImage(pokoj1.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[2] == true) {
            ImageIcon pokoj2 = new ImageIcon("");
            g.drawImage(pokoj2.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[3] == true) {
            ImageIcon pokoj3 = new ImageIcon("");
            g.drawImage(pokoj3.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[4] == true) {
            ImageIcon pokoj4 = new ImageIcon("");
            g.drawImage(pokoj4.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[5] == true) {
            ImageIcon pokoj5 = new ImageIcon("");
            g.drawImage(pokoj5.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[6] == true) {
            ImageIcon pokoj6 = new ImageIcon("");
            g.drawImage(pokoj6.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[7] == true) {
            ImageIcon pokoj7 = new ImageIcon("");
            g.drawImage(pokoj7.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[8] == true) {
            ImageIcon pokoj8 = new ImageIcon("");
            g.drawImage(pokoj8.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[9] == true) {
            ImageIcon pokoj9 = new ImageIcon("");
            g.drawImage(pokoj9.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[10] == true) {
            ImageIcon pokoj10 = new ImageIcon("");
            g.drawImage(pokoj10.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[11] == true) {
            ImageIcon pokoj11 = new ImageIcon("");
            g.drawImage(pokoj11.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[12] == true) {
            ImageIcon pokoj12 = new ImageIcon("");
            g.drawImage(pokoj12.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[13] == true) {
            ImageIcon pokoj13 = new ImageIcon("");
            g.drawImage(pokoj13.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[14] == true) {
            ImageIcon pokoj14 = new ImageIcon("");
            g.drawImage(pokoj14.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[15] == true) {
            ImageIcon pokoj15 = new ImageIcon("");
            g.drawImage(pokoj15.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[16] == true) {
            ImageIcon pokoj16 = new ImageIcon("");
            g.drawImage(pokoj16.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[17] == true) {
            ImageIcon pokoj17 = new ImageIcon("");
            g.drawImage(pokoj17.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[18] == true) {
            ImageIcon pokoj18 = new ImageIcon("");
            g.drawImage(pokoj18.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[19] == true) {
            ImageIcon pokoj19 = new ImageIcon("");
            g.drawImage(pokoj19.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[20] == true) {
            ImageIcon pokoj20 = new ImageIcon("");
            g.drawImage(pokoj20.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[21] == true) {
            ImageIcon pokoj21 = new ImageIcon("");
            g.drawImage(pokoj21.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[22] == true) {
            ImageIcon pokoj22 = new ImageIcon("");
            g.drawImage(pokoj22.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[23] == true) {
            ImageIcon pokoj23 = new ImageIcon("");
            g.drawImage(pokoj23.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[24] == true) {
            ImageIcon pokoj24 = new ImageIcon("");
            g.drawImage(pokoj24.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[25] == true) {
            ImageIcon pokoj25 = new ImageIcon("");
            g.drawImage(pokoj25.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[26] == true) {
            ImageIcon pokoj26 = new ImageIcon("");
            g.drawImage(pokoj26.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[27] == true) {
            ImageIcon pokoj27 = new ImageIcon("");
            g.drawImage(pokoj27.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[28] == true) {
            ImageIcon pokoj28 = new ImageIcon("");
            g.drawImage(pokoj28.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[29] == true) {
            ImageIcon pokoj29 = new ImageIcon("");
            g.drawImage(pokoj29.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[30] == true) {
            ImageIcon pokoj30 = new ImageIcon("");
            g.drawImage(pokoj30.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[31] == true) {
            ImageIcon pokoj31 = new ImageIcon("");
            g.drawImage(pokoj31.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[32] == true) {
            ImageIcon pokoj32 = new ImageIcon("");
            g.drawImage(pokoj32.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[33] == true) {
            ImageIcon pokoj33 = new ImageIcon("");
            g.drawImage(pokoj33.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[34] == true) {
            ImageIcon pokoj34 = new ImageIcon("");
            g.drawImage(pokoj34.getImage(), 0, 0, 800, 800, null);
        }
        if(Main.pokój[35] == true) {
            ImageIcon pokoj35 = new ImageIcon("");
            g.drawImage(pokoj35.getImage(), 0, 0, 800, 800, null);
        }
    }



    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {


    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


}


