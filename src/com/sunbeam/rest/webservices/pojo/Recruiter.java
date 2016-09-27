package com.sunbeam.rest.webservices.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pastComapnies")
public class Recruiter implements Serializable 
{
	private static final long serialVersionUID = -5007793105553733142L;

	@GeneratedValue
	@Id
	@Column(name="srno")
	private int srno;
	
	@Column(name="name")
	private String name;
	
	@Column(name="website")
	private String website;
	
	@Column(name="shortlistcriteria")
	private String shortlistcriteria;
	
	@Column(name="selectionpro")
	private String selectionpro;
	
	@Column(name="technologies")
	private String technologies;
	
	@Column(name="placeofposting")
	private String placeofposting;
	
	@Column(name="gspackage")
	private String gspackage;
	
	@Column(name="bond")
	private String bond;
	
	@Column(name="course")
	private String course;

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

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getShortlistcriteria() {
		return shortlistcriteria;
	}

	public void setShortlistcriteria(String shortlistcriteria) {
		this.shortlistcriteria = shortlistcriteria;
	}

	public String getSelectionpro() {
		return selectionpro;
	}

	public void setSelectionpro(String selectionpro) {
		this.selectionpro = selectionpro;
	}

	public String getTechnologies() {
		return technologies;
	}

	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}

	public String getPlaceofposting() {
		return placeofposting;
	}

	public void setPlaceofposting(String placeofposting) {
		this.placeofposting = placeofposting;
	}

	public String getGspackage() {
		return gspackage;
	}

	public void setGspackage(String gspackage) {
		this.gspackage = gspackage;
	}

	public String getBond() {
		return bond;
	}

	public void setBond(String bond) {
		this.bond = bond;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Recruiter(int srno, String name, String website,
			String shortlistcriteria, String selectionpro, String technologies,
			String placeofposting, String gspackage, String bond, String course) {
		this.srno = srno;
		this.name = name;
		this.website = website;
		this.shortlistcriteria = shortlistcriteria;
		this.selectionpro = selectionpro;
		this.technologies = technologies;
		this.placeofposting = placeofposting;
		this.gspackage = gspackage;
		this.bond = bond;
		this.course = course;
	}
	
	public Recruiter()
	{
		this(0,"","","","","","","","","");
	}

	@Override
	public String toString() {
		return "Recuiter [srno=" + srno + ", name=" + name + ", website="
				+ website + ", shortlistcriteria=" + shortlistcriteria
				+ ", selectionpro=" + selectionpro + ", technologies="
				+ technologies + ", placeofposting=" + placeofposting
				+ ", gspackage=" + gspackage + ", bond=" + bond + ", course="
				+ course + "]";
	}
	
	
	
}
