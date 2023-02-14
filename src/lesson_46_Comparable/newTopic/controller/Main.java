package lesson_46_Comparable.newTopic.controller;

import lesson_46_Comparable.newTopic.model.Bicycle;
import lesson_46_Comparable.newTopic.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student(5, "george", 50));
        students.add(new Student(9, "Snezhana", 28));
        students.add(new Student(1, "bob", 23));
        students.add(new Student(3, "john", 15));
        System.out.println("До сортировки");
        for (Student st : students) {
            System.out.println(st);
        }
        Collections.sort(students);
        System.out.println("После сортировки");
        for (Student st : students) {
            System.out.println(st);
        }
//        Student donald = new Student(15, "Donald", 19);
//        Student robert = new Student(15, "Robert", 18);
//        System.out.println(donald.compareTo(robert));

        // Создайте класс велосипед с приватными полями numberOfGears, maxSpeed, title
        // в мейне создайте ArrayList с велосипедами и произвольно наполните его в хаотичном порядке.
        // И отсортируйте по максимальной скорости
        // после чего распечатайте

        // Создайте класс велосипед с приватными полями numberOfGears, maxSpeed, title
        // в мейне создайте ArrayList с велосипедами и произвольно наполните его в хаотичном порядке.
        // И отсортируйте по максимальной скорости
        // после чего распечатайте

        ArrayList<Bicycle> bikes = new ArrayList<>();
        bikes.add(new Bicycle("linux", 3, 30));
        bikes.add(new Bicycle("stels", 1, 25));
        bikes.add(new Bicycle("bearbikes", 1, 45));
        bikes.add(new Bicycle("merida", 10, 35));
        System.out.println("До сортировки");
        for (Bicycle bike : bikes) {
            System.out.println(bike);
        }
        Collections.sort(bikes);
        System.out.println("После сортировки");
        for (Bicycle bike : bikes) {
            System.out.println(bike);

        }
    }
}