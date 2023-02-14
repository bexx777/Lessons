package lesson_57_TreeSet.newTopic.model;

public class Place {
    private int capacity;
    private String address;

    public Place(int capacity, String address) {
        this.capacity = capacity;
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Place " +
                "capacity " + capacity +
                ", address " + address;
    }
}
