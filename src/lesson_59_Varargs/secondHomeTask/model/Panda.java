package lesson_59_Varargs.secondHomeTask.model;

import java.util.Objects;

public class Panda {
    private String name;
    private int weight;
    private int age;

    public Panda(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Panda panda = (Panda) o;
        return weight == panda.weight && age == panda.age && Objects.equals(name, panda.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, age);
    }


    @Override
    public String toString() {
        return " \n" + "Panda " +
                "name " + name +
                ", weight " + weight +
                ", age " + age;
    }

}
