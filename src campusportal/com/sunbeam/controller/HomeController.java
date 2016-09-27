package com.sunbeam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.sunbeam.pojo.Contact;

@Controller
public class HomeController
{
	String restfullWebServiceUrl = "http://localhost:9090/CampusPortalRESTWebServices/";
	
	@RequestMapping("/showhome")
	public String Home()
	{
		return "home";
	}
	
	@RequestMapping("/showcontact")
	public ModelAndView Contact()
	{
		return new ModelAndView("contact","command",new Contact());
	}
	
	@RequestMapping("/addcontact")
	public ModelAndView addContact(@ModelAttribute("command") Contact contact)
	{
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"addcontact"; 
		restTemplate.postForObject(url, contact,void.class);
		return new ModelAndView("contact","command",new Contact());
	}
	
	@RequestMapping("/showstudent")
	public String Student()
	{
		return "student";
	}
	
	@RequestMapping("/showaboutrecruiters")
	public String aboutRecruiters()
	{
		return "aboutrecruiters";
	}
}