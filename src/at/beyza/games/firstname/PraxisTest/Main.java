package at.beyza.games.firstname.PraxisTest;

public class Main {
    public static void main(String[] args) {
        GUI1 gui = new GUI1();

        gui.start();
        gui.addMedia();
        gui.getAllMedia();

        Hoerbuecher hoerbuch = new Hoerbuecher(1, "Hörbuch A", "Beschreibung A", 15);
        hoerbuch.playSample();


        Romane roman = new Romane(2, "Roman B", "Beschreibung B", 25, "Fantasy");
        System.out.println("Genre: " + roman.getGenre());
    }
}


