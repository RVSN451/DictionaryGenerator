package org.example;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    /*Признаки написания кода в функциональном стиле:
    * 1. Использование чистых функций spaceTrim & dictionary (данные функции детерменированы и не имеют побочных эффектов);
    * 2. Использование лямбда выражений (dictionary), что подтвенрждает детерминированный характер данной функции;
    * 3. Использование МАНАДЫ (dictionary);*/


    public static String[] spaceTrim (String msg) {
        return msg.split("\\s{1,}");
    }

    public static List<String> dictionary (String [] msgArray){
        return Arrays.stream(msgArray)
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main (String[]args) {
            String msg = "ты туземец   пришёл  моя земля я хотеть    тебя    есть";
        System.out.println("Записка туземца: '" + msg + "'.\n");
            System.out.println("Порядок слов в словаре: " + dictionary(spaceTrim(msg)));
        }
}


