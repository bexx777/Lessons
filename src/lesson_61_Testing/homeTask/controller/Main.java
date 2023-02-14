package lesson_61_Testing.homeTask.controller;

import lesson_61_Testing.homeTask.model.Hospital;
import lesson_61_Testing.homeTask.model.Patient;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Hospital charite = new Hospital("CHARITÉ",100);
        charite.register(new Patient("Dima","aa", LocalDate.of(2023,12,12)),
                new Patient("Vika","aaaa",LocalDate.of(2023,12,14)),
                new Patient("ira","aaaaaa",LocalDate.of(2023,1,11)),
                new Patient("Kiril","aaaaaaaa",LocalDate.of(2023,2,4)),
                new Patient("Pedro","aaaaaaaaaaa",LocalDate.of(2023,1,1))
                );
        charite.tread();
    }
}
//Госпиталь
//        Создайте класс пациент с полями:
//        Имя String;
//        Анамнез String;
//        Дата поступления LocalDate;
//        Создайте класс Госпиталь, с полями:
//        Название;
//        Вместимость int;
//        PriorityQueue<Patient> пациенты
//        Пусть у госпиталя будет метод register(Patient patient) - этот метод добавляет пациента в госпиталь, если госпиталь не переполнен.
//        Пусть у госпиталя будет метод лечить tread - лечить самого раннего из поступивших пациентов. Метод tread() не должен ничего принимать.
//        Вылеченный пациент исчезает из больницы.
//        При этом в консоль выводится фраза: «<Имя пациента> поздравляем с выздоровлением, берегите себя!»