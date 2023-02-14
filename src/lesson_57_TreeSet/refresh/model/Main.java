package lesson_57_TreeSet.refresh.model;

import lesson_57_TreeSet.refresh.controller.Car;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Car> carSet1 = new HashSet<>();
        carSet1.add(new Car(323434, "BMW", 2000.0, 18998));
        carSet1.add(new Car(156475, "Audi", 2000.0, 18998));
        Set<Car> carSet2 = new HashSet<>();
        carSet2.add(new Car(23423423, "Opel", 2000.0, 18998));
        carSet2.add(new Car(323434, "BMW", 2000.0, 18998));
        TreeSet<Car> cars = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Integer.compare(o1.getNumberOfCar(), o2.getNumberOfCar());
            }
        });
        cars.addAll(carSet1);
        cars.addAll(carSet2);
        System.out.println(cars);
        isCarsUniqve1(carSet1);


    }

    static boolean isCarsUniqve1(Set<Car> cars) {
        Set<Car> carSet = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Integer.compare(o1.getNumberOfCar(), o2.getNumberOfCar());
            }
        });
        carSet.addAll(cars);
        Set<Car> carSet1 = new HashSet<>(cars);
        return carSet.size() == carSet1.size();
    }
}

