package com.sunbeam.rest.webservices.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sunbeam.rest.webservices.pojo.AppliedCompanies;
import com.sunbeam.rest.webservices.pojo.Companies;
import com.sunbeam.rest.webservices.pojo.PlacedStudent;
import com.sunbeam.rest.webservices.pojo.User;

@Repository("StudentDao")
@Transactional
public class StudentDao 
{
	@Autowired
	public SessionFactory hbSF;

	@SuppressWarnings("unchecked")
	public List<Companies> getUserScheduleCompanies(String course,float grduationcriteria,float hsccriteria,float ssccriteria) 
	{
		Session hbSession = hbSF.getCurrentSession();
		Query q = hbSession.createQuery("from Companies c where c.course = ? and c.grduationcriteria <= ? and c.hsccriteria <= ? and c.ssccriteria <= ?");
		q.setString(0, course);
		q.setFloat(1, grduationcriteria);
		q.setFloat(2, hsccriteria);
		q.setFloat(3, ssccriteria);
		System.out.println(q.list());
		return q.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Companies> getAllScheduleCompanies(String course) 
	{
		Session hbSession = hbSF.getCurrentSession();
		Query q = hbSession.createQuery("from Companies c where c.course = ?");
		q.setString(0, course);
		return q.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<AppliedCompanies> getAppliedScheduleCompanies(int userid) 
	{
		Session hbSession = hbSF.getCurrentSession();
		Query q = hbSession.createQuery("from AppliedCompanies c where c.userid = ?");
		q.setInteger(0, userid);
		return q.list();
	}
	
	public Companies getScheduleCompany(String name) 
	{
		Session hbSession = hbSF.getCurrentSession();
		Query q = hbSession.createQuery("from Companies c where c.name = ?");
		q.setString(0, name);
		return (Companies) q.list().get(0);
	}
	
	@SuppressWarnings("unchecked")
	public List<PlacedStudent> getPlacedStudentList() 
	{
		Session hbSession = hbSF.getCurrentSession();
		Query q = hbSession.createQuery("from PlacedStudent c");
		return q.list();
	}
	
	public User getUser(int userid) 
	{
		Session hbSession = hbSF.getCurrentSession();
		Query q = hbSession.createQuery("from User u where u.userid = ?");
		q.setInteger(0, userid);
		return (User) q.list().get(0);
	}
}


