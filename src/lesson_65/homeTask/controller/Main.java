package lesson_65.homeTask.controller;

import lesson_65.homeTask.model.IntStringProcessor;
import lesson_65.homeTask.model.StringProcessor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IntStringProcessor lambda = (string, num) -> string.repeat(num);
        String result = multiplySrting("java is easy", 10, lambda);
        System.out.println(result);

        StringProcessor stringProcessor =(symbol,words)->{
          ArrayList<String> wordList = new ArrayList<>(List.of(words));
            Collections.sort(wordList,(a,b)->{
                if (a.startsWith(symbol)&&!b.startsWith(symbol)) {
                    return 1;
                } else if (!a.startsWith(symbol)&&b.startsWith(symbol)) {
                    return -1;
                } else if (a.startsWith(symbol)&& b.startsWith(symbol)) {
                    return Integer.compare(a.length(),b.length());
                } else  {
                    return 0;
                }
            });
          //  return wordList.get(wordList.size()-1);
        };
        stringProcessor.processor("b","bob","lob","Jhon","Bobby");
    }
    public static String multiplySrting(String str, int number, IntStringProcessor lambda) {
        return lambda.process(str, number);
    }


}