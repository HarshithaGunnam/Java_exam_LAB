package com.klef.jfsd.exam;

import javax.persistence.*;

@Entity
@Table(name="client_details")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int Id;
	String Name;
	int Age;
	String Email;
	String Mobile_number;
	String Gender;
	String Location;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMobile_number() {
		return Mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		Mobile_number = mobile_number;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getLocation() {
		return Location;
	}
	public void setLcation(String lcation) {
		Location = lcation;
	}
	public Client(int id, String name, int age, String email, String mobile_number, String gender, String location) {
		super();
		Id = id;
		Name = name;
		Age = age;
		Email = email;
		Mobile_number = mobile_number;
		Gender = gender;
		Location = location;
	}
	
	

}
