package at.beyza.games.firstname.PraxisTest;

import java.awt.*;

public class Romane implements Buch{
    private int id;
    private String title;
    private String description;
    private int price;
    private String genre;

    public Romane(int id, String title, String description, int price, String genre) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
    }



    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public String getTitel() {
        return this.title;
    }

    @Override
    public String getDiscription() {
        return this.description;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    public String getGenre(){
        return this.genre;

    }
}


