package org.example;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    /*Признаки написания кода в функциональном стиле:
     * 1. Использование чистых функций spaceTrim & dictionary (данные функции детерменированы и не имеют побочных эффектов);
     * 2. Использование лямбда выражений (dictionary), что подтвенрждает детерминированный характер данной функции;
     * 3. Использование МАНАДЫ (dictionary);*/


    public static List<String> dictionary(String msg) {
        return Arrays.stream(msg.replaceAll(("\\b[,.!?:;/-]"), "").split("\\s{1,}"))
                .map(String::toUpperCase)
                .sorted()
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String msg = "Ты туземец   пришёл  моя земля, я хотеть    кушать. \n" +
                "Читай моя записка, если нет много еды вечером: я точно тебя кушать!";
        System.out.println("Записка туземца: '" + msg + "'.\n");
        System.out.println("Порядок слов в словаре: " + dictionary(msg));
    }
}


