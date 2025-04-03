package at.beyza.games.firstname.ObjectsGame;

import org.newdawn.slick.*;
import org.newdawn.slick.geom.Rectangle;

public class ObjectsDemo extends BasicGame {
    private Rectangle rectangle;
    private Rectangle rectangle2;

    public ObjectsDemo(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangle = new Rectangle(100, 100, 50, 50);
        this.rectangle2 = new Rectangle(200, 400, 100, 50);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.draw(rectangle);
        graphics.draw(rectangle2);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsDemo("ObjectsDemo"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
