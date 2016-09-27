package com.sunbeam.rest.webservices.pojo;

import java.util.ArrayList;
import java.util.List;

public class Recruiters
{
	private List<Recruiter> recruiterList;

	public List<Recruiter> getRecruiterList() {
		return recruiterList;
	}

	public void setRecruiterList(List<Recruiter> recruiterList) {
		this.recruiterList = recruiterList;
	}

	public Recruiters(List<Recruiter> recruiterList) {
		this.recruiterList = recruiterList;
	}
	
	public Recruiters() {
		this.setRecruiterList(new ArrayList<Recruiter>());
	}

}
