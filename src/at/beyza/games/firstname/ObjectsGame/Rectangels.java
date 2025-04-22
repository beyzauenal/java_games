package at.beyza.games.firstname.ObjectsGame;

import org.newdawn.slick.Graphics;

public class Rectangels implements Actor {
    private float x, y;
    private float speed;
    private boolean leftToRight;


    public Rectangels(int x, int y, float speed, boolean leftToRight) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.leftToRight = leftToRight;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, 10, 10);
    }

    @Override
    public void update(int delta) {
        this.x += (float) delta / this.speed;
        if (this.x > 600) {
            this.x = 0;
        }else {
            this.x -= (float) delta / this.speed;
            if (this.x < 0) this.x = 600;
        }
    }
}
