package lesson_58_TreeMap.refresh.model;

public abstract class Film {
    private String title;
    private int year;

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Film(String title, int year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Film " +
                "title " + title +
                "year " + year + "\n";
    }
}
