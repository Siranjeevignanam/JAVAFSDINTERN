package com.test.entity;



import java.util.Arrays;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="journey")
//@NamedNativeQuery(name="journey.fname", query="select u from User u where u.fname=?1",nativeQuery=true)
public class User {

	@NotNull(message="id needed")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NotEmpty(message="namerequired")
	@Size(min=3,max=25)
	private String fname;
	
	private String lname;
	
	@Email(message="email required")
	private String email;
	
	
	@NotEmpty(message="gender required")
	private String gender;
	
	 private String[] food;
	 
	 @NotEmpty(message="City is needed")
	private String fromCity;
	 
	 @NotEmpty(message="City is needed")
		private String toCity;
	 
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@NotEmpty
	private String jDate;
	
	@NotEmpty
	private String[] seat;
	
	
	 public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public User()
	{
		
	}
	
	
	public User(
			@NotEmpty(message = "namerequired") @Size(min = 3, max = 25) String fname, String lname,
			@Email(message = "email required") String email, @NotEmpty(message = "gender required") String gender,
			String[] food, @NotEmpty(message = "City is needed") String fromCity,
			@NotEmpty(message = "City is needed") String toCity, @NotEmpty String jDate, @NotEmpty String[] seat) {
		super();
	
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.gender = gender;
		this.food = food;
		this.fromCity = fromCity;
		this.toCity = toCity;
		this.jDate = jDate;
		this.seat = seat;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getFood() {
		return food;
	}

	public void setFood(String[] food) {
		this.food = food;
	}

	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	public String getjDate() {
		return jDate;
	}

	public void setjDate(String jDate) {
		this.jDate = jDate;
	}

	public String[] getSeat() {
		return seat;
	}

	public void setSeat(String[] seat) {
		this.seat = seat;
	}

	public boolean validate(String u1,String p1)
	{
		if(u1.equals(toCity))
		{
			return true;
		}
		
		else
			return false;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", gender=" + gender
				+ ", food=" + Arrays.toString(food) + ", fromCity=" + fromCity + ", toCity=" + toCity + ", jDate="
				+ jDate + ", seat=" + Arrays.toString(seat) + "]";
	}
	
	
	
	
}
