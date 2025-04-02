package at.beyza.games.firstname;

import javax.swing.*;
import java.awt.*;

public class ObjectsDemo extends JPanel {
    private int rectX = 50, rectY = 50;
    private int circleX = 200, circleY = 50;
    private int ovalX = 350, ovalY = 50;

    private final int rectSpeed = 2;
    private final int circleSpeed = 3;
    private final int ovalSpeedX = 2, ovalSpeedY = 1;

    public ObjectsDemo() {
        Timer timer = new Timer(16, e -> update());
        timer.start();
    }

    private void update() {
        rectX += rectSpeed;
        circleY += circleSpeed;
        ovalX += ovalSpeedX;
        ovalY += ovalSpeedY;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.BLACK);
        g.setColor(Color.WHITE);
        g.drawRect(rectX, rectY, 100, 100);
        g.drawOval(circleX, circleY, 50, 50);
        g.drawOval(ovalX, ovalY, 150, 80);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving Objects");
        ObjectsDemo panel = new ObjectsDemo();
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
