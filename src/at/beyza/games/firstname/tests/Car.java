package at.beyza.games.firstname.tests;

public class Car extends AbstractVehicle {

    public Car(String name, int id) {
        super(name, id);
    }

    @Override
    public void drive() {
        System.out.println("car is driving");
    }
}

