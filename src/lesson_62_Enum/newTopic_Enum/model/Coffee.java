package lesson_62_Enum.newTopic_Enum.model;

public class Coffee {
    private String title;
    private Size size;
    private String clientName;

    public Coffee(String title, Size size, String clientName) {
        this.title = title;
        this.size = size;
        this.clientName = clientName;
    }
    public double calculatePrice() {
        double price = 0;
        switch (size) {
            case BIG -> price = 4;
            case SMALL -> price = 3;
            case MEDIUM -> price = 3.5;
            case SPECIAL -> price = 5;
        }
        return price;
    }
    @Override
    public String toString() {
        return String.format("Coffee %s for $s cost: %d",title,clientName,calculatePrice());
    }
}
