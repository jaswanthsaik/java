package com.stackroute.strings;

import java.util.Arrays;

public class Anagram {
    //write logic to check given two phrases are anagrams or not and return result
    public String checkAnagrams(String phraseOne, String phraseTwo) {
    	boolean status=true;
    	if(phraseOne=="" || phraseTwo=="") {
    		return "Give proper input not empty phrases";
    	}
    	else if(phraseOne.length()!=phraseTwo.length()) {
    		return "Given phrases are not anagrams";
    	}
    	else {
    		char[] a1=phraseOne.toCharArray();
    		char[] a2=phraseTwo.toCharArray();
    		Arrays.sort(a1);
    		Arrays.sort(a2);
    		status=Arrays.equals(a1, a2);
    	
    	if(status) {
    		return "Given phrases are anagrams";
    	}
    	else {
    		return "Given phrases are not anagrams";
    	}
    }
    }
}