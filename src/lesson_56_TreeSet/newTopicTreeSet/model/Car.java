package lesson_56_TreeSet.newTopicTreeSet.model;

public class Car implements Comparable<Car> {
    private String title;
    private double engenVolume;
    private int maxSpeed;

    public Car(String title, double engenVolume, int maxSpeed) {
        this.title = title;
        this.engenVolume = engenVolume;
        this.maxSpeed = maxSpeed;
    }

    public String getTitle() {
        return title;
    }

    public double getEngenVolume() {
        return engenVolume;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return String.format("%s %f %d ",title,engenVolume,maxSpeed);
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.maxSpeed,o.maxSpeed);
    }
}
