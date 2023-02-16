package lesson_67_WildCards.refresh_WildCards.controller;

import lesson_67_WildCards.refresh_WildCards.model.Animal;
import lesson_67_WildCards.refresh_WildCards.model.Bee;
import lesson_67_WildCards.refresh_WildCards.model.HoneyBadger;
import lesson_67_WildCards.refresh_WildCards.model.Organism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("hey");
        ptint(new Animal());
        ptint(new HoneyBadger());
        ArrayList <Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());
        print(animals);

        ArrayList<HoneyBadger> badgers =new ArrayList<>();
        badgers.add(new HoneyBadger());
        badgers.add(new HoneyBadger());
        print(badgers);

        ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,3,6));
        printNumbers(numbers);

        ArrayList<Bee> bees =new ArrayList<>();
        printOnliAnimals(animals);
        printOnliAnimals(bees);

        ArrayList<Organism> organisms = new ArrayList<>();
        organisms.add(new Organism());
        printOnliAnimals(organisms);
        HoneyBadger[] badgers1 = new HoneyBadger[]{new HoneyBadger(),new HoneyBadger()};
        printArray(badgers1);
    }
    public static void ptint(Animal animal){
        System.out.println(animal);
    }
    public static void print(ArrayList<?> animals){
        System.out.println(animals);
    }
    public static void printNumbers(ArrayList<? extends Number> numbers){
        System.out.println(numbers);
    }
    public static void printOnliAnimals(ArrayList<? super Bee> animalOrBee){
        System.out.println(animalOrBee);
    }
     public static<T extends Number & Comparable> void printCounreble (ArrayList<? extends T> nunbers){
         System.out.println(nunbers);
     }
     public static void printArray(HoneyBadger [] badgers){
         System.out.println(badgers);
     }

}