package at.beyza.games.firstname.ObjectsGame;

import org.newdawn.slick.*;

public class Flower implements Actor {
    private Image flowerImage;
    private float x, y;

    public Flower(Image flowerImage) throws SlickException {
        Image tep = new Image("testdata/flower.png");
        this.flowerImage = tep.getScaledCopy(100, 100);
        this.x = 100;
        this.y = 100;
    }

    @Override
    public void render(Graphics graphics) {
        flowerImage.draw(x, y);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        Input input = gameContainer.getInput();
        if (input.isKeyDown(Input.KEY_RIGHT)) {
            this.x++;
        }
        if (input.isKeyDown(Input.KEY_LEFT)) {
            this.x--;
        }
        if (input.isKeyDown(Input.KEY_DOWN)) {
            this.y++;
        }
        if (input.isKeyDown(Input.KEY_UP)) {
            this.y--;
        }
    }

    public float getX() {
        return x + 50;
    }

    public float getY() {
        return y - 10;
    }
}
