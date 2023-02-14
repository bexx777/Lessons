package lesson_59_Varargs.secondHomeTask.controller;
import lesson_59_Varargs.secondHomeTask.model.Panda;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Panda anatoliy = new Panda("Anatoliy",180,36);
        ArrayList<Panda> pandas = new ArrayList<>(List.of(
                anatoliy,
                new Panda("Arkadiy", 200, 36),
                new Panda("Johathan", 200, 36),
                new Panda("Anatoliy", 200, 36),
                new Panda("Kiti", 200, 36),
                new Panda("Arkadiy", 200, 36),
                new Panda("Anatoliy", 200, 36),
                new Panda("Anatoliy", 200, 36)
        ));
        HashMap<Panda,Integer> pandaIntegerHashMap = new HashMap<>();
        for(Panda panda: pandas){
            if(!pandaIntegerHashMap.containsKey(panda)){
                pandaIntegerHashMap.put(panda,1);
            } else {
                int value = pandaIntegerHashMap.get(panda)+1;
                pandaIntegerHashMap.put(panda,value);
            }
        }
        System.out.println(pandaIntegerHashMap);
    }
}
