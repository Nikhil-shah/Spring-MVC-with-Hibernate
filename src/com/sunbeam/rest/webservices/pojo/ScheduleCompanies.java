package com.sunbeam.rest.webservices.pojo;

import java.util.ArrayList;
import java.util.List;

public class ScheduleCompanies 
{
	private List<Companies> companyList;

	public List<Companies> getCompanyList() {
		return companyList;
	}

	public void setCompanyList(List<Companies> companyList) {
		this.companyList = companyList;
	}

	public ScheduleCompanies(List<Companies> companyList) {
		this.companyList = companyList;
	}
	
	public ScheduleCompanies()
	{
		this(new ArrayList<Companies>());
	}
}
