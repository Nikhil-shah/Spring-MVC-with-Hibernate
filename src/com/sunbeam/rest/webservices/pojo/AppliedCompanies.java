package com.sunbeam.rest.webservices.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="appliedcompany")
public class AppliedCompanies implements Serializable 
{
	private static final long serialVersionUID = -562743469695507145L;

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="userid")
	private int userid;
	
	@Column(name="name")
	private String name;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "AppliedCompanies [companyid=" + userid + ", name=" + name
				+ "]";
	}

	public AppliedCompanies(int companyid, String name) {
		this.userid = companyid;
		this.name = name;
	}
	
	public AppliedCompanies()
	{
		this(0,"");
	}
	
}
