package com.sunbeam.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.sunbeam.pojo.AppliedCompaniesList;
import com.sunbeam.pojo.Companies;
import com.sunbeam.pojo.PlacedStudentList;
import com.sunbeam.pojo.ScheduleCompanies;
import com.sunbeam.pojo.User;

@Controller
public class StudentController
{
	String restfullWebServiceUrl = "http://localhost:9090/CampusPortalRESTWebServices/";
	
	@RequestMapping("/home/{course}")
	public ModelAndView showUserScheduleCompanies(@PathVariable("course")String course,HttpSession session)
	{
		User user = (User) session.getAttribute("login");
		
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"home/{course}"; 
		ScheduleCompanies scheduleCompanies = restTemplate.postForObject(url, user,ScheduleCompanies.class,course);
		
		ModelAndView mav = new ModelAndView("studenthome", "command", scheduleCompanies);
		return mav;
	}
	
	@RequestMapping("/home/all/{course}")
	public ModelAndView showAllScheduleCompanies(@PathVariable("course")String course,HttpSession session)
	{
		User user = (User) session.getAttribute("login");
		
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"home/all/{course}"; 
		ScheduleCompanies scheduleCompanies = restTemplate.postForObject(url, user,ScheduleCompanies.class,course);
		
		ModelAndView mav = new ModelAndView("allstudenthome", "command", scheduleCompanies);
		return mav;
	}
	
	@RequestMapping("/home/applied/{userid}")
	public ModelAndView showAppliedScheduleCompanies(@PathVariable("userid")int userid,HttpSession session)
	{
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"home/applied/{userid}"; 
		AppliedCompaniesList appliedCompaniesList = restTemplate.getForObject(url,AppliedCompaniesList.class,userid);
		
		ModelAndView mav = new ModelAndView("appliedstudenthome", "command", appliedCompaniesList);
		return mav;
	}
	
	@RequestMapping("/home/companydetails/{name}")
	public ModelAndView showDetailsScheduleCompanies(@PathVariable("name")String name,HttpSession session)
	{
		User user = (User) session.getAttribute("login");
		
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"home/companydetails/{name}"; 
		Companies companies = restTemplate.postForObject(url, user,Companies.class,name);
		System.out.println(companies);
		ModelAndView mav = new ModelAndView("detailsofschedulecompany", "command", companies);
		return mav;
	}
	
	@RequestMapping("/placedstudent")
	public ModelAndView showPlacedStudent()
	{
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"placedstudent"; 
		PlacedStudentList placedStudentList = restTemplate.getForObject(url,PlacedStudentList.class);
		
		ModelAndView mav = new ModelAndView("placedstudent", "command", placedStudentList);
		return mav;
	}
	
	@RequestMapping("/viewprofile/{userid}")
	public ModelAndView viewProfile(@PathVariable("userid")int userid)
	{
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"viewprofile/{userid}"; 
		User user = restTemplate.getForObject(url,User.class,userid);
		
		ModelAndView mav = new ModelAndView("viewprofile", "command", user);
		return mav;
	}
	
	@RequestMapping("/adminedit/{userid}")
	public ModelAndView adminEdit(@PathVariable("userid")int userid)
	{
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"viewprofile/{userid}"; 
		User user = restTemplate.getForObject(url,User.class,userid);
		
		ModelAndView mav = new ModelAndView("adminedit", "command", user);
		return mav;
	}
}