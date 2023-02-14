package lesson_60_PriorityQueue.homeTask.model;

import java.time.LocalDate;

public class Violin {
    private String masterName;
    private LocalDate date;

    public Violin(String masterName, LocalDate date) {
        this.masterName = masterName;
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getMasterName() {
        return masterName;
    }

    @Override
    public String toString() {
        return String.format("Мастер: %s ", masterName);
    }
}
