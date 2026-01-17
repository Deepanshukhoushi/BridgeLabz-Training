package com.sorting.insertionsort.artexpo;
import java.time.LocalTime;
public class Registration {
	String name;
	LocalTime time;
	
	public Registration(String name, LocalTime time) {
	this.name = name;
	this.time = time;
	}
	
	public String getName() {
		return name;
	}
	
	public LocalTime getTime() {
		return time;
	}

	public String toString() {
		return "name: " + name + " || Registration time: " + time; 
	}
}