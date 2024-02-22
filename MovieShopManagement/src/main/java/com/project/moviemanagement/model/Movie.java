package com.project.moviemanagement.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Movie {

	private String id;
	
	private String movieName;
	
	private String movieGenere;
	
	private double price;
	
	private float imdbRating;
	
	private Date releaseDate;

	public Movie(String id, String movieName, String movieGenere, double price, float imdbRating, Date releaseDate) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.movieGenere = movieGenere;
		this.price = price;
		this.imdbRating = imdbRating;
		this.releaseDate = releaseDate;
	}
	
}
