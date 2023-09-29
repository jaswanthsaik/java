package com.stackroute.exercises;


public class Fraction {
    //Write logic to calculate the fraction and return as a String
    public String fractionCalculator(int firstNumber, int secondNumber) {
    	try {
    		return Integer.toString(firstNumber/secondNumber);
    	}
    	catch(ArithmeticException e){
    		return "java.lang.ArithmeticException: / by zero";
    	}
    }
}
