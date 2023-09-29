package com.stackroute.newz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.stackroute.newz.dao.NewsDAO;
import com.stackroute.newz.model.News;

/*
 * Annotate the class with @Controller annotation. @Controller annotation is used to mark 
 * any POJO class as a controller so that Spring can recognize this class as a Controller
 */
@Controller
public class NewsController {
	
	/*
	 * From the problem statement, we can understand that the application requires
	 * us to implement the following functionalities.
	 * 
	 * 1. display the list of existing news from the persistence data. Each news element
	 * should contain News Name, News Author, description, content and published date. 
	 * 2. Add a new news which should contain the News Name, News Author, description, content and 
	 * published date. 
	 * 
	 */

	/*
	 * Autowiring should be implemented for the NewsDAO.
	 * Create a News object.
	 * 
	 */
	@Autowired
	private NewsDAO dao;

	public NewsController(NewsDAO dao) {
		super();
		this.dao = dao;
	}
	
	
	/*
	 * Define a handler method to read the existing news from the database and add
	 * it to the ModelMap which is an implementation of Map, used when building
	 * model data for use with views. it should map to the default URL i.e. "/"
	 */
	@RequestMapping("/")
	public String getAllNews(ModelMap modelMap) {
		modelMap.addAttribute("newsList", dao.getAllNews());
		return "index";
	}

	/*
	 * Define a handler method which will read the News Name, News Author, description, 
	 * content from request parameters and save the news in news table in
	 * database. Please note that the publishedAt should always be auto populated with
	 * system time and should not be accepted from the user. Also, after saving the
	 * news, it should show the same along with existing news items. Hence, this handler
	 * method should redirect to the default URL i.e. "/".
	 */
	@PostMapping("/saveNews")
	public String addNews(ModelMap modelMap,@RequestParam("newsId") int newsId,
			@RequestParam("title") String title,
			@RequestParam("author") String author,
			@RequestParam("description") String description,
			@RequestParam("content") String content) {
		News newDetails =  new News();
		newDetails.setNewsId(newsId);
		newDetails.setTitle(title);
		newDetails.setAuthor(author);
		newDetails.setDescription(description);
		newDetails.setContent(content);
		newDetails.setPublishedAt();
		dao.addNews(newDetails);
		modelMap.addAttribute("newsList", dao.getAllNews());
		return "redirect:/";}
		
//		if (newsRepo.exists(newsId)) {
//            return "redirect:/";
//        }
//		newsRepo.addNews(newDetails);
//		
//		for (News news: newsRepo.getNewsList()) {
//			//modelMap.addAttribute(Character.toString((char) ++i), note);
//			System.out.println(news.getNewsId() + " "  + news.getTitle() + " " + news.getAuthor()+ " " + news.getDescription() +" " + news.getContent()
//			+" " + news.getPublishedAt());
//		}
//		model.addAttribute("news", newsRepo.getNews());
//		return "index";
//	}
	
	@RequestMapping("/deleteNews")
	public String deleteNews(ModelMap modelMap, @RequestParam int newsId) {
		dao.deleteNews(newsId);
		modelMap.addAttribute("noteList", dao.getAllNews());
		return "redirect:/";
	}
	@RequestMapping("/update")
	public String updateNews(ModelMap modelMap, @RequestParam int newsId, @RequestParam String title,@RequestParam String author, @RequestParam String description,@RequestParam String content) {
		News newDetails =  new News();
		newDetails.setNewsId(newsId);
		newDetails.setTitle(title);
		newDetails.setAuthor(author);
		newDetails.setDescription(description);
		newDetails.setContent(content);
		newDetails.setPublishedAt();
		dao.UpdateNews(newDetails);
		modelMap.addAttribute("noteList", dao.getAllNews());
		return "redirect:/";
	}
	
	@RequestMapping("/updateNews")
	public String update(ModelMap modelMap,@RequestParam int newsId) {
		modelMap.addAttribute("note", dao.getNewsById(newsId));
		return "update";
		
	}
	
	
	


}
