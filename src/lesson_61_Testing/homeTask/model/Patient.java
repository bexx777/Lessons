package lesson_61_Testing.homeTask.model;

import java.time.LocalDate;

public class Patient implements Comparable<Patient> {
    private String name;
    private String anamnesis;
    private LocalDate receiptDate;

    public Patient(String name, String anamnesis, LocalDate receiptDate) {
        this.name = name;
        this.anamnesis = anamnesis;
        this.receiptDate = receiptDate;
    }

    @Override
    public int compareTo(Patient o) {
        return -Integer.compare(this.anamnesis.length(), o.anamnesis.length());
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return String.format("Name : %s ",name);
    }
}
