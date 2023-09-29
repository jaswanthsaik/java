package com.stackroute.strings;
public class LongestSubString {

    //write logic to find the longest substring that appears at both ends of a given string and return result
    public StringBuilder findLongestSubString(StringBuilder input) {
    	int length = input.length();
    	StringBuilder sbj = new StringBuilder();
    	StringBuilder revsbj = new StringBuilder();
    	if(length==1) {
    		return input;
    	}
    	for(int pos=0, revpos=length-1; pos<length/2;  revpos--) {
    		sbj.append(input.charAt(pos));
    		revsbj.append(input.charAt(revpos));
    		StringBuilder newsbj=new StringBuilder();
    		newsbj.append(revsbj);
    		newsbj.reverse();
    		if(sbj.toString().equals( newsbj.toString() )){
    			return newsbj;
    		}
    		pos+=1;

   }
    	
    	return new StringBuilder("Longest substring is not present in the given StringBuilder");
    }
}
