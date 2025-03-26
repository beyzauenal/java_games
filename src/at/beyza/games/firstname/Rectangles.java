package at.beyza.games.firstname;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Rectangles extends BasicGame {
    private int x;
    private int y;

    public Rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 100;
        this.y = 100; // y wird nun auch initialisiert
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.x++;
        this.y++;

        // Falls x oder y eine bestimmte Grenze überschreiten, zurücksetzen
        if (this.x > 700) this.x = 100;
        if (this.y > 500) this.y = 100;
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x, this.y, 100, 100); // Korrekte Parameter
        graphics.drawString("Hello you", 50, 50);
    }

    public static void main(String[] args) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangles("Rectangles"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}



