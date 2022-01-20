package main;

import java.util.HashMap;
import java.util.stream.Stream;

/*The Kata says you should write a function to convert from normal numbers to Roman Numerals: eg
        I --> 1
        V --> 5
        X --> 10
        L --> 50
        C --> 100
        D --> 500
        M -->1000

   Assign values to HashMap
  Count number of digits in a number

   Get input from user
   Validate user input
   Algorithm
        */
public class RomanNumerals {

    public int userInput;
    public int i;

    HashMap romanNumeralsHashMap = new HashMap(){{
        put(1,'I');
        put(5,'V');
        put(10,'X');
        put(50,'L');
        put(100,'Z');
        put(500,'D');
        put(1000,'M');
    }};

    public String getUserInput(int userInput){
        return "";
    }
    public String convertNumber(int number){
        Stream.of(romanNumeralsHashMap.keySet().toString()).forEach(System.out::println);
        System.out.println(romanNumeralsHashMap.get(number));
        String result = "";
        if(romanNumeralsHashMap.containsKey(number)){
            System.out.println("inside");
            result = romanNumeralsHashMap.get(number).toString();
            System.out.println("result: "+result);
        }
        else{

        }
        return result;
    }
}
