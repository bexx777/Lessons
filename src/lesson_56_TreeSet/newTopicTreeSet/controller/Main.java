package lesson_56_TreeSet.newTopicTreeSet.controller;

import lesson_56_TreeSet.newTopicTreeSet.model.Car;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<String> electraCars = new TreeSet<>();
        electraCars.add("Tesla");
        electraCars.add("GolfCar");
        electraCars.add("BMW");
        electraCars.add("Volkswagen");
        electraCars.add("Z-mobile");
        electraCars.add("Audi");
        System.out.println(electraCars);
        System.out.println("*".repeat(100));
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(112312);
        numbers.add(21);
        numbers.add(9);
        System.out.println(numbers);
        System.out.println("*".repeat(100));
        TreeSet<Car> cars = new TreeSet<>();
        cars.add(new Car("Tesla", 2, 200));
        cars.add(new Car("BMV", 6, 250));
        cars.add(new Car("Opel", 4, 210));
        System.out.println(cars);
        TreeSet<Car> cars2 = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                //return o1.getTitle().compareTo(o2.getTitle());
                return Double.compare(o1.getMaxSpeed(), o2.getMaxSpeed());
            }
        });
        cars2.add(new Car("Tesla", 2, 230));
        cars2.add(new Car("BMV", 6, 250));
        cars2.add(new Car("Opel", 4, 210));
        cars2.add(new Car("Opel", 4, 210));
        cars2.add(new Car("Kia", 5, 240));
        System.out.println(cars2);

    }
}
//    Создайте два TreeSet:
//- первый при помощи интерфейса Comparable - по id
//- второй при помощи интерфейса Comparator - по количеству лайков
//    со звездочкой:
//- создайте еще один TreeSet - сортированный по длине поста