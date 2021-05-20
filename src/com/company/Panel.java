package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Panel extends JPanel implements MouseListener {
    Main Main;
    public Panel(Main Main){
        this.Main = Main;
        setSize(800,800);
        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(Main.start == true) {
            ImageIcon obrazstartowy = new ImageIcon("src/Gra/ekran_początkowy.png");
            System.out.println(g.getClipBounds().width + " " + g.getClipBounds().height);
            g.drawImage(obrazstartowy.getImage(), 0, 0, 800, 800, null);
        }


    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(Main.game == false) {
            if (e.getX() >= 285 && e.getX() <= 510) {
                if (e.getY() >= 503 && e.getY() <= 610) {
                    Main.start = false;
                    Main.game = true;
                    repaint();
                }
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
