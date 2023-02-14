package lesson_61_Testing.homeTask.model;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Hospital {
  private String title;
  private int capacity;
  private static int numberOfPatient;
  private PriorityQueue<Patient> patients = new PriorityQueue<>();

  public Hospital(String title, int capacity) {
    this.title = title;
    this.capacity = capacity;
  }

  public void register(Patient ... patient) {
    if (patient.length < capacity) {
      patients.addAll(Arrays.asList(patient));
    }
  }

  public void tread(){
    System.out.println(patients.poll() + " Поздравляем с выздоровлением, берегите себя!");
    if (!patients.isEmpty()){
      tread();
    }
  }
}
