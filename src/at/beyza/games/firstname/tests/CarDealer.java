package at.beyza.games.firstname.tests;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {

    private List<Vehicle> vehicles = new ArrayList<Vehicle>();

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void printAllVehicles(){
        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle.getId() + ": " + vehicle.getName());
        }
    }

}


