package lesson_48_Generics.newTopic.model;

public class BoxOfDoubles {
    double value;
    public void print(){
        System.out.println(value);
    }

    public BoxOfDoubles(double value) {
        this.value = value;
    }
}