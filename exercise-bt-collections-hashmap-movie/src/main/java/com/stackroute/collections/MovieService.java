package com.stackroute.collections;

import java.time.LocalDate;
import java.util.*;

/*
This class contains a property called movieMap of type Map
This class contains methods for adding key-value pairs of Movie and its rating to HashMap and
various methods for accessing the keys and values based on some conditions
 */
public class MovieService {
private Map movieMap;
    /**
     * Constructor to create movieMap as an empty  LinkedHashMap object
     */
public MovieService() {
	movieMap = new LinkedHashMap();
}
    /*
    Returns the movieMap object
     */
    public Map<Movie, Integer> getMovieMap() {
        return movieMap;
    }

	/*
    Add key-value pairs of Movie-Integer type and returns Set of Map.Entry
     */
    public Set<Map.Entry<Movie, Integer>> addKeyValuePairsToMap(Movie movie, Integer rating) {
    	movieMap.put(movie, rating);
        return movieMap.entrySet();
    }

    /*
    Return Set of movie names having rating greater than or equal to given rating
     */
    public List<String> getHigherRatedMovieNames(int rating) {

    	Iterator<Map.Entry<Movie, Integer>> itr = movieMap.entrySet().iterator();
        List <String> movienames= new ArrayList();
        while(itr.hasNext())
        {
             Map.Entry<Movie, Integer> entry = itr.next();
            if (entry.getValue() >= rating) {
            	movienames.add(entry.getKey().getMovieName());
            }
             
        }
    	return movienames;
    }

    /*
    Return Set of movie names belonging to specific genre
     */
    public List<String> getMovieNamesOfSpecificGenre(String genre) {
    	Iterator<Map.Entry<Movie, Integer>> itr = movieMap.entrySet().iterator();
        List <String> movienames= new ArrayList();
        while(itr.hasNext())
        {
             Map.Entry<Movie, Integer> entry = itr.next();
            if (entry.getKey().getGenre().equals(genre)) {
            	movienames.add(entry.getKey().getMovieName());
            }
             
        }
    	return movienames;
    }

   /*
   Return Set of movie names which are released after Specific releaseDate and having rating less than or equal to 3
    */

    public List<String> getMovieNamesReleasedAfterSpecificDateAndRatingLesserThanThree(LocalDate releaseDate) {
    	Iterator<Map.Entry<Movie, Integer>> itr = movieMap.entrySet().iterator();
        List <String> movienames= new ArrayList();
        while(itr.hasNext())
        {
             Map.Entry<Movie, Integer> entry = itr.next();
            if (entry.getValue() <=3 && entry.getKey().getReleaseDate().isAfter(releaseDate)) {
            	movienames.add(entry.getKey().getMovieName());
            }
             
        }
    	return movienames;
    }

    /*
    Return set of movies sorted by release dates in ascending order.
    Hint: Use TreeMap
     */
    public List<Movie> getSortedMovieListByReleaseDate() {
    	TreeMap<LocalDate, Movie> tree_map = new TreeMap<LocalDate, Movie>();
    	Iterator<Map.Entry<Movie, Integer>> itr = movieMap.entrySet().iterator();
    	while(itr.hasNext()) {
    		 Map.Entry<Movie, Integer> entry = itr.next();
    		tree_map.put(entry.getKey().getReleaseDate(), entry.getKey());
    	}
    	List<Movie> moviesorted = new ArrayList();
    	//Store movie names here 
    	for (Map.Entry<LocalDate, Movie> entry : tree_map.entrySet()) {
    		moviesorted.add(entry.getValue());
    	}
        return moviesorted;
    }
    /*
   Return set of movies sorted by rating.
   Hint: Use Comparator and LinkedHashMap
    */
    public Map<Movie, Integer> getSortedMovieListByRating() {
    	List<Map.Entry<Movie, Integer> > list = new ArrayList<Map.Entry<Movie, Integer> >(movieMap.entrySet());
    	Collections.sort(
                list,
                new Comparator<Map.Entry<Movie, Integer> >() {
                    // Comparing two entries by value
                    public int compare( Map.Entry<Movie, Integer> entry1,Map.Entry<Movie, Integer> entry2)
                    {
                    	if(entry1.getValue()==entry2.getValue()) {
                    		return 0;
                    	}
                    	else if (entry1.getValue()>entry2.getValue()) {
                    		return 1;
                    	}else {
                    		return -1;
                    	}
                        //return entry1.getValue() - entry2.getValue();
                    }
                });
        return movieMap;
    }
    
	
	
}
