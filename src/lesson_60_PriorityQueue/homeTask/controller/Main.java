package lesson_60_PriorityQueue.homeTask.controller;

import lesson_60_PriorityQueue.homeTask.model.Violin;

import java.time.LocalDate;
import java.util.*;
//        Задание 1 Varargs
//        Создайте класс скрипка. Пусть у скрипки будут поля:
//        String имя мастера,
//        LocalDate дата производства
//        Создайте в Майне метод, который должен принимать произвольное число скрипок и возвращать имя мастера самой старой скрипки из переданных.
//        То есть метод должен бытия статическим и возвращать String.

public class Main {
    public static void main(String[] args) {
        System.out.println(thrOldestViolin(new Violin("Якоб Штайнер ", LocalDate.of(1650, 10, 1)),
                new Violin("Никола Амати", LocalDate.of(1630, 11, 2)),
                new Violin("Антонио Страдивари", LocalDate.of(1710, 1, 1)),
                new Violin("Иван Андреевич Батов", LocalDate.of(1820, 1, 1))));
        toArrayDeque(new Violin("Якоб Штайнер ", LocalDate.of(1650, 10, 1)),
                new Violin("Никола Амати", LocalDate.of(1630, 11, 2)),
                new Violin("Антонио Страдивари", LocalDate.of(1710, 1, 1)),
                new Violin("Иван Андреевич Батов", LocalDate.of(1820, 1, 1)));

    }

    public static String thrOldestViolin(Violin... violins) {
        TreeSet<Violin> treeSetViolin = new TreeSet<>(new Comparator<Violin>() {
            @Override
            public int compare(Violin o1, Violin o2) {
                return -o1.getDate().compareTo(o2.getDate());
            }
        });
        for (int i = 0; i < violins.length; i++) {
            treeSetViolin.add(violins[i]);
        }
        return String.valueOf(treeSetViolin.last());
    }

    public static String thrOldestViolin2(Violin... violins) {
        TreeSet<Violin> treeSetViolin = new TreeSet<>(new Comparator<Violin>() {
            @Override
            public int compare(Violin o1, Violin o2) {
                return -o1.getDate().compareTo(o2.getDate());
            }
        });
        Collections.addAll(treeSetViolin, violins);
        return treeSetViolin.last().getMasterName();
    }

    public static String thrOldestViolin3(Violin... violins) {
        String master = violins[0].getMasterName();
        LocalDate date = violins[0].getDate();
        for (int i = 0; i < violins.length; i++) {
            if (violins[i].getDate().isBefore(date)) {
                date = violins[i].getDate();
                master = violins[i].getMasterName();
            }
        }
        return master;
    }

    public static String thrOldestViolin4(Violin... violins) {
        PriorityQueue<Violin> violinPriorityQueue  = new PriorityQueue<>(new Comparator<Violin>() {
            @Override
            public int compare(Violin o1, Violin o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        });
        for (Violin violin: violins) {
            violinPriorityQueue.add(violin);
        }
        return violinPriorityQueue.element().getMasterName();
    }

    //LIFO
    public static void toArrayDeque(Violin... violins) {
        System.out.println("*".repeat(100));
        ArrayDeque<Violin> violinsArrayDeque = new ArrayDeque<>(List.of(violins));
        System.out.println(violinsArrayDeque.pop());
        System.out.println(violinsArrayDeque.add(new Violin("Якоб Штайнер ", LocalDate.of(1650, 10, 1))));
        System.out.println("*".repeat(100));
        System.out.println(violinsArrayDeque.size());
        System.out.println(violinsArrayDeque.offerFirst(new Violin("Giga", LocalDate.of(1000, 1, 1))));
        System.out.println(violinsArrayDeque.peekFirst());
        System.out.println(violinsArrayDeque.getFirst());
        System.out.println(violinsArrayDeque.peek());
        violinsArrayDeque.offerLast(new Violin("Gogi", LocalDate.of(1000, 1, 1)));
        System.out.println(violinsArrayDeque.peekLast());
        System.out.println(violinsArrayDeque.getLast());
        System.out.println("*".repeat(100));
        System.out.println(violinsArrayDeque.descendingIterator());
        System.out.println(violinsArrayDeque.contains(new Violin("Gogi", LocalDate.of(1000, 1, 1))));
        System.out.println(violinsArrayDeque.element());
        System.out.println(violinsArrayDeque.isEmpty());
        System.out.println(violinsArrayDeque);
        System.out.println(violinsArrayDeque);
    }
}


//        Задание 2
//        Реализуйте принципы FIFO и LIFO, используя интерфейсы ArrayDeque и Queue. (Нужно поэкспериментировать с методами)
//        Подпишите, где какой принцип.  (отредактировано)