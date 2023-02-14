package lesson_62_Enum.newTopic_Enum.model;

public enum Temperature {
    COLD(8),WORM(25),HOT(65);

   int temp;

    Temperature(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }
}
