package at.beyza.games.firstname.PraxisTest;

public class Hoerbuecher implements Buch{
    private int id;
    private String title;
    private String description;
    private int price;

    public Hoerbuecher(int id, String title, String description, int price) {
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

    public void playSample() {
        System.out.println("Die Musikbücher laufen...");
    }
}
