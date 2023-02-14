package lesson_62_Enum.newTopic_Enum.controller;

import lesson_62_Enum.newTopic_Enum.model.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //enum Color{
        //  GREEN, RED,WHITE
        //}

        Color color = Color.RED;
        System.out.println(color);

        int price = 0;
        switch (color) {
            case RED: {
                price = 120;
                break;
            }
            case GREEN: {
                price = 100;
                break;
            }
            case WHITE: {
                price = 110;
                break;
            }
        }
        System.out.println(price);
        if (color == Color.GREEN) {
            System.out.println("Проверка не пройдена");
        }
        System.out.println(color.name());
        System.out.println(Arrays.toString(Color.values()));
        System.out.println(Color.valueOf("RED"));
        Coffee late = new Coffee("late", Size.SMALL,"Dima");
        System.out.println(late.calculatePrice());
        System.out.println(Temperature.HOT.getTemp());
        System.out.println(Temperature.valueOf("HOT"));
        Bag dior = new Bag(Leather.CAW, 2.2);
        System.out.println(dior.calculatePrice());
        System.out.println(Operation.SUM.action(4, 4));

    }
}