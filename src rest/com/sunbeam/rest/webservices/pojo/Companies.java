package com.sunbeam.rest.webservices.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="scheduleCompany")
public class Companies implements Serializable 
{
	private static final long serialVersionUID = 4127878318918947225L;

	@Transient
	private List<Company> companyList;
	
	@Column(name="date")
	private String date;
	
	@Id
	@Column(name="name")
	private String name;
	
	@Column(name="timeofreporting")
	private String timeofreporting;

	@Column(name="grduationcriteria")
	private float grduationcriteria;

	@Column(name="hsccriteria")
	private float hsccriteria;

	@Column(name="ssccriteria")
	private float ssccriteria;

	@Column(name="placeofposting")
	private String placeofposting;

	@Column(name="gspackage")
	private String gspackage;

	@Column(name="bond")
	private String bond;

	@Column(name="course")
	private String course;
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTimeofreporting() {
		return timeofreporting;
	}
	public void setTimeofreporting(String timeofreporting) {
		this.timeofreporting = timeofreporting;
	}
	public float getGrduationcriteria() {
		return grduationcriteria;
	}
	public void setGrduationcriteria(float grduationcriteria) {
		this.grduationcriteria = grduationcriteria;
	}
	public float getHsccriteria() {
		return hsccriteria;
	}
	public void setHsccriteria(float hsccriteria) {
		this.hsccriteria = hsccriteria;
	}
	public float getSsccriteria() {
		return ssccriteria;
	}
	public void setSsccriteria(float ssccriteria) {
		this.ssccriteria = ssccriteria;
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
	public List<Company> getCompanyList()
	{
		return companyList;
	}
	public void setCompanyList(List<Company> companyList) 
	{
		this.companyList = companyList;
	}
	
	public Companies()
	{
		this(new ArrayList<Company>(),"","",0.0f,0.0f,0.0f,"","","","","");
	}
	public Companies(List<Company> companyList, String date,
			String timeofreporting, float grduationcriteria,
			float hsccriteria, float ssccriteria, String placeofposting,
			String gspackage, String bond,String name,String course) {
		this.companyList = companyList;
		this.date = date;
		this.timeofreporting = timeofreporting;
		this.grduationcriteria = grduationcriteria;
		this.hsccriteria = hsccriteria;
		this.ssccriteria = ssccriteria;
		this.placeofposting = placeofposting;
		this.gspackage = gspackage;
		this.bond = bond;
		this.name=name;
		this.course=course;
	}
	@Override
	public String toString() {
		return "Companies [companyList=" + companyList + ", date=" + date
				+ ", timeofreporting=" + timeofreporting
				+ ", grduationcriteria=" + grduationcriteria + ", hsccriteria="
				+ hsccriteria + ", ssccriteria=" + ssccriteria
				+ ", placeofposting=" + placeofposting + ", gspackage="
				+ gspackage + ", bond=" + bond + ", name="+ name +", course="+ course +"]";
	}
}
