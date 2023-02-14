package lesson_62_Enum.newTopic_Enum.model;

public class Bag {
    private Leather material;
    private double leatherArea;

    public Bag(Leather material, double leatherArea) {
        this.material = material;
        this.leatherArea = leatherArea;
    }
    public double calculatePrice(){
        return material.getPrice() * leatherArea;

    }
}
