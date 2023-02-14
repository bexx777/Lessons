package lesson_48_Generics.newTopic.model;

public class BoxOfString {
    String value;

    public void print(){
        System.out.println(value);
    }

    public BoxOfString(String value) {
        this.value = value;
    }
}
