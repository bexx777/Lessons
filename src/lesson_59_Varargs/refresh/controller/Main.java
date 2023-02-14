package lesson_59_Varargs.refresh.controller;

import lesson_59_Varargs.refresh.model.Bitable;
import lesson_59_Varargs.refresh.model.Xcucumber;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Xcucumber> numbers = new TreeSet<>();
        numbers.add(new Xcucumber(10, 20, "gherkin"));
        numbers.add(new Xcucumber(20, 30, "pickle"));
        Bitable xcucumber = new Xcucumber(20, 15, "pickle");
        xcucumber.bita();
        // xcucumber.doWhoyDoPickleDo();

        LinkedList<String> names = new LinkedList<>();
        names.addFirst("Boba");
        names.addFirst("Koba");
        names.addFirst("Biba");
        List<String> names1 = new ArrayList<>(names);
        List<String> names2 = Arrays.asList("Boba", "Koba");
        List<String> names3 = List.of("Boba", "Koba", "Biba");
        List<String> names4 = new LinkedList<>(names);
        HashSet<String> names5 = new HashSet<>(Set.of("Boba", "Koba", "Biba"));
        System.out.println(names5);
        HashMap<String, Integer> numberByNames = new HashMap<>(Map.of("Boba", 0, "Koba", 2));
        numberByNames.put("Biba", 0);
        numberByNames.putAll(Map.of("Bill", 0, "Jake", 2));

        numberByNames.values();
        numberByNames.keySet();

       for(Map.Entry<String,Integer> entry: numberByNames.entrySet()){
           System.out.println(entry);
       }
       numberByNames.putIfAbsent("Boba",10); //работает если нет такого ключа
       numberByNames.getOrDefault("Boba",13);
       numberByNames.put("Boba", numberByNames.getOrDefault("Boba",0)+1);
       for (String key: numberByNames.keySet()){
           System.out.println(key + " " + numberByNames.get(key));
       }
    }

}

