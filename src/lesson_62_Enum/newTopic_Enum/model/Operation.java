package lesson_62_Enum.newTopic_Enum.model;

public enum Operation {
    SUM {
        public double action(double x, double y) {
            return x + y;
        }

    }, SUBTRACTION {
        public double action(double x, double y) {
            return x - y;
        }
    };
public abstract double action (double x, double y);
}
