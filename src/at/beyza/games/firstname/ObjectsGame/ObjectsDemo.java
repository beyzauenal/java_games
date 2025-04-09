package at.beyza.games.firstname.ObjectsGame;

import org.newdawn.slick.*;
import org.newdawn.slick.geom.Rectangle;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ObjectsDemo extends BasicGame {
    private List<Rectangels> rectangles;
    private List<Circle> circles;

    public ObjectsDemo(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangles = new ArrayList<>();
        this.circles = new LinkedList<>();

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            Rectangels rectangle = new Rectangels(
                    random.nextInt(600),
                    random.nextInt(600),
                    random.nextInt(50)
            );
            rectangles.add(rectangle);
        }
        for (int i = 0; i < 50; i++) {
            Circle circle = new Circle();
            this.circles.add(circle);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Rectangels rectangle : this.rectangles) {
            rectangle.update(delta);
        }
        for (Circle circle : this.circles) {
            circle.update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Rectangels rectangle : this.rectangles) {
            rectangle.render(graphics);
        }
        for (Circle circle : this.circles) {
            circle.render(graphics);
        }
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
