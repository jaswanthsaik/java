<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head> 
<title>Newz- Step2</title> 
<style>
table {
width: 100%;
}
table, th, td {
	border: 2px solid black;
	border-collapse: separate;
	
}
th, td {
	padding: 5px;
}
th {
	text-align: left;
}
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 5px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=submit] {
  width: 15%;
  background-color: #5675DE;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
input[type=submit]:hover {
  background-color: #45A049;
}
div {
  border-radius: 5px;
  background-color: #F2F2F2;
  padding: 20px;
}
</style>
</head> 
<body><div>
	<h1><center><u>News Application Assignment</u></center></h1>
	 
	<form action='saveNews' method="post">
	 <b> NewsID:<br>
	  <input type="text" name="newsId"><br>
	  Title:<br>
	  <input type="text" name="title"><br>
	  Author:<br>
	  <input type="text" name="author"><br>
	  Description:<br>
	  <input type="text" name="description"><br>
	  Content:<br>
	  <input type="text" name="content"><br>
	  <input type="submit" value="Submit">
	</form> 
	<br></div>
	<h2>News List</h2>
	<table border= "2">
		<thead style="font-weight: bold">
			<tr>
				<th>#ID</th>
				<th>Title</th>
				<th>Author</th>
				<th>Description</th>
				<th>Content</th>
				<th>publishedAt</th>
			</tr>
		</thead>
	<c:forEach items="${newsList}" var="news">
		
		<tr>
				<td>${news.newsId}</td>
				<td>${news.title}</td>
				<td>${news.author}</td>
				<td>${news.description}</td>
				<td>${news.content}</td>
				<td>${news.publishedAt}</td>
		
		
		<td>
		<form action="delete" method="post">
			<input type="hidden" id="newsId" name="newsId" value="${news.newsId}"/>
			<button type="submit">Delete</button>
		</form>
		</td>
		 
		<td>
		<form action="updateNews" method="post">
			<input type="hidden" id="newsId" name="newsId" value="${news.newsId}"/>
			<button type="submit">Update</button>
		</form>
		</td>
		</tr>
		</c:forEach>	
	</table>
	 
</body> 
</html>