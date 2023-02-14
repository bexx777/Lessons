package lesson_55.refreshRecursion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //printNumbers(100);
        System.out.println(sumOfNumbers(4));
        int[] numbers = new int[]{22, 23, 24, 25, 26, 27};
        printArraty(numbers, 0);
        System.out.println("*".repeat(10));
        //endlessScanner();
        System.out.println("*".repeat(10));
        int x = 6789;
        // System.out.println(x % 10);
        // System.out.println(x / 10 % 10);
        pritDigits(x);
        System.out.println("*".repeat(10));
        System.out.println(sumOfDigits(128));
    }

    public static int sumOfDigits(int number) {
        if (number < 10) {
            return number;
        } else{
       return number%10 +sumOfDigits(number/10);
        }
    }

    public static void pritDigits(int number) {
        if (number < 10) {
            System.out.println(number);
        } else {
            System.out.println(number % 10);
            pritDigits(number / 10);
        }
    }

    public static void endlessScanner() {
        Scanner nextScaner = new Scanner(System.in);
        recScan(nextScaner);


    }

    public static void recScan(Scanner scanner) {
        System.out.println("Есть ли ещё вопросы по рекурсии?");
        String ansver = scanner.nextLine();
        if (ansver.equals("нет")) {
        } else {
            recScan(scanner);
        }
    }

    private static void printArraty(int[] number, int n) {
        if (n > number.length - 1) {

        } else {
            System.out.println(number[n]);
            printArraty(number, ++n);
        }
    }

    public static void printWhile() {
        int n = 0;
        while (n < 10) {
            System.out.println(n);
            n++;
        }
    }

    public static int sumOfNumbers(int start) {

        if (start == 0) {
            return 0;
        } else {
            return start + sumOfNumbers(start - 1);
        }
    }

    public static void printNumbers(int start) {
        if (start == 0) {
            System.out.println(0);
        } else {
            System.out.println(start);
            printNumbers(start - 1);
        }
    }

    public static void recMathod() {
        recMathod();
        System.out.println("Недостежимиы код");
    }
}