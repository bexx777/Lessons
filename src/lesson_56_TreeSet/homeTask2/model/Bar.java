package lesson_56_TreeSet.homeTask2.model;

import java.util.Objects;

public class Bar <T extends Drink & Natural>{
    private String title;
    private String adress;
    private T drinks;

    public Bar(String title, String adress, T drinks) {
        this.title = title;
        this.adress = adress;
        this.drinks = drinks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bar<?> bar = (Bar<?>) o;
        return Objects.equals(title, bar.title) && Objects.equals(adress, bar.adress) && Objects.equals(drinks, bar.drinks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, adress, drinks);
    }

    @Override
    public String toString() {
        return "Bar " +
                "title " + title +
                ", adress " + adress +
                ", drinks " + drinks;
    }
}
