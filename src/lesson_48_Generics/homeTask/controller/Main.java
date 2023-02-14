package lesson_48_Generics.homeTask.controller;

import lesson_48_Generics.homeTask.model.Apple;
import lesson_48_Generics.homeTask.model.Apricot;
import lesson_48_Generics.homeTask.model.Fruit;
import lesson_48_Generics.homeTask.model.Pear;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Apricot apricot = new Apricot(1);
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple(1));
        fruits.add(new Pear(1));
        System.out.println(Fruit.totalCostOfFruits);
//        System.out.println(Apple.getTotalPrice());
//        System.out.println(Pear.getTotalPrice());
        System.out.println(
                Apple.getTotalPrice() + Pear.getTotalPrice()
                        +Apricot.getTotalPrice()
        );
    }


}