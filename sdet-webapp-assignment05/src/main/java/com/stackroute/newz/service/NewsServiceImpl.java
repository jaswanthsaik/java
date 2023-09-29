package com.stackroute.newz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.newz.model.News;
import com.stackroute.newz.repository.NewsRepository;
import com.stackroute.newz.service.NewsService;
import com.stackroute.newz.util.exception.NewsAlreadyExistsException;
import com.stackroute.newz.util.exception.NewsNotExistsException;


/*
 * This class is implementing the NewsService interface. This class has to be annotated with 
 * @Service annotation.
 * @Service - is an annotation that annotates classes at the service layer, thus 
 * clarifying it's role.
 * 
 * */
@Service
public class NewsServiceImpl implements NewsService {

	/*
	 * Autowiring should be implemented for the NewsRepository.
	 */
	@Autowired
	NewsRepository newsRepo;
	

	/*
	 * Add a new news. Throw NewsAlreadyExistsException if the news with specified
	 * newsId already exists.
	 */
	@Override
	public News addNews(News news) throws NewsAlreadyExistsException {
		if(newsRepo.existsById(news.getNewsId()))
		{
			throw new NewsAlreadyExistsException();
		}
		
		return newsRepo.save(news);
	}

	/*
	 * Retrieve an existing news by it's newsId. Throw NewsNotExistsException if the 
	 * news with specified newsId does not exist.
	 */
	@Override
	public News getNews(int newsId) throws NewsNotExistsException {
		if(!newsRepo.existsById(newsId))
		{
			throw new NewsNotExistsException();
		}
		
		return newsRepo.findById(newsId).get();
	}

	/*
	 * Retrieve all existing news
	 */
	@Override
	public List<News> getAllNews() {

		return newsRepo.findAll();
	}

	
	/*
	 * Update an existing news by it's newsId. Throw NewsNotExistsException if the 
	 * news with specified newsId does not exist.
	 */
	@Override
	public News updateNews(News news) throws NewsNotExistsException {
		
		if(!newsRepo.existsById(news.getNewsId()))
		{
			throw new NewsNotExistsException();
		}
		
		
		return newsRepo.save(news);
	}

	/*
	 * Delete an existing news by it's newsId. Throw NewsNotExistsException if the 
	 * news with specified newsId does not exist.
	 */
	@Override
	public void deleteNews(int newsId) throws NewsNotExistsException {
		if(!newsRepo.existsById(newsId))
		{
			throw new NewsNotExistsException();
		}
		
		newsRepo.deleteById(newsId);

	}

}
