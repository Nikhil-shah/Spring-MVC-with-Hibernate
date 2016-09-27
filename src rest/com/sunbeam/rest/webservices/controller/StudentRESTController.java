package com.sunbeam.rest.webservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunbeam.rest.webservices.pojo.AppliedCompanies;
import com.sunbeam.rest.webservices.pojo.AppliedCompaniesList;
import com.sunbeam.rest.webservices.pojo.Companies;
import com.sunbeam.rest.webservices.pojo.PlacedStudent;
import com.sunbeam.rest.webservices.pojo.PlacedStudentList;
import com.sunbeam.rest.webservices.pojo.ScheduleCompanies;
import com.sunbeam.rest.webservices.pojo.User;
import com.sunbeam.rest.webservices.service.StudentService;

@Controller
public class StudentRESTController
{
	@Autowired
	private StudentService service;
	
	@RequestMapping(value="/home/{course}", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ScheduleCompanies showUserScheduleCompanies(@PathVariable("course")String course,@RequestBody User user)
	{
		List<Companies> companiesList = service.getUserScheduleCompanies(course,user.getGraduationpercentage(),user.getHigherpercentage(),user.getSeniorpercentage());
		
		ScheduleCompanies scheduleCompanies = new ScheduleCompanies(companiesList);
		return scheduleCompanies;
	}
	
	@RequestMapping(value="/home/all/{course}", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ScheduleCompanies showAllScheduleCompanies(@PathVariable("course")String course,@RequestBody User user)
	{
		List<Companies> companiesList = service.getAllScheduleCompanies(course);
		
		ScheduleCompanies scheduleCompanies = new ScheduleCompanies(companiesList);
		return scheduleCompanies;
	}
	
	@RequestMapping(value="/home/applied/{userid}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody AppliedCompaniesList showAppliedScheduleCompanies(@PathVariable("userid")int userid)
	{
		List<AppliedCompanies> appliedCompanies = service.getAppliedScheduleCompanies(userid);
		
		AppliedCompaniesList appliedCompaniesList = new AppliedCompaniesList(appliedCompanies);
		return appliedCompaniesList;
	}
	
	@RequestMapping(value="/placedstudent", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody PlacedStudentList showPlacedStudent()
	{
		List<PlacedStudent> placedStudent = service.getPlacedStudentList();
		
		PlacedStudentList studentList = new PlacedStudentList(placedStudent);
		return studentList;
	}
	
	@RequestMapping(value="/home/companydetails/{name}", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Companies showDetailsScheduleCompanies(@PathVariable("name")String name,@RequestBody User user)
	{
		Companies companiesList = service.getScheduleCompany(name);
		return companiesList;
	}
	
	@RequestMapping(value="/viewprofile/{userid}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody User getUserByUserId(@PathVariable("userid")int userid)
	{
		User user = service.getUser(userid);
		return user;
	}
}


