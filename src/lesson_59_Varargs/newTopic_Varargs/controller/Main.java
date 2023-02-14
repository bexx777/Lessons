package lesson_59_Varargs.newTopic_Varargs.controller;

public class Main {
    public static void main(String[] args) {
        calculate(1, 2);
        calculate("xx", 2, 3, 4);
        String separ = "*-*";
        System.out.println(unify(separ, "Конь", "Кошка", "Машина"));
    }

    public static int calculate(int a, int b) {
        return a + b;
    }

    public static int calculate(String str, int... var) {
        int accum = 0;
        for (int i = 0; i < var.length; i++) {
            accum += var[i];
        }
        return accum;
    }

    public static String unify(String separator, String... texts) {
        StringBuilder accum = new StringBuilder(" ");
        for (String s : texts) {
            if(!s.equalsIgnoreCase(texts[texts.length-1])) {
                accum.append(s).append(separator);
            }else accum.append(s);
        }
        return accum.toString();
    }
}