package com.stackroute.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class WordMaxVowelsTests {
	private WordMaxVowels wordmaxvowels;
	 private static final String MESSAGE_1 = "Give input in proper format";
	 
	 @BeforeEach
	    public void setUp() {
		 wordmaxvowels = new WordMaxVowels();
	    }

	    @AfterEach
	    public void tearDown() {
	    	wordmaxvowels = null;
	    }
	   
	    @Test
	    public void givenInputBlankThenCheckNull() {
	        int output = -1;
	        String input = "";
	        assertEquals(output,wordmaxvowels.getMaximumVowelsCount(input), MESSAGE_1);
	    }
	    @Test
	    public void givenInput_1() {
	        int expectedOutput = 5;
	        String input = "Education is important";
	        assertEquals(expectedOutput,wordmaxvowels.getMaximumVowelsCount(input));
	    }
	    @Test
	    public void givenInput_2() {
	        int expectedOutput = 4;
	        String input = "India is improving in industries";
	        assertEquals(expectedOutput,wordmaxvowels.getMaximumVowelsCount(input));
	    }
}
