package com.stackroute.collections;

import java.util.*;

/*
 * This class contains methods for adding Fruits to a List and searching the fruits from the List
 */
public class FruitsListService {

    public static List<String> addFruitsToList(String fruitNames) {
    	if (fruitNames==null || fruitNames=="") {
    		return Collections.emptyList();
    	}
    	String []arr = fruitNames.split(",");
    	List<String> set = new ArrayList<String>();    		
   // 	
        for (String s: arr) {
        	set.add(s);
        }
    	
        return set;
    }

    public static int searchFruitInList(List<String> fruitList, String searchFruit) {
    	
    	if (fruitList.contains(searchFruit)) {
    		return fruitList.indexOf(searchFruit);
    	}
        return -1;
    }

    public static int searchFruitInListIgnoreCase(List<String> fruitList, String searchFruit) {
    	for (String s : fruitList) {
            if (searchFruit.equalsIgnoreCase(s)) {
                return fruitList.indexOf(s);
            }
        }
        return -1;
        
    }
}