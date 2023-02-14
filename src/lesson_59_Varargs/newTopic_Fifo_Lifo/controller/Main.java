package lesson_59_Varargs.newTopic_Fifo_Lifo.controller;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //LIFO
        ArrayDeque<String> fruitsArrayDeque = new ArrayDeque<>();
        fruitsArrayDeque.add("Orange");
        fruitsArrayDeque.push("Apple");
        fruitsArrayDeque.push("Second Orang");
        fruitsArrayDeque.push("Banana");
        fruitsArrayDeque.push("lemon");
        System.out.println("До поп" + "\n" + fruitsArrayDeque);
        System.out.println(fruitsArrayDeque.pop());
        System.out.println("*".repeat(100));
        System.out.println("После 1 поп" + "\n" + fruitsArrayDeque);
        System.out.println(fruitsArrayDeque.pop());
        System.out.println("*".repeat(100));
        System.out.println("После 2 поп" + "\n" + fruitsArrayDeque);
        System.out.println("*".repeat(100));
        System.out.println(fruitsArrayDeque.getLast());
        System.out.println(fruitsArrayDeque);
        System.out.println("*".repeat(100));
        System.out.println(fruitsArrayDeque.peekFirst());
        System.out.println("*".repeat(100));
        //FIFO
        Queue<String> villains = new LinkedList<>();
        villains.offer("Volan De Mort");
        villains.offer("Tanos");
        villains.offer("Fantomas");
        villains.offer("Joker");
        villains.offer("Dr. Evil");
        System.out.println(villains.poll());
        System.out.println("*".repeat(100));
        System.out.println(villains.poll());
    }
}