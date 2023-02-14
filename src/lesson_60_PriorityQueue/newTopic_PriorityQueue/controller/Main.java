package lesson_60_PriorityQueue.newTopic_PriorityQueue.controller;

import lesson_60_PriorityQueue.newTopic_PriorityQueue.model.Cowboy;
import lesson_60_PriorityQueue.newTopic_PriorityQueue.model.Saloon;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> numberPQ = new PriorityQueue<>();
        numberPQ.offer(5);
        numberPQ.offer(7);
        numberPQ.offer(8);
        numberPQ.offer(1);
        numberPQ.offer(2);
        System.out.println(numberPQ.poll() + " --> Выдаёт элемент удаляя его + пустой вернёт null");
        System.out.println(numberPQ);
        System.out.println(numberPQ.peek() + " --> Выдаёт элемент  Не удаляя его + пустой вернёт null");
        System.out.println(numberPQ);
        System.out.println(numberPQ.remove() + " --> Выдаёт элемент удаляя его + пустой вернёт Error");
        System.out.println(numberPQ);
        numberPQ.clear();


        Saloon saloons = new Saloon("Saloon");

        Cowboy dima = new Cowboy("Dima", 22.2);
        Cowboy ira = new Cowboy("Ira", 12.2);
        Cowboy kiril = new Cowboy("Kiril", 18.0);
        saloons.letCowboyIn(dima);
        saloons.serveDrink();
    }


}
