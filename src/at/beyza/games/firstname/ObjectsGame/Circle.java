package at.beyza.games.firstname.ObjectsGame;

import org.newdawn.slick.Graphics;

public class Circle implements Actor {
    private float x, y;
    private float speed;
    private float diameter;  // Neues Attribut für den Durchmesser

    public Circle(int x, int y, float diameter) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;  // Initialisieren des Durchmessers
        this.speed = 5;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, diameter, diameter); // Verwenden des Durchmessers
    }

    @Override
    public void update(int delta) {
        this.x += (float) delta / this.speed;
        this.y += (float) delta / this.speed;
    }
}
