package at.beyza.games.firstname.test2;

public class Phone implements Product{
    private int id;
    private String title;
    private int price;

    public Phone(int id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public String getTitle() {
        return this.title + " i am a phone";
    }

    @Override
    public int getPrice(){
        return this.price;
    }

    @Override
    public void drive() {
        System.out.println("The car is driving...");
    }
}