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
import com.sunbeam.rest.webservices.pojo.Companies;
import com.sunbeam.rest.webservices.pojo.Company;
import com.sunbeam.rest.webservices.pojo.CompanyList;
import com.sunbeam.rest.webservices.pojo.Recruiter;
import com.sunbeam.rest.webservices.pojo.Recruiters;
import com.sunbeam.rest.webservices.pojo.ScheduleCompanies;
import com.sunbeam.rest.webservices.pojo.User;
import com.sunbeam.rest.webservices.pojo.UserList;
import com.sunbeam.rest.webservices.service.CompanyService;

@Controller
public class CompanyRESTController
{
	@Autowired
	private CompanyService service;
	
	@RequestMapping(value="/showapplyforcompany/{userid}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody User applyForCompany(@PathVariable("userid") int userid)
	{
		User user = service.getUser(userid);
		return user; 
	}
	
	@RequestMapping(value="/applyforcompany/{userid}/{name}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody void applyForCompany(@PathVariable("userid") int userid,@PathVariable("name") String name)
	{
		service.insertApplyCompany(new AppliedCompanies(userid,name));
	}
	
	@RequestMapping(value="/scheduleforcompany", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Companies scheduleCompany()
	{
		List<Company> companyList = service.getCopmanies();
		Companies company = new Companies();
		company.setCompanyList(companyList);
		return company; 
	}
	
	@RequestMapping(value="/viewschedulelist", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ScheduleCompanies viewScheduleList()
	{
		List<Companies> companiesList = service.getScheduleCompanies();
		ScheduleCompanies scheduleCompanies = new ScheduleCompanies();
		scheduleCompanies.setCompanyList(companiesList);
		return scheduleCompanies; 
	}
	
	@RequestMapping(value="/tpohome", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody UserList getUserList()
	{
		List<User> userList = service.getUserList();
		System.out.println(userList);
		UserList users = new UserList();
		users.setStudentList(userList);
		System.out.println(users);
		return users; 
	}
	
	@RequestMapping(value="/adminhome", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody UserList getAdminUserList()
	{
		List<User> userList = service.getAdminUserList();
		System.out.println(userList);
		UserList users = new UserList();
		users.setStudentList(userList);
		System.out.println(users);
		return users; 
	}
	
	@RequestMapping(value="/registerschedulecompany", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody void scheduleCompany(@RequestBody Companies company)
	{
		service.insertScheduleCompany(company);
	}
	
	@RequestMapping(value="/updateschedulecompany", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Companies updateScheduleCompany(@RequestBody Companies company)
	{
		System.out.println(company);
		return service.updateScheduleCompany(company);
	}
	
	@RequestMapping(value="/getschedulecomapny/{name}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Companies getScheduleComapny(@PathVariable("name") String name)
	{
		return service.getScheduleCompanies(name); 
	}
	
	@RequestMapping(value="/removeschedulecompany/{name}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody void removeScheduleCompany(@PathVariable("name") String name)
	{
		service.removeScheduleCompany(name);
	}
	
	@RequestMapping(value="/updatecompany", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Company updateCompany(@RequestBody Company company)
	{
		return service.updateCompany(company);
	}
	
	@RequestMapping(value="/registercompany", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody int registerCompany(@RequestBody Company company)
	{
		System.out.println(company);
		service.insertCompany(company);
		return 1;
	}
	
	@RequestMapping(value="/getregistercompany/{name}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Company getRegisterComapny(@PathVariable("name") String name)
	{
		return service.getCompany(name); 
	}
	
	@RequestMapping(value="/removecompany/{name}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody void removeCompany(@PathVariable("name") String name)
	{
		service.removeCompany(name);
	}
	
	@RequestMapping(value="/pastrecruiterlist", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Recruiters pastRecruiterList()
	{
		List<Recruiter> recruiterList = service.getPastRecruiters();
		Recruiters recruiters = new Recruiters();
		recruiters.setRecruiterList(recruiterList);
		return recruiters; 
	}
	
	@RequestMapping(value="/getcompanylist", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody CompanyList getComapnyList()
	{
		List<Company> companyList = service.getCompanyList();
		CompanyList companies = new CompanyList();
		companies.setCompanyList(companyList);
		return companies; 
	}
}


