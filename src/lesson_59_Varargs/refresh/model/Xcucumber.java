package lesson_59_Varargs.refresh.model;

public class Xcucumber implements Comparable<Xcucumber>,Bitable {
    int lumbsNumber;
    int seedsNumber;
    String sort;

    public Xcucumber(int lumbsNumber, int seedsNumber, String sort) {
        this.lumbsNumber = lumbsNumber;
        this.seedsNumber = seedsNumber;
        this.sort = sort;
    }

    @Override
    public int compareTo(Xcucumber o) {
        return Integer.compare(lumbsNumber, o.lumbsNumber);
    }

    @Override
    public void bita() {
        System.out.println("Няи няи ");
    }
    public void doWhoyDoPickleDo(){
        System.out.println("Виду себя как обычный огурец");
    }
}
