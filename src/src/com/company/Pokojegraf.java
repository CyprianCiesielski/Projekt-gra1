package src.com.company;

import com.company.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Pokojegraf extends JPanel implements MouseListener {

    com.company.Main Main;
    public Pokojegraf(com.company.Main Main){
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


