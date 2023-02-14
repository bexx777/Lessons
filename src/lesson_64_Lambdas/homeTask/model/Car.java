package lesson_64_Lambdas.homeTask.model;

public class Car {
    private String title;
    private double tankVolume;
    private Fuel fuel;

    public Car(String title, double tankVolume, Fuel fuel) {
        this.title = title;
        this.tankVolume = tankVolume;
        this.fuel = fuel;
    }

    public double costOfFullTank(){
       return tankVolume * fuel.price;
    }
    @Override
    public String toString() {
        return String.format("Car: %s The cost of filling a full tank",title);

    }
}
