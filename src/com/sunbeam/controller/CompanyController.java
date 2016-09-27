package com.sunbeam.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.sunbeam.pojo.Companies;
import com.sunbeam.pojo.Company;
import com.sunbeam.pojo.CompanyList;
import com.sunbeam.pojo.Recruiters;
import com.sunbeam.pojo.ScheduleCompanies;
import com.sunbeam.pojo.User;
import com.sunbeam.pojo.UserList;
@Controller
public class CompanyController
{
	String restfullWebServiceUrl = "http://localhost:9090/CampusPortalRESTWebServices/";
	
	@RequestMapping("/showapplyforcompany/{name}")
	public ModelAndView showApplyForCompany(@PathVariable("name") String name,HttpSession session)
	{
		System.out.println("Company : " + name);
		User user = (User) session.getAttribute("login");
		session.setAttribute("companyname", name);
		System.out.println(user);
		ModelAndView view = new ModelAndView("applyforcompany", "command",user);
		
		return view; 
	}
	
	@RequestMapping("/applyforcompany/{userid}")
	public ModelAndView applyForCompany(@PathVariable("userid") int userid,HttpSession session)
	{
		User user = (User) session.getAttribute("login");
		String name = (String) session.getAttribute("companyname");
		System.out.println("User : " + userid);
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"applyforcompany/{userid}/{name}"; 
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("userid", userid);
		hashMap.put("name", name);
		restTemplate.getForObject(url,User.class,hashMap);
		ModelAndView view = new ModelAndView("redirect:/home/"+user.getCourse());
		
		return view; 
	}
	
	@RequestMapping("/addcompany1")
	public ModelAndView addCompany()
	{
		Company company = new Company();
		ModelAndView view = new ModelAndView("addcompany", "command", company);
		
		return view; 
	}
	
	@RequestMapping("/viewschedulelist")
	public ModelAndView viewScheduleList()
	{
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"viewschedulelist"; 
		ScheduleCompanies scheduleCompanies = restTemplate.getForObject(url,ScheduleCompanies.class);
		ModelAndView view = new ModelAndView("scheduledcompanies", "command", scheduleCompanies);
		
		return view; 
	}
	
	@RequestMapping(value="/tpohome")
	public ModelAndView getUserList()
	{
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"tpohome"; 
		UserList userlist = restTemplate.getForObject(url,UserList.class);
		System.out.println(userlist);
		ModelAndView view = new ModelAndView("tpohome", "command", userlist);
		
		return view;
	}
	
	@RequestMapping(value="/adminhome")
	public ModelAndView getAdminUserList()
	{
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"adminhome"; 
		UserList userlist = restTemplate.getForObject(url,UserList.class);
		System.out.println(userlist);
		ModelAndView view = new ModelAndView("adminhome", "command", userlist);
		
		return view;
	}
	
	@RequestMapping("/scheduleforcompany")
	public ModelAndView scheduleCompany()
	{
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"scheduleforcompany"; 
		Companies company = restTemplate.getForObject(url,Companies.class);
		ModelAndView view = new ModelAndView("schedulecompany", "command", company);
		
		return view; 
	}
	
	@RequestMapping("/getschedulecomapny/{name}")
	public ModelAndView getScheduleComapny(@PathVariable("name") String name)
	{
		RestTemplate restTemplate = new RestTemplate();
		System.out.println(name);
		String url = restfullWebServiceUrl+"/getschedulecomapny/{name}"; 
		Companies company = restTemplate.getForObject(url,Companies.class,name);
		System.out.println(company);
		ModelAndView view = new ModelAndView("editschedulecompany", "command", company);
		
		return view; 
	}
	
	@RequestMapping("/getregistercompany/{name}")
	public ModelAndView getRegisterCompany(@PathVariable("name") String name)
	{
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"/getregistercompany/{name}"; 
		Company company = restTemplate.getForObject(url,Company.class,name);
		ModelAndView view = new ModelAndView("editcompany", "command", company);
		
		return view; 
	}
	
	@RequestMapping("/registerschedulecompany")
	public ModelAndView register(@ModelAttribute("command") Companies company) 
	{
//		System.out.println("inside register User : " + user);
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"registerschedulecompany"; 
		
		restTemplate.postForObject(url, company,Integer.class);
//		
		ModelAndView view = new ModelAndView("redirect:/viewschedulelist");
		
		return view;
	}
	
	@RequestMapping(value="/updateschedulecompany")
	public ModelAndView updateScheduleCompany(@ModelAttribute("command") Companies company)
	{
//		return service.updateScheduleCompany(company);
		
		System.out.println("\nmain : "+company+"\n");
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"updateschedulecompany"; 
		
		Companies compnay = restTemplate.postForObject(url, company,Companies.class);
		System.out.println("before model");
		ModelAndView view = new ModelAndView("redirect:/viewschedulelist");
		
		return view; 
	}
	
	@RequestMapping(value="/removeschedulecompany/{name}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView removeScheduleCompany(@PathVariable("name") String name)
	{
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"removeschedulecompany/{name}"; 
		
		restTemplate.getForObject(url, Integer.class,name);
		ModelAndView view = new ModelAndView("redirect:/viewschedulelist");
		
		return view; 
	}
	
	@RequestMapping("/pastrecruiterlist")
	public ModelAndView pastRecruiterList()
	{
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"pastrecruiterlist"; 
		Recruiters recruiters = restTemplate.getForObject(url,Recruiters.class);
		
		ModelAndView view = new ModelAndView("recruiters", "command", recruiters);
		
		return view; 
	}
	
	@RequestMapping("/getcompanylist")
	public ModelAndView getCompanyList()
	{
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"getcompanylist"; 
		CompanyList companyList = restTemplate.getForObject(url,CompanyList.class);
		
		ModelAndView view = new ModelAndView("registeredcompanies", "command", companyList);
		
		return view; 
	}
	
	@RequestMapping(value="/updatecompany")
	public ModelAndView updateCompany(@ModelAttribute("command") Company company)
	{
		System.out.println(company);
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"updatecompany"; 
		Company updatedCompany = restTemplate.postForObject(url,company,Company.class);
		ModelAndView view = new ModelAndView("redirect:/getcompanylist");
		
		return view; 
	}
	
	@RequestMapping(value="/removecompany/{name}")
	public ModelAndView removeCompany(@PathVariable("name") String name)
	{
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"removecompany/{name}"; 
		restTemplate.getForObject(url,void.class,name);
		ModelAndView view = new ModelAndView("redirect:/getcompanylist");
		
		return view; 
	}
	
	@RequestMapping(value="/registercompany")
	public ModelAndView registerCompany(@ModelAttribute("command") Company company)
	{
		RestTemplate restTemplate = new RestTemplate();
		System.out.println(company);
		String url = restfullWebServiceUrl+"registercompany"; 
		restTemplate.postForObject(url,company,Integer.class);
		ModelAndView view = new ModelAndView("redirect:/getcompanylist");
		
		return view; 
	}
	
	
}


