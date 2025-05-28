package at.beyza.games.firstname.test2;

import java.awt.*;

public class Shoe implements Product{
    private Color color;
    private int id;
    private String title;
    private int price;


    public Shoe(Color color, int id, String title, int price) {
        this.color = color;
        this.id = id;
        this.title = title;
        this.price = price;
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public String getTitle() {
        return this.title;
    }


    public int getPrice(){
        return this.price;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void drive() {
        System.out.println("Der Schuh läuft.");
    }

}
