package com.stackroute.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateLines {
    //write logic to read data from input.txt and  write result to output.txt
    public void removeDuplicateLines() throws IOException {
    	
    	 BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
    	    Set<String> lines = new HashSet<String>(); 
    	    String line;
    	    while ((line = reader.readLine()) != null) {
    	        lines.add(line);
    	    }
    	    reader.close();
    	    BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
    	    for (String unique : lines) {
    	        writer.write(unique);
    	        writer.newLine();
    	    }
    	    writer.close();
    	
    }
}