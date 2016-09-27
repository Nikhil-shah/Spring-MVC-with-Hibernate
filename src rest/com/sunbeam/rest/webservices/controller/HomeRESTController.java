package com.sunbeam.rest.webservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunbeam.rest.webservices.pojo.Contact;
import com.sunbeam.rest.webservices.service.HomeService;

@Controller
public class HomeRESTController
{
	@Autowired
	HomeService service;
	
	@RequestMapping(value= "/addcontact", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody void addContact(@RequestBody Contact contact)
	{
		service.insertConatct(contact);
	}
}