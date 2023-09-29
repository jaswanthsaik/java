package com.stackroute.basics;
import java.util.Scanner;

public class SortAscNumber {

    public static void main(String[] args) {
        new SortAscNumber().getNumbers();
    }

    //get the numbers from user through console
    public void getNumbers() {
    	//System.out.println("Enter the number:");
    	Scanner sc = new Scanner(System.in);
    	int firstnum = sc.nextInt();
    	int secondnum = sc.nextInt();
    	int thirdnum = sc.nextInt();
    	int fourthnum = sc.nextInt();
    	System.out.print(numberSorter(firstnum,secondnum,thirdnum,fourthnum));
    }

    //logic to sort the numbers
    public String numberSorter(int firstnum, int secondnum, int thirdnum, int fourthnum) {
    	int temp;
    	 if (firstnum > secondnum){
    	        temp = firstnum;
    	        firstnum = secondnum;
    	        secondnum = temp;
    	    }  
    	    // Swaps firstnum and secondnum
    	    if (secondnum > thirdnum){
    	        temp = secondnum;
    	        secondnum = thirdnum;
    	        thirdnum = temp;
    	    } 
    	    // Swaps secondnum and thirdnum
    	    if (thirdnum > fourthnum){
    	        temp = thirdnum;
    	        thirdnum = fourthnum;
    	        fourthnum = temp;
    	    }
    	    // Swaps thirdnum and fourthnum
    	     if (firstnum > secondnum){
    	        temp = firstnum;
    	        firstnum = secondnum;
    	        secondnum = temp;
    	    } 
    	    // Swaps firstnum and secondnum
    	    if (secondnum > thirdnum){
    	        temp = secondnum;
    	        secondnum = thirdnum;
    	        thirdnum = temp;
    	    } 
    	    // Swaps secondnum and thirdnum
    	    if (firstnum > secondnum){
    	        temp = firstnum;
    	        firstnum = secondnum;
    	        secondnum = temp;
    	    }
    	   if (firstnum > secondnum){
    	        temp = firstnum;
    	        firstnum = secondnum;
    	        secondnum = temp;
    	    }  
    	    // Swaps firstnum and secondnum
    	    if (secondnum > thirdnum){
    	        temp = secondnum;
    	        secondnum = thirdnum;
    	        thirdnum = temp;
    	    } 
    	    // Swaps secondnum and thirdnum
    	    if (thirdnum > fourthnum){
    	        temp = thirdnum;
    	        thirdnum = fourthnum;
    	        fourthnum = temp;
    	    }
    	    // Swaps thirdnum and fourthnum
    	     if (firstnum > secondnum){
    	        temp = firstnum;
    	        firstnum = secondnum;
    	        secondnum = temp;
    	    } 
    	    // Swaps firstnum and secondnum
    	    if (secondnum > thirdnum){
    	        temp = secondnum;
    	        secondnum = thirdnum;
    	        thirdnum = temp;
    	    } 
    	    // Swaps secondnum and thirdnum
    	    if (firstnum > secondnum){
    	        temp = firstnum;
    	        firstnum = secondnum;
    	        secondnum = temp;
    	    }
    	    return "Sorted:{"+firstnum+","+secondnum+","+thirdnum+","+fourthnum+"}";
    	    
}
    
}