package lesson_60_PriorityQueue.newTopic_PriorityQueue.model;

import java.util.Comparator;

public class Cowboy implements Comparable<Cowboy> {
    private String name;
    private double gunaWeight;

    public Cowboy(String name, double gunaWeight) {
        this.name = name;
        this.gunaWeight = gunaWeight;
    }

    public String getName() {
        return name;
    }

    public double getGunaWeight() {
        return gunaWeight;
    }

    @Override
    public String toString() {
        return String.format("Cowboy %s \n", name);
    }


    @Override
    public int compareTo(Cowboy o) {
        return Double.compare(this.getGunaWeight(), o.getGunaWeight());
    }
}
