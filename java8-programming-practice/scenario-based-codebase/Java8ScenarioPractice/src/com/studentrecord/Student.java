package com.studentrecord;

public class Student {
	int id;
	String firstName;
	int age;
	String gender;
	String city;
	int rank;
	String contacts;
	
	
	public Student(int id, String firstName, int age, String gender, String city, int rank, String contacts) {
		this.id = id;
		this.firstName = firstName;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.rank = rank;
		this.contacts = contacts;
	}

	public int getId() {
		return id;
	}


	public String getFirstName() {
		return firstName;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getCity() {
		return city;
	}

	public int getRank() {
		return rank;
	}

	public String getContacts() {
		return contacts;
	}

	@Override
	public String toString() {
		return "id=" + id + ", firstName=" + firstName + ", age=" + age + ", gender=" + gender + ", city="
				+ city + ", rank=" + rank + ", contacts=" + contacts;
	}
	
	
	
}
