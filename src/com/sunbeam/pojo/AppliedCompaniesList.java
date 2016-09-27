package com.sunbeam.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AppliedCompaniesList implements Serializable 
{
	private static final long serialVersionUID = 1333411410858852911L;
	
	List<AppliedCompanies> appliedCompanies;

	public List<AppliedCompanies> getAppliedCompanies() 
	{
		return appliedCompanies;
	}

	public void setAppliedCompanies(List<AppliedCompanies> appliedCompanies) 
	{
		this.appliedCompanies = appliedCompanies;
	}

	public AppliedCompaniesList(List<AppliedCompanies> appliedCompanies) {
		this.appliedCompanies = appliedCompanies;
	}

	@Override
	public String toString() {
		return "AppliedCompaniesList [appliedCompanies=" + appliedCompanies
				+ "]";
	}
	
	public AppliedCompaniesList()
	{
		this(new ArrayList<AppliedCompanies>());
	}
	
}
