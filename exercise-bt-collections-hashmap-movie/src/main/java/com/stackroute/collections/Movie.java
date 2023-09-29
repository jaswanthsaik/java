package com.stackroute.collections;

import java.time.LocalDate;
/*
Movie class has four fields- movieId,movieName, genre and releaseDate
This class should be of Comparable type comparing movies based on releaseDate
 */
public class Movie implements Comparable {
private int movieId;
private String movieName;
private String genre;
private LocalDate releaseDate;
   
    
	public Movie(int movieId, String movieName, String genre, LocalDate releaseDate) {
	super();
	this.movieId = movieId;
	this.movieName = movieName;
	this.genre = genre;
	this.releaseDate = releaseDate;
}


	public int getMovieId() {
		return movieId;
	}


	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public LocalDate getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", genre=" + genre + ", releaseDate="
				+ releaseDate + "]";
	}
	
	public int compareTo(Movie movie) {
		return 0;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
