package at.beyza.games.firstname.Bild;

import org.newdawn.slick.Image;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class dino implements Actor {
    private Image dinoimage;
    private float x;
    private float y;

    public dino() throws SlickException {
        Image tap = new Image("testdata/dino.png");
        this.dinoimage = tap.getScaledCopy(50, 50);
        this.x = 100;
        this.y = 100;
    }

    @Override
    public void render(Graphics graphics) {
        dinoimage.draw(this.x, this.y);
    }

    @Override
    public void update(int delta) {
        this.x++;
    }
}
