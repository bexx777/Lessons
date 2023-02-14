package lesson_55.homeTask.model;

import java.util.Objects;

public class Tea extends Drink implements Natural{
    private String title;

    public Tea(double weight, String title) {
        super(weight);
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tea tea = (Tea) o;
        return Objects.equals(title, tea.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), title);
    }
}
