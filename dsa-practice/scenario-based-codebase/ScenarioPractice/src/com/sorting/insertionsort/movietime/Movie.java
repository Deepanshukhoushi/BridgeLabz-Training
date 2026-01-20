package com.sorting.insertionsort.movietime;
import java.time.LocalTime;

public class Movie {
	String name;
	LocalTime showTime;
	
	
	public Movie(String name, LocalTime showTime) {
		this.name = name;
		this.showTime = showTime;
	}
	
	public String getName(){
		return name;
	}
	
	public LocalTime getTime() {
		return showTime;
	}
	
}
