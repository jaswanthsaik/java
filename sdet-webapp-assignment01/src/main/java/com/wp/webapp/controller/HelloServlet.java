package com.wp.webapp.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.wp.webapp.model.News;
import com.wp.webapp.repository.NewsRepository;




@WebServlet({"/hello","/hi"})
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	NewsRepository newsRepo=new NewsRepository();
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int news_id = Integer.parseInt(request.getParameter("news_id"));
		String title= request.getParameter("title");
		String author = request.getParameter("author");
		String description = request.getParameter("description");
		String content= request.getParameter("content");
		
		News news = new News(news_id,title,author,description,content,LocalDateTime.now());
		newsRepo.addNews(news);
		List<News> newsList=newsRepo.getAllNews();
		
		request.setAttribute("newsList", newsList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("showall.jsp");
		
		dispatcher.forward(request, response);

	}

}
