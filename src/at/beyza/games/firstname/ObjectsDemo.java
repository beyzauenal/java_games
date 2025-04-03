package at.beyza.games.firstname;

import javax.swing.*;
import java.awt.*;

public class ObjectsDemo extends JPanel {
    private int rectX;
    private int rectY;
    private int circleX;
    private int circleY;
    private int ovalX;
    private int ovalY;
    private int speedRectX;
    private int speedCircleY;
    private int speedOvalX;
    private int speedOvalY;


    public ObjectsDemo() {
        this.rectX = 50;
        this.rectY = 50;
        this.circleX = 200;
        this.circleY = 50;
        this.ovalX = 350;
        this.ovalY = 50;
        this.speedRectX = 2;
        this.speedCircleY = 3;
        this.speedOvalX = 2;
        this.speedOvalY = 1;
        Timer timer = new Timer(16, e -> update());
        timer.start();
    }

    private void update() {
        this.rectX += this.speedRectX;
        this.circleY += this.speedCircleY;
        this.ovalX += this.speedOvalX;
        this.ovalY += this.speedOvalY;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        setBackground(Color.BLACK);
        graphics.setColor(Color.WHITE);
        graphics.drawRect(this.rectX, this.rectY, 100, 100);
        graphics.drawOval(this.circleX, this.circleY, 50, 50);
        graphics.drawOval(this.ovalX, this.ovalY, 150, 80);
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
