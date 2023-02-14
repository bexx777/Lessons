package lesson_60_PriorityQueue.newTopic_PriorityQueue.model;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Saloon {
    private String title;
    private PriorityQueue<Cowboy> cowboys = new PriorityQueue<>();

    public Saloon(String title) {
        this.title = title;
    }

    public void serveDrink() {
        System.out.println(cowboys.poll() + "Robbie Gonzales please take your whiskey");
    }

    public void letCowboyIn(Cowboy... cowboy) {
        cowboys.addAll(Arrays.asList(cowboy));
    }
}
