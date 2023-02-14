package lesson_58_TreeMap.refresh.controller;

import lesson_57_TreeSet.newTopic.model.Documentary;
import lesson_58_TreeMap.refresh.model.Camedy;
import lesson_58_TreeMap.refresh.model.Film;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Film> films = new TreeSet<>(new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return Integer.compare(o1.getYear(), o2.getYear());
            }
        }.thenComparing(new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        }));
        films.add(new Camedy("Java house", 2023));
        films.add(new Camedy("Java house", 2021));
        films.add(new Documentary("Home alone", 2020));
        films.add(new Documentary("Cuыto", 2020));
        films.add(new Documentary("Paper Hot", 2019));
        films.add(new Documentary("Old peple in 2016", 2016));


        TreeSet<Film> films2 = new TreeSet<>(films.comparator());
        Set<Film> result = films.subSet(new Camedy("A", 2019), true, new Camedy("Z", 2021), true);

        //Ананимный класс
        Film anonymus = new Film("X-men", 2030) {
            private int x = 10;

            public int getX() {
                return x;
            }

            @Override
            public String getTitle() {
                return super.getTitle() + " " + x;
            }
        };
        System.out.println(anonymus.getTitle());
    }
}

