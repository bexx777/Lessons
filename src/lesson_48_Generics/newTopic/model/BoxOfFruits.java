package lesson_48_Generics.newTopic.model;

public class BoxOfFruits <T extends Fruit & Eatable>{
    T value;

    public BoxOfFruits(T value) {
        this.value = value;
    }
    public void print(){
        System.out.println(value);
    }
}
