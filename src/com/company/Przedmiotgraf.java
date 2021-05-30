package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Przedmiotgraf extends JPanel {

    Main Main;

    public Przedmiotgraf(Main Main) {
        this.Main = Main;
        setSize(750, 750);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

    }
}