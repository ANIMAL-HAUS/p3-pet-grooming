package com.revature.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name = "user")
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	@Column(nullable = false, unique=true)
	private String userName;
	@Column(nullable = false)
	private String password;
	private String email;
	private String city;
	private UserRole role;
<<<<<<< HEAD
<<<<<<< HEAD
	
=======
>>>>>>> dce3253d2578a517811f43e980c9748a8263b5ec
=======
	private String aboutMe;
	private TimeofDay time;
	private Days day;
	
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public TimeofDay getTime() {
		return time;
	}
	public void setTime(TimeofDay time) {
		this.time = time;
	}
	public Days getDay() {
		return day;
	}
	public void setDay(Days day) {
		this.day = day;
	}
	public Users(String firstName, String lastName, String userName, String password, String email, String city,
			UserRole role, String aboutMe, TimeofDay time, Days day) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.city = city;
		this.role = role;
		this.aboutMe = aboutMe;
		this.time = time;
		this.day = day;
	}
	public Users(String firstName, String lastName, String userName, String password, String email, String address,
			UserRole role, String aboutMe) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.city = address;
		this.role = role;
		this.aboutMe = aboutMe;
	}
	public String getAboutMe() {
		return aboutMe;
	}
	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
	public Users(int id, String firstName, String lastName, String userName, String password, String email,
			String address, UserRole role, String aboutMe) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.city = address;
		this.role = role;
		this.aboutMe = aboutMe;
	}
>>>>>>> 86a70d04d3f258dc0f797b1075452118d418c6c6
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return city;
	}
	public void setAddress(String address) {
		this.city = address;
	}
<<<<<<< HEAD
	public String getaboutMe() {
		return aboutMe;
	}
	public void setaboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
=======
>>>>>>> dce3253d2578a517811f43e980c9748a8263b5ec
	public UserRole getRole() {
		return role;
	}
	public void setRole(UserRole role) {
		this.role = role;
	}
<<<<<<< HEAD
	
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(String firstName, String lastName, String userName, String password, String email, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.address = address;
=======
	@Override
	public int hashCode() {
		return Objects.hash(aboutMe, city, day, email, firstName, id, lastName, password, role, time, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(aboutMe, other.aboutMe) && Objects.equals(city, other.city) && day == other.day
				&& Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName) && id == other.id
				&& Objects.equals(lastName, other.lastName) && Objects.equals(password, other.password)
				&& role == other.role && time == other.time && Objects.equals(userName, other.userName);
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
<<<<<<< HEAD
				+ ", password=" + password + ", email=" + email + ", address=" + address + ", role=" + role + "]";
>>>>>>> dce3253d2578a517811f43e980c9748a8263b5ec
=======
				+ ", password=" + password + ", email=" + email + ", city=" + city + ", role=" + role + ", aboutMe="
				+ aboutMe + ", time=" + time + ", day=" + day + "]";
>>>>>>> 86a70d04d3f258dc0f797b1075452118d418c6c6
	}
	public Users(int id, String firstName, String lastName, String userName, String password, String email,
			String address, UserRole role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.city = address;
		this.role = role;
	}
	public Users(String firstName, String lastName, String userName, String password, String email, String address,
			String aboutMe, UserRole role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
<<<<<<< HEAD
		this.address = address;
		this.aboutMe = aboutMe;
		this.role = role;
=======
		this.city = address;
>>>>>>> 86a70d04d3f258dc0f797b1075452118d418c6c6
	}
	public Users(int id, String firstName, String lastName, String userName, String password, String email,
			String address, String aboutMe, UserRole role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.address = address;
		this.aboutMe = aboutMe;
		this.role = role;
	}
	
	
	
	
}
