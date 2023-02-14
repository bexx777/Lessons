package lesson_57_TreeSet.newTopic.controller;
import lesson_57_TreeSet.newTopic.model.Place;
import lesson_57_TreeSet.newTopic.model.Wedding;
import java.time.LocalDate;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(13);
        numbers.add(9);
        numbers.add(18);
        numbers.add(22);
        numbers.add(94);
        System.out.println(numbers.first());
        System.out.println(numbers.last());
        System.out.println(numbers.subSet(12, 22));
        System.out.println(numbers.headSet(18)); //от первого до указанного числа
        System.out.println(numbers.tailSet(18));// от куазаного и до конца
        System.out.println("*".repeat(100));
        LocalDate localDate = LocalDate.of(2022, 12, 14);
        // System.out.println(localDate);
        LocalDate localDate1 = LocalDate.of(2023, 01, 15);
        // System.out.println(localDate1);
        // System.out.println(localDate.compareTo(localDate1));

        TreeSet<Wedding> weddings = new TreeSet<>();
        weddings.add(new Wedding(LocalDate.of(2022, 12, 22), "Dima", "Kira",
                new Place(55, "Wilmersdorfer Str. 143")));
        weddings.add(new Wedding(LocalDate.of(2021, 11, 11), "Oleg", "Ira",
                new Place(45, "Wilmersdorfer Str. 143")));
        weddings.add(new Wedding(LocalDate.of(2023, 12, 9), "Kiril", "Inga",
                new Place(100, "Wilmersdorfer Str. 143")));
        System.out.println(weddings);
        System.out.println("*".repeat(100));
        Set<Wedding> result = weddings.subSet(new Wedding(LocalDate.of(2022, 1, 1)),true, new Wedding(LocalDate.of(2023, 1, 1)),true);
        for (Wedding wedding : result) {
            System.out.println(wedding);
            System.out.println("*".repeat(100));
        }
    }

}