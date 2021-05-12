package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Panel extends JPanel implements MouseListener {
    public Panel(){
        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon obrazstartowy = new ImageIcon("src/Gra/ekran_początkowy.png");
        System.out.println(g.getClipBounds().width + " "+g.getClipBounds().height);
        /*g.setColor(Color.gray);
        for(int i = 0; i < 32; i++)
            g.drawLine(i*20,0,i*20,479);
        for(int i = 0; i < 24; i++)
            g.drawLine(0,i*20,639,i*20);*/

        g.drawImage(obrazstartowy.getImage(),0,0,800,800, null );


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getX()>=285 && e.getX()<=510) {
            if (e.getY() >= 503 && e.getY() <= 610){

            }
        }
        if(e.getX()>=327 && e.getX()<=478){
                    if(e.getY()>=634 && e.getY()<=742) {
                        System.exit(0);
                    }
        }



        System.out.println(e.getX() + " " + e.getY());
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
