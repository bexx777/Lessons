package lesson_64_Lambdas.newTopic_Lambdas.controller;

import lesson_64_Lambdas.newTopic_Lambdas.model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Operationable sum = new Operationable() {
            @Override
            public int calculate(int x, int y) {
                return x + y;
            }
        };
        System.out.println(sum.calculate(9, 12));
        System.out.println("*".repeat(100));
        Operationable subtraction = (x, y) -> x - y;
        Operationable subtraction2 = (a, b) -> {
            return a - b;
        };
        int randomNumberFromScop = 9;
        Operationable subtraction3 = (a, b) -> {
            System.out.println(randomNumberFromScop);
            System.out.println("Hey hey");
            return a - b;
        };
        System.out.println(subtraction.calculate(12, 9));
        System.out.println(subtraction.calculate(16, 5));
        subtraction = (a, b) -> a * b;
        System.out.println(subtraction.calculate(2, 2));
        VoidInterfaceble<String> printString = System.out::println;
        VoidInterfaceble<Integer> printInteger = System.out::println;
        printString.print("Privet , I am terminal lambda");
        printInteger.print(777);

        System.out.println("*".repeat(100));
        NoArgInterface losung = () -> System.out.println("Слабаумие и отвага");
        losung.losungInterface();
        System.out.println("*".repeat(100));

        Calculatible calculatibleX = (a) -> {
            if (a % 12 == 0) {
                return true;
            }
            return false;
        };
        System.out.println(calculatibleX.calculate(22));

        Calculatible calculatibleY = (a) -> {
            if (a % 24 == 0) {
                return true;
            }
            return false;
        };
        System.out.println(calculatibleY.calculate(120));

        RowSelectorble textLong = (x, y) -> {
            if (x.length() > y.length()) {
                return x.toUpperCase().replace(',', ' ');
            } else {
                return y.toUpperCase().replace(',', ' ');
            }
        };
//        System.out.println(textLong.isLong("AAA", "BBBBB,"));
//        System.out.println("*".repeat(100));
//        ManyStrinteface manyStrinteface = (strings) -> {
//            ArrayList<String> list = new ArrayList<>(List.of(strings));
//            Collections.sort(List(a, b)->-Integer.compare(a.length(), b.length()));
//        };
//        System.out.println(manyStrinteface.isLongest("aa", "bbv", "cccc"));
//
    }

}