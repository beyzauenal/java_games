package at.beyza.games.firstname.PraxisTest;

public class GUI2 implements LibraryManager{

    @Override
    public void getAllMedia() {
        System.out.println("Alle Medien laufen");
    }

    @Override
    public void getCalculateTotalMedia() {
        System.out.println("Zähle alle Medien.");
    }

    @Override
    public void start() {
        System.out.println("Start, I'm ");
    }

    @Override
    public void addMedia() {

    }
}
