package com.sunbeam.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserList implements Serializable 
{
	private static final long serialVersionUID = 4374437897556029869L;

	private List<User> studentList;

	public List<User> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<User> studentList) {
		this.studentList = studentList;
	}

	public UserList(List<User> studentList) {
		super();
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "UserList [studentList=" + studentList + "]";
	}
	
	public UserList() {
		this(new ArrayList<User>());
	}
}
