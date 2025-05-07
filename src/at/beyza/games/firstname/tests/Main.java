package at.beyza.games.firstname.tests;

public class Main {
    public static void main(String[] args) {
        CarDealer dealer = new CarDealer();

        Car car = new Car("Car",1);
        Train train = new Train("train",1);
        AeroCar aeroCar = new AeroCar("flyingcar",3);

        dealer.addVehicle(car);
        dealer.addVehicle(train);
        dealer.addVehicle(aeroCar);

        car.drive();
        train.drive();
        aeroCar.drive();
        aeroCar.fly();

        dealer.printAllVehicles();


    }
}
