package com.sunbeam.rest.webservices.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PlacedStudentList implements Serializable 
{
	private static final long serialVersionUID = 1068898677394145280L;
	
	private List<PlacedStudent> placedStudentsList;

	public List<PlacedStudent> getPlacedStudentsList() {
		return placedStudentsList;
	}

	public void setPlacedStudentsList(List<PlacedStudent> placedStudentsList) {
		this.placedStudentsList = placedStudentsList;
	}

	public PlacedStudentList(List<PlacedStudent> placedStudentsList) {
		super();
		this.placedStudentsList = placedStudentsList;
	}
	
	public PlacedStudentList() {
		this(new ArrayList<PlacedStudent>());
	}

	@Override
	public String toString() {
		return "PlacedStudentList [placedStudentsList=" + placedStudentsList
				+ "]";
	}
	
	
}

	
