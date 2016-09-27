package com.sunbeam.rest.webservices.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="placedstudentlist")
public class PlacedStudent implements Serializable 
{
	private static final long serialVersionUID = 2630642069351363868L;

	@GeneratedValue
	@Id
	@Column(name="srno")
	private int srno;
	
	@Column(name="name")
	private String name;
	
	@Column(name="companyname")
	private String companyname;
	
	@Column(name="gspackage")
	private String gspackage;

	public int getSrno() {
		return srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getGspackage() {
		return gspackage;
	}

	public void setGspackage(String gspackage) {
		this.gspackage = gspackage;
	}

	@Override
	public String toString() {
		return "PlacedStudent [srno=" + srno + ", name=" + name
				+ ", companyname=" + companyname + ", gspackage=" + gspackage
				+ "]";
	}

	public PlacedStudent(int srno, String name, String companyname,
			String gspackage) {
		super();
		this.srno = srno;
		this.name = name;
		this.companyname = companyname;
		this.gspackage = gspackage;
	}
	
	public PlacedStudent() {
		this(0,"","","");
	}
	
}

	
