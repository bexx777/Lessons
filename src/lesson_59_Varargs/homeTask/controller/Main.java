package lesson_59_Varargs.homeTask.controller;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String text = " Иван, Галина, Маша, Сара, Гамина, Маша, Игорь, Миша";
        String[] names = text.split(", ");
        HashMap<String,Integer> nameMap = new HashMap<>();
        for (String name: names){
            if(!nameMap.containsKey(name)){
                nameMap.put(name,1);
            }else {
                Integer counter = nameMap.get(name)+1;
                nameMap.put(name,counter);
            }
        }
        HashMap<String,Integer> nameMap2 = new HashMap<>();
        for (String name: names){
        nameMap2.put(name, nameMap2.getOrDefault(name,0)+1);
        }
    }
}