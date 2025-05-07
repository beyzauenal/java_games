package at.beyza.games.firstname.tests;

public abstract class AbstractVehicle implements Vehicle {
  private String name;
  private int Id;


    public AbstractVehicle(String name, int id) {
        this.name = name;
        Id = id;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.Id;
    }

}