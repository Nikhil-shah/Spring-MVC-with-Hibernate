package com.sunbeam.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CompanyList implements Serializable 
{
	private static final long serialVersionUID = 3570388473110382476L;
	
	private List<Company> companyList;

	public List<Company> getCompanyList() {
		return companyList;
	}

	public void setCompanyList(List<Company> companyList) {
		this.companyList = companyList;
	}

	public CompanyList(List<Company> companyList) {
		super();
		this.companyList = companyList;
	}

	@Override
	public String toString() {
		return "CompanyList [companyList=" + companyList + "]";
	}
	
	public CompanyList() {
		this(new ArrayList<Company>());
	}
}