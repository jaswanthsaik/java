package com.stackroute.newz.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.stackroute.newz.model.News;


/*
 * This class is implementing the NewsDAO interface. This class has to be annotated with @Repository
 * annotation.
 * @Repository - is an annotation that marks the specific class as a Data Access Object, thus 
 * 				 clarifying it's role.
 * @Transactional - The transactional annotation itself defines the scope of a single database 
 * 					transaction. The database transaction happens inside the scope of a persistence 
 * 					context.  
 * */
@Repository
@Transactional
public class NewsDAOImpl implements NewsDAO {

	/*
	 * Autowiring should be implemented for the SessionFactory.
	 */
	
	@Autowired
	SessionFactory sessionFactory;
	public NewsDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	/*
	 * Save the news in the database(news) table.
	 */
	public boolean addNews(News news) {
		Session session = sessionFactory.getCurrentSession();
		session.save(news);
		session.flush();
		return true;
	}
	//deleting news from database(news) table
	public boolean deleteNews(int newsId) {
		if(getNewsById(newsId)==null) {
			return false;
		}else {
		Session session = sessionFactory.getCurrentSession();
		session.delete(getNewsById(newsId));
		session.flush();
		return true;
		}
	}
	/*
	 * retrieve all existing news sorted by created Date in descending
	 * order(showing latest news first)
	 */
	public List<News> getAllNews() {
		String hqlQuery = "FROM NEWS news ORDER BY news.createdAt DESC";
		Query query = getSessionFactory().getCurrentSession().createQuery(hqlQuery);
		List result = query.getResultList();
		return result;
	}
//retrieving specific news from database(news) table
	public News getNewsById(int newsId) {
		Session session = sessionFactory.getCurrentSession();
		News news =session.get(News.class, newsId);
		session.flush();
		return news;
	}
	
	// Update existing news
	public boolean UpdateNews(News news) {
		if(getNewsById(news.getNewsId())==null) {
			return false;
		}else {
		sessionFactory.getCurrentSession().clear();
		sessionFactory.getCurrentSession().update(news);
		sessionFactory.getCurrentSession().flush();
		return true;
		}

	}
}
