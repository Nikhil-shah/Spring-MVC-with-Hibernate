package com.sunbeam.rest.webservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunbeam.rest.webservices.pojo.User;
import com.sunbeam.rest.webservices.service.UserService;

@Controller
public class UserRESTController 
{
	@Autowired
	private UserService service;
	
	@RequestMapping(value="/login", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody User searchBook(@RequestBody User user)
	{
		User loggedInUser = service.authenticate(user.getEmail(), user.getPass());
		return loggedInUser;
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody int register(@RequestBody User user) 
	{
		return service.insertUser(user);
	}
	
	@RequestMapping(value="/changepassword", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody void changedPassord(@RequestBody User user)
	{
		service.updatePassword(user);
	}
	
	@RequestMapping(value="/updateprofile", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody User updateProfile(@RequestBody User user) 
	{
		return service.updateUser(user);
	}
	
	@RequestMapping(value="/forgotpassword", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody int forgotPassword(@RequestBody User user) 
	{
		return service.forgotPassword(user.getEmail()); 
	}
}