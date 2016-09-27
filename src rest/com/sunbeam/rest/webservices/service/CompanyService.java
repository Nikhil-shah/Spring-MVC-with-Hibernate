package com.sunbeam.rest.webservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.rest.webservices.dao.CompanyDao;
import com.sunbeam.rest.webservices.pojo.AppliedCompanies;
import com.sunbeam.rest.webservices.pojo.Companies;
import com.sunbeam.rest.webservices.pojo.Company;
import com.sunbeam.rest.webservices.pojo.Recruiter;
import com.sunbeam.rest.webservices.pojo.User;

@Service
public class CompanyService
{
	@Autowired
	private CompanyDao dao;
	
	public User getUser(int userId)
	{
		User user = null;
		try
		{
			user = dao.getUser(userId);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return user;
	}
	
	public List<Company> getCopmanies()
	{
		try
		{
			return dao.getCompanies();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Companies> getScheduleCompanies()
	{
		try
		{
			return dao.getScheduleCompanies();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public List<User> getUserList()
	{
		try
		{
			return dao.getUserList();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public List<User> getAdminUserList()
	{
		try
		{
			return dao.getAdminUserList();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public Companies getScheduleCompanies(String name)
	{
		try
		{
			return dao.getScheduleCompanies(name);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public Company getCompany(String name)
	{
		try
		{
			return dao.getCompany(name);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Recruiter> getPastRecruiters()
	{
		try
		{
			return dao.getPastRecruiters();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Company> getCompanyList()
	{
		try
		{
			return dao.getCompnayList();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public void insertApplyCompany(AppliedCompanies company)
	{
		try
		{
			dao.insertApplyCompany(company);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void insertScheduleCompany(Companies company)
	{
		try
		{
			dao.insertScheduleCompany(company);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void insertCompany(Company company)
	{
		try
		{
			dao.insertCompany(company);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void removeCompany(String name)
	{
		try
		{
			dao.removeCompany(name);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void removeScheduleCompany(String name)
	{
		try
		{
			dao.removeScheduleCompany(name);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public Company updateCompany(Company company)
	{
		try
		{
			return dao.updateCompany(company);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public Companies updateScheduleCompany(Companies company)
	{
		try
		{
			return dao.updateScheduleCompany(company);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}


