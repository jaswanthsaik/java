<%@page import="java.util.List"%>
<%@page import="com.wp.webapp.model.News"%>
<%@page import= "java.time.LocalDateTime" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Title here</title>
</head>
<body>
<% List<News> newsList = (List<News>)request.getAttribute("newsList"); %>

<h2>List of News</h2>
<table border="1px">
<tr>
<th>News Id</th>
<th>Title</th>
<th>Author</th>
<th>Description</th>
<th>Content</th>
<th>Published At</th>
</tr>

<%
	for(News news: newsList){
	out.println("<tr>");
	out.println("<td>"+news.getNewsId()+"</td>");
	out.println("<td>"+news.getTitle()+"</td>");
	out.println("<td>"+news.getAuthor()+"</td>");
	out.println("<td>"+news.getDescription()+"</td>");
	out.println("<td>"+news.getContent()+"</td>");
	out.println("<td>"+news.getDate()+"</td>");
	out.println("</tr>");
} 
%>


</table>

</body>
</html>