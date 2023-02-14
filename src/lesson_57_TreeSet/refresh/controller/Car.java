package lesson_57_TreeSet.refresh.controller;
import java.util.Objects;

public class Car implements Comparable<Car> {
    private int numberOfCar;
    private String brend;
    private double price;
    private int mileage;

    public Car(int numberOfCar, String brend, double price, int mileage) {
        this.numberOfCar = numberOfCar;
        this.brend = brend;
        this.price = price;
        this.mileage = mileage;
    }

    public int getNumberOfCar() {
        return numberOfCar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getNumberOfCar() == car.getNumberOfCar() && Double.compare(car.price, price) == 0 && mileage == car.mileage && Objects.equals(brend, car.brend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumberOfCar(), brend, price, mileage);
    }

    @Override
    public String toString() {
        return "Car " +
                "numberOfCar " + numberOfCar +
                ", brend " + brend +
                ", price " + price +
                ", mileage " + mileage;
    }


    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.getNumberOfCar(), o.getNumberOfCar());
    }
}
