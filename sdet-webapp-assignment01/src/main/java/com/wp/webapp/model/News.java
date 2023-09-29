package com.wp.webapp.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class News {
	
	private int newsId;
	private String title;
	private String author;
	private String description;
	private String content;
	private String date;
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	public News() {
		
	}
	
	public News(int newsId, String title, String author, String description, String content, LocalDateTime date) {
		super();
		this.newsId = newsId;
		this.title = title;
		this.author = author;
		this.description = description;
		this.content = content;
		this.date = date.format(formatter);
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
	public String getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date.format(formatter);
	}

	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", title=" + title + ", author=" + author + ", description=" + description
				+ ", content=" + content + ", date=" + date + "]";
	}
	
	
}