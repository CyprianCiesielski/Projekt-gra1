package src.com.company;

import com.company.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class informacja extends JPanel implements MouseListener {

    com.company.Main Main;
    public informacja(com.company.Main Main){
        this.Main = Main;
        setSize(800, 800);
        addMouseListener(this);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(Main.game == true) {
            ImageIcon info = new ImageIcon("src/Gra/ekran z informacja.png");
            g.drawImage(info.getImage(), 0, 0, 800, 800, null);
        }
    }



    @Override
    public void mouseClicked(MouseEvent e) {
        if (Main.game == true) {
            if (e.getX() >= 0 && e.getX() <= 800) {
                if (e.getY() >= 0 && e.getY() <= 800) {
                    Main.game = false;
                    Main.pokój[0] = true;
                    repaint();
                }
            }
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
