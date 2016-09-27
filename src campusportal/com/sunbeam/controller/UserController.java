package com.sunbeam.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.sunbeam.pojo.User;

@Controller
public class UserController
{
	String restfullWebServiceUrl = "http://localhost:9090/CampusPortalRESTWebServices/";
	
	@RequestMapping("/registerIndex")
	public ModelAndView registerIndex()
	{
		User obj = new User();
		ModelAndView mav = new ModelAndView("register", "command", obj);
		return mav;
	}
	
	@RequestMapping("/forgotpasswordIndex")
	public ModelAndView forgotpasswordIndex()
	{
		User obj = new User();
		ModelAndView mav = new ModelAndView("forgotpassword", "command", obj);
		return mav;
	}
	
	@RequestMapping("/showchangedpassord")
	public ModelAndView showChangedPassord()
	{
		User obj = new User();
		ModelAndView mav = new ModelAndView("changepassword", "command", obj);
		return mav;
	}
	
	@RequestMapping("/changepassword")
	public ModelAndView changedPassord(@ModelAttribute("command") User user,HttpSession session)
	{
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"changepassword"; 
		User obj = (User) session.getAttribute("login");
		user.setUserid(obj.getUserid());
		System.out.println("\n\ninside change passowrd "+user.getUserid()+"\n\n");
		restTemplate.postForObject(url, user,void.class);
		ModelAndView mav = new ModelAndView("changepassword", "command", new User());
		return mav;
	}
	
	@RequestMapping("/loginIndex")
	public ModelAndView loginIndex()
	{
		User obj = new User();
		ModelAndView mav = new ModelAndView("signin", "command", obj);
		return mav;
	}
	
	@RequestMapping("/logoutIndex")
	public ModelAndView logoutIndex(HttpSession session)
	{
		User obj = new User();
		session.invalidate();
		ModelAndView mav = new ModelAndView("signin", "command", obj);
		return mav;
	}
	
	@RequestMapping("/forgotpassword")
	public ModelAndView forgotPassword(@ModelAttribute("command") User user, HttpSession session) 
	{
		ModelAndView view;
		
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"forgotpassword"; 
		int send = restTemplate.postForObject(url, user,Integer.class);
		
		if(send == 1)
		{
			view = new ModelAndView("signin","command",new User());
		}
		else
		{
			view = new ModelAndView("forgotpassword","command",new User());
		}
		return view; 
	}
	
	@RequestMapping("/login")
	public ModelAndView login(@ModelAttribute("command") User user, HttpSession session) 
	{
		ModelAndView view = new ModelAndView("signin","command",new User());
		
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"login"; 
		User loggedInUser = restTemplate.postForObject(url, user,User.class);
		System.out.println(loggedInUser);
//		User loggedInUser = service.authenticate(user.getEmail(), user.getPass());
		if(loggedInUser != null)
		{
			session.setAttribute("login", loggedInUser);
			System.out.println("inside if");
			if(loggedInUser.getRollid() == 1)
				view = new ModelAndView("redirect:/home/"+loggedInUser.getCourse());
			else if(loggedInUser.getRollid() == 2)
				view = new ModelAndView("redirect:/tpohome");
			else if(loggedInUser.getRollid() == 3)
				view = new ModelAndView("redirect:/adminhome");
		}
		
		return view;
	}
	
	@RequestMapping("/register")
	public String register(@ModelAttribute("command") User user) 
	{
		System.out.println("inside register User : " + user);
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"register"; 
		
		int id = restTemplate.postForObject(url, user,Integer.class);
//		service.insertUser(user);
		System.out.println("\n\n"+id+"\n\n");
		return "redirect:/adminhome";
	}
	
	@RequestMapping("/editprofile")
	public ModelAndView editProfile(HttpSession session)
	{
		User obj = (User) session.getAttribute("login");
		ModelAndView mav = new ModelAndView("edit", "command", obj);
		return mav;
	}
	
	@RequestMapping("/updateprofile")
	public ModelAndView updateProfile(@ModelAttribute("command") User user,HttpSession session) 
	{
		System.out.println("inside update profile : " + user);
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"updateprofile"; 
		User obj = (User) session.getAttribute("login");
		user.setUserid(obj.getUserid());
		System.out.println("\n\ninside update profile : "+user.getUserid()+"\n\n");
		User updatedUser = restTemplate.postForObject(url, user,User.class);
		ModelAndView mav = new ModelAndView("edit", "command", updatedUser);
		return mav;
	}
	
	@RequestMapping("/adminupdateprofile")
	public ModelAndView adminUpdateProfile(@ModelAttribute("command") User user,HttpSession session) 
	{
		System.out.println("inside update profile : " + user);
		RestTemplate restTemplate = new RestTemplate();
		
		String url = restfullWebServiceUrl+"updateprofile"; 
		User obj = (User) session.getAttribute("login");
		user.setUserid(obj.getUserid());
		System.out.println("\n\ninside update profile : "+user.getUserid()+"\n\n");
		User updatedUser = restTemplate.postForObject(url, user,User.class);
		ModelAndView mav = new ModelAndView("redirect:/adminhome");
		return mav;
	}
}


