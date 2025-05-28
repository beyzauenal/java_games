package at.beyza.games.firstname.PraxisTest;

public class GUI2 implements LibraryManager{

    @Override
    public void getAllMedia() {
        System.out.println("Alle Medien laufen");
    }

    @Override
    public void getCalculateTotalMediaValue() {
        System.out.println("Zähle alle Medien.");
    }

    @Override
    public void start() {
        System.out.println("Start, I'm GUI 2");
    }

    @Override
    public void addMedia() {
        System.out.println("Füge Media hinzu");
    }

    public void showallmedia(){
        System.out.println("Zeige alle medien");
    }

    public void getCalculaTotalMediaValueInStock(){
        System.out.println("Zahle alle Medien, im Stock");

    }
}
