package at.beyza.games.firstname.tests;

public class Train extends AbstractVehicle{
    public Train(String name, int id) {
        super(name, id);
    }

    @Override
    public void drive() {
        System.out.println("Train is driving");
    }
}
