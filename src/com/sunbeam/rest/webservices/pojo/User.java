package com.sunbeam.rest.webservices.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="StudentDetails")
public class User implements Serializable 
{
	private static final long serialVersionUID = 8785726708612628896L;

	@GeneratedValue
	@Id
	@Column(name="userid")
	private int userid;
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="lname")
	private String lname;
	
	@Column(name="email")
	private String email;
	
	@Column(name="pass")
	private String pass;
	
	@Column(name="mobileno")
	private String mobileno;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	@Column(name="country")
	private String country="India";
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="birthdate")
	private String birthdate;
	
	@Column(name="graduationstream")
	private String graduationstream;
	
	@Column(name="graduationpercentage")
	private float graduationpercentage;
	
	@Column(name="higherpercentage")
	private float higherpercentage;
	
	@Column(name="seniorpercentage")
	private float seniorpercentage;
	
	@Column(name="nationality")
	private String nationality="Indian";
	
	@Column(name="course")
	private String course;
	
	@Column(name="rollid")
	private int rollid=1;
	
	public int getRollid() {
		return rollid;
	}

	public void setRollid(int rollid) {
		this.rollid = rollid;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getGraduationstream() {
		return graduationstream;
	}

	public void setGraduationstream(String graduationstream) {
		this.graduationstream = graduationstream;
	}

	public float getGraduationpercentage() {
		return graduationpercentage;
	}

	public void setGraduationpercentage(float graduationpercentage) {
		this.graduationpercentage = graduationpercentage;
	}

	public float getHigherpercentage() {
		return higherpercentage;
	}

	public void setHigherpercentage(float higherpercentage) {
		this.higherpercentage = higherpercentage;
	}

	public float getSeniorpercentage() {
		return seniorpercentage;
	}

	public void setSeniorpercentage(float seniorpercentage) {
		this.seniorpercentage = seniorpercentage;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", fname=" + fname + ", lname="
				+ lname + ", email=" + email + ", pass=" + pass + ", mobileno="
				+ mobileno + ", street=" + street + ", city=" + city
				+ ", country=" + country + ", gender=" + gender
				+ ", birthdate=" + birthdate + ", gradstream=" + graduationstream
				+ ", graduationpercentage=" + graduationpercentage
				+ ", higherpercentage=" + higherpercentage
				+ ", seniorpercentage=" + seniorpercentage + ", course=" + course + ", rollid=" + rollid + ", nationality="
				+ nationality + "]";
	}

	public User(int userid, String fname, String lname, String email,
			String pass, String mobileno, String street, String city,
			String country, String gender, String birthdate, String graduationstream,
			float graduationpercentage, float higherpercentage,
			float seniorpercentage, String nationality,String course,int rollid) {
		this.userid = userid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pass = pass;
		this.mobileno = mobileno;
		this.street = street;
		this.city = city;
		this.country = country;
		this.gender = gender;
		this.birthdate = birthdate;
		this.graduationstream = graduationstream;
		this.graduationpercentage = graduationpercentage;
		this.higherpercentage = higherpercentage;
		this.seniorpercentage = seniorpercentage;
		this.nationality = nationality;
		this.course = course;
		this.rollid = rollid;
	}
	
	public User()
	{
		this(0,"","","","","","","","","","","",0.0f,0.0f,0.0f,"","",1);
	}
}
