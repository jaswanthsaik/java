package com.wp.webapp.repository;

import java.util.ArrayList;
import java.util.List;

import com.wp.webapp.model.News;

public class NewsRepository {

	private List<News> newsList;
	
	public NewsRepository(){
		newsList = new ArrayList<News>();
	}
	
	public News addNews(News news) {
		newsList.add(news);
		return news;
	}
	
	
	public List<News> getAllNews(){
		return newsList;
	}
	
	
}
