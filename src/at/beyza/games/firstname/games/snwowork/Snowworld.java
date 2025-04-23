package at.beyza.games.firstname.games.snwowork;

import at.beyza.games.firstname.ObjectsGame.ObjectsDemo;
import org.newdawn.slick.*;
import java.util.ArrayList;
import java.util.List;

public class Snowworld extends BasicGame {
    private List<Actor> snowflakes;

    public Snowworld(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.snowflakes = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            this.snowflakes.add(new Snowflake(Snowflake.SIZE.BIG));
            this.snowflakes.add(new Snowflake(Snowflake.SIZE.MEDIUM));
            this.snowflakes.add(new Snowflake(Snowflake.SIZE.SMALL));
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor flake : this.snowflakes) {
            flake.update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor flake : this.snowflakes) {
            flake.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Snowworld("Snowworld"));
            container.setDisplayMode(800, 600, false);
            container.setTargetFrameRate(60);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}

