package com.stackroute.exercises;


import java.io.*;
import java.util.Scanner;

public class FileMigration {

    //Write here logic to read content of first file and write it in second file
    public String fileContentDuplicator(String firstFile, String secondFile) throws IOException {
    	if(firstFile==null || secondFile == null || firstFile.isBlank() || secondFile.isBlank()) {
    		return "Given fileName to read or write is empty, null or blank space";
    	}
    	File obj = new File(firstFile.trim());
    	Scanner scn = new Scanner(obj);
    	String str = scn.nextLine();
    	FileWriter newobj = new FileWriter(secondFile.trim());
    	newobj.write(str);
    	newobj.close();
    	scn.close();
    	return str;
    }
}