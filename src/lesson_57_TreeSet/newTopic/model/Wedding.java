package lesson_57_TreeSet.newTopic.model;

import java.time.LocalDate;

public class Wedding implements Comparable<Wedding> {
    private LocalDate date;
    private String groomName;
    private String bridesName;
    private Place place;

    public Wedding(LocalDate date, String groomName, String bridesName, Place place) {
        this.date = date;
        this.groomName = groomName;
        this.bridesName = bridesName;
        this.place = place;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getGroomName() {
        return groomName;
    }

    public String getBridesName() {
        return bridesName;
    }

    public Place getPlace() {
        return place;
    }

    public Wedding(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Wedding " +
                "date " + date +
                ", groomName " + groomName +
                ", bridesName " + bridesName +
                ", place " + place + "\n" ;
    }

    @Override
    public int compareTo(Wedding o) {
        return this.getDate().compareTo(o.getDate());
    }
}
