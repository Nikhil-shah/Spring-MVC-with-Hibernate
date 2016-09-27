package com.sunbeam.rest.webservices.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company")
public class Company implements Serializable 
{
	private static final long serialVersionUID = -2077890973229301040L;

	@GeneratedValue
	@Id
	@Column(name="companyid")
	private int companyid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="contactperson")
	private String contactperson;
	
	@Column(name="email")
	private String email;
	
	@Column(name="contactphonenumber")
	private String contactphonenumber;
	
	@Column(name="mobileno")
	private String mobileno;
	
	@Column(name="postaladdress")
	private String postaladdress;
	
	
	public Company(int companyid, String name, String contactperson,
			String email, String contactphonenumber, String mobileno,
			String postaladdress) {
		this.companyid = companyid;
		this.name = name;
		this.contactperson = contactperson;
		this.email = email;
		this.contactphonenumber = contactphonenumber;
		this.mobileno = mobileno;
		this.postaladdress = postaladdress;
	}


	public int getCompanyid() {
		return companyid;
	}

	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactperson() {
		return contactperson;
	}

	public void setContactperson(String contactperson) {
		this.contactperson = contactperson;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactphonenumber() {
		return contactphonenumber;
	}

	public void setContactphonenumber(String contactphonenumber) {
		this.contactphonenumber = contactphonenumber;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getPostaladdress() {
		return postaladdress;
	}

	public void setPostaladdress(String postaladdress) {
		this.postaladdress = postaladdress;
	}

	public Company()
	{
		this(0,"","","","","","");
	}
}
