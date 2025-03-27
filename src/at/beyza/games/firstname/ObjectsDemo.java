package at.beyza.games.firstname;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ObjectsDemo extends JPanel implements ActionListener {

    private int rectX = 50, rectY = 50;
    private int circleX = 150, circleY = 150;
    private int ovalX = 250, ovalY = 100;

    private int rectDX = 2, rectDY = 2;
    private int circleDX = 3, circleDY = 3;
    private int ovalDX = 4, ovalDY = 2;

    Timer timer;

    public ObjectsDemo() {
        timer = new Timer(20, this);
        timer.start();
    }

