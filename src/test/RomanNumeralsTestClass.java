package test;

import main.RomanNumerals;

import static org.junit.Assert.assertEquals;

 /*Test Cases
         Test 1 -> 1 should return I*/
public class RomanNumeralsTestClass {

    public void checkBaseNumbers(){
        RomanNumerals romanNumerals = new RomanNumerals();
        assertEquals("I",(String) romanNumerals.convertNumber(1));
        assertEquals("V",(String) romanNumerals.convertNumber(5));
        assertEquals("X",(String) romanNumerals.convertNumber(10));
        assertEquals("L",(String) romanNumerals.convertNumber(50));
        assertEquals("Z",(String) romanNumerals.convertNumber(100));
        assertEquals("D",(String) romanNumerals.convertNumber(500));
        assertEquals("M",(String) romanNumerals.convertNumber(1000));

    }

     public static void main(String[] args) {
        RomanNumeralsTestClass testClassObj = new RomanNumeralsTestClass();
        testClassObj.checkBaseNumbers();
     }
 }
