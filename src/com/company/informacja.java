package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class informacja extends JPanel implements MouseListener {

    Main Main;
    public informacja(Main Main){
        this.Main = Main;
        setSize(800, 800);
        addMouseListener(this);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(Main.game == true) {
            ImageIcon info = new ImageIcon("/Users/cyprian.ciesielski/IdeaProjects/Projekt-gra1/src/Gra/ekran z informacja.png");
            g.drawImage(info.getImage(), 0, 0, 800, 800, null);
        }
    }



    @Override
    public void mouseClicked(MouseEvent e)  {
        System.out.println(e.getPoint());
        if(e.getX()>=40 && e.getX()<=334 && e.getY()>=477 && e.getY()<=591) {
        }

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
