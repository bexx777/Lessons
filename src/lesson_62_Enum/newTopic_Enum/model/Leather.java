package lesson_62_Enum.newTopic_Enum.model;

public enum Leather {
    CAW(50),CROCODILE(1000),SHEEP(70),FISH(500);
    double price;

    Leather(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
