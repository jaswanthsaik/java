package com.stackroute.newz.dao;

import java.util.List;

import com.stackroute.newz.model.News;

public interface NewsDAO {
	/* You Should not modify this interface.  You have to implement these methods in corresponding Impl class*/
	public boolean addNews(News news);
	public boolean deleteNews(int newsId);
	public List<News> getAllNews();
	public News getNewsById(int newsId);
	public boolean UpdateNews(News news);

}
