package com.sunbeam.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class Contact implements Serializable 
{
	private static final long serialVersionUID = -2009330382082869664L;

	@Id
	@GeneratedValue
	@Column(name="contactid")
	private int contactid;
	
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="mobno")
	private String mobno;
	
	@Column(name="message")
	private String message;

	public int getContactid() {
		return contactid;
	}

	public void setContactid(int contactid) {
		this.contactid = contactid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Contact(int contactid, String name, String email, String mobno,
			String message) {
		super();
		this.contactid = contactid;
		this.name = name;
		this.email = email;
		this.mobno = mobno;
		this.message = message;
	}
	
	public Contact() {
		this(0,"","","","");
	}

}
