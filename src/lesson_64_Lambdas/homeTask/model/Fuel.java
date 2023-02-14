package lesson_64_Lambdas.homeTask.model;

public enum Fuel {
    PETROL_95(1.57), PETROL_98(1.76), DIESEL(1.74);

    double price;

    Fuel(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
