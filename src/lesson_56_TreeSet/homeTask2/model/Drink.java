package lesson_56_TreeSet.homeTask2.model;

import java.util.Objects;

public abstract class Drink {

    private double weight;

    public Drink(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return Double.compare(drink.getWeight(), getWeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeight());
    }
}
