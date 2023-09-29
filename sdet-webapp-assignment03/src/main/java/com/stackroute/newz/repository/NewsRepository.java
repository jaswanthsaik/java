package com.stackroute.newz.repository;

import java.util.ArrayList;
import java.util.List;
import com.stackroute.newz.model.News;


/*
 * Annotate the class with @Repository annotation. 
 * This class contains the code for data storage interactions and methods 
 * of this class will be used by other parts of the applications such
 * as Controllers and Test Cases
 * */

public class NewsRepository {
	
	/* Declare a variable called "newsList" to store all the news. */
    private List<News> newsList;

    public NewsRepository() {
    	/* Initialize the variable using proper data type */
    	newsList = new ArrayList<News>();
    }

    /* This method should return all the news in the list */
    public List<News> getNewsList() {
        return newsList;
    }

    /* This method should set the list variable with new list of news */
    public void setNewsList(List<News> newsList) {
        this.newsList=newsList;
    }

    /*
	 * This method should News object as argument and add the new news object into
	 * list
	 */
    public  void addNews(News news) {
        newsList.add(news);
    }
  //This method should deleted a specified news from the newsList 
	public boolean deleteNews(int newsId) {
		//Using newsList iterator to find matching news id and remove it from the newsList
		for(News newsIter : newsList)
		{
			if(newsIter.getNewsId()==newsId)
			{
				newsList.remove(newsIter);
				return true;
			}
		}
		return false;


	}
    /* This method should return the list of news */
    public List<News> getNews() {
        return newsList;
    }
    public boolean exists(int newsId) {
		for(News noteIter: newsList)
		{
			if(noteIter.getNewsId()==newsId)
			{
				return true;
			}
		}
		return false;
	}
  
  
}
