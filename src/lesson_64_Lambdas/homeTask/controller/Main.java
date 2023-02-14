package lesson_64_Lambdas.homeTask.controller;

import lesson_64_Lambdas.homeTask.model.Car;
import lesson_64_Lambdas.homeTask.model.Fuel;

public class Main {
    public static void main(String[] args) {

        Car opel = new Car("Vectra c",56.5, Fuel.DIESEL);
        System.out.println(opel);
        System.out.println(opel.costOfFullTank());
//        Домашнее задание
//        Создайте enum Fuel
//        С полем double price.
//        Пусть будет несколько типов топлива:
//        Бензин 95 по цене 1,57 за литр
//        Бензин 98 по цене 1.76 за литр
//        Дизель по цене 1,74 за литр
//        Создайте класс автомобиль с полями:
//        Название;
//        Объем бака в литрах;
//        Fuel fuel Тип топлива.
//        Пусть у автомобиля будет метод - рассчитать стоимость полного бака, он должен расчитывать сколько стоит заправить полный бак.
    }
}