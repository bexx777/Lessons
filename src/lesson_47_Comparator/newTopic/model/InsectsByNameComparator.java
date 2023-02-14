package lesson_47_Comparator.newTopic.model;

import java.util.Comparator;

public class InsectsByNameComparator implements Comparator<Insect> {
    @Override
    public int compare(Insect o1, Insect o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
