package at.beyza.games.firstname.tests;

public class AeroCar extends Car{
    public AeroCar(String name, int id) {
        super(name, id);
    }

    @Override
    public void drive() {
        System.out.println("aerocar is driving");
    }

    public void fly(){
        System.out.println("aerocar flying");
    }
}
