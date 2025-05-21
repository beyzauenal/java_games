package at.beyza.games.firstname.ObjectsGame;

import org.newdawn.slick.*;

public class Cannonball implements Actor {
    private float x, y;

    public Cannonball(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillOval(this.x, this.y, 10, 10);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {

        this.y -= 0.2f * delta;
    }
}

