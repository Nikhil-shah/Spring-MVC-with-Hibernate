package com.sunbeam.rest.webservices.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sunbeam.rest.webservices.pojo.Contact;

@Repository("HomeDao")
@Transactional
public class HomeDao 
{
	@Autowired
	public SessionFactory hbSF;

	public void insertConatct(Contact contact) 
	{
		Session hbSession = hbSF.getCurrentSession();
		hbSession.save(contact);
		hbSession.flush();
	}
}


