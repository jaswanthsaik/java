package com.stackroute.basics;

import java.util.Scanner;

public class PhoneNumberValidator {
    //Create Scanner object as instance variable
    Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        PhoneNumberValidator object = new PhoneNumberValidator();
        String input = object.getInput();
        boolean result = object.validatePhoneNumber(input);
        object.displayResult(result);
    }

    public String getInput() {
    	String inp = scn.nextLine();
    	scn.close();
      return inp;
    }

    public void displayResult(boolean result) {
    	if (result) {
    		System.out.println("Valid");
    	}
    	else {
    		System.out.println("Invalid or empty string");
    	}
       
    }

    public boolean validatePhoneNumber(String str) {
    	if (str==null || str.length() < 12 || str.length()>12) {
    		return false;
    	}
    	else {
    		for (int itr=0; itr< str.length()-1; itr++) {
    			if ((int)str.charAt(itr) < 45 || (int)str.charAt(itr) > 57) {
    				return false;
    			}
    		}
    	}
       return true;
    }
}
