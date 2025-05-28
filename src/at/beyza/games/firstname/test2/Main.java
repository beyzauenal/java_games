package at.beyza.games.firstname.test2;


public class Main {

    // dry - dont repeat yourself
    // open close
    public static void main(String[] args) {
        GUI gui = new GUI2();
        gui.addProduct(new Shoe(null,1,"test"));
        gui.addProduct(new Shoe(null,2,"test2"));
        gui.addProduct(new Phone(1,"superphone"));
        gui.addProduct(new Car());
        gui.start();
    }
}