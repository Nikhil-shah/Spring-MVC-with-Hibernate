package com.sunbeam.rest.webservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.rest.webservices.dao.StudentDao;
import com.sunbeam.rest.webservices.pojo.AppliedCompanies;
import com.sunbeam.rest.webservices.pojo.Companies;
import com.sunbeam.rest.webservices.pojo.PlacedStudent;
import com.sunbeam.rest.webservices.pojo.User;

@Service
public class StudentService
{
	@Autowired
	private StudentDao dao;
	
	public List<Companies> getUserScheduleCompanies(String course,float grduationcriteria,float hsccriteria,float ssccriteria)
	{
		try
		{
			return dao.getUserScheduleCompanies(course, grduationcriteria, hsccriteria, ssccriteria);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Companies> getAllScheduleCompanies(String course)
	{
		try
		{
			return dao.getAllScheduleCompanies(course);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public List<AppliedCompanies> getAppliedScheduleCompanies(int userid)
	{
		try
		{
			return dao.getAppliedScheduleCompanies(userid);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public Companies getScheduleCompany(String name)
	{
		try
		{
			return dao.getScheduleCompany(name);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public User getUser(int userid)
	{
		try
		{
			return dao.getUser(userid);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public List<PlacedStudent> getPlacedStudentList() 
	{
		try
		{
			return dao.getPlacedStudentList();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	
	
}


