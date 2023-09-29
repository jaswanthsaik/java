package com.stackroute.newz.model;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
import com.stackroute.newz.model.News;

/*
 * The class "News" will be acting as the data model for the news Table in the database. Please
 * note that this class is annotated with @Entity annotation. Hibernate will scan all package for 
 * any Java objects annotated with the @Entity annotation. If it finds any, then it will begin the 
 * process of looking through that particular Java object to recreate it as a table in your database.
 */
@Entity
public class News
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int newsId;
	private String title;
	private String author;
	private String description;
	private String content;
	private LocalDateTime publishedAt;
	public News() {	
	}

	

	public News(int newsId, String title, String author, String description, String content,
			LocalDateTime publishedAt) {
		super();
		this.newsId = newsId;
		this.title = title;
		this.author = author;
		this.description = description;
		this.content = content;
		this.publishedAt = publishedAt;
	}



	public int getNewsId() {
		return newsId;
	}



	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getContent() {
		return content;
	}



	public void setContent(String content) {
		this.content = content;
	}



	public LocalDateTime getPublishedAt() {
		return publishedAt;
	}



	public void setPublishedAt() {
		this.publishedAt = publishedAt.now();
	}
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof News)) {
			return false;
		}
		News news = (News)o;
			return getNewsId()==news.getNewsId()&&getTitle().equals(getTitle())&&getAuthor().equals(getAuthor())
				&&getDescription().equals(getDescription())&&getContent().equals(getContent());	
	}



	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", title=" + title + ", author=" + author + ", description=" + description
				+ ", content=" + content + ", publishedAt=" + publishedAt + "]";
	}

	
}
