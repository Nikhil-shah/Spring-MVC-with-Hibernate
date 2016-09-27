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
import com.sunbeam.rest.webservices.pojo.Company;
import com.sunbeam.rest.webservices.pojo.Recruiter;
import com.sunbeam.rest.webservices.pojo.User;

@Repository("CompanyDao")
@Transactional
public class CompanyDao 
{
	@Autowired
	public SessionFactory hbSF;

	public User getUser(int useID) 
	{
		Session hbSession = hbSF.getCurrentSession();
		User reg = (User) hbSession.get(User.class, useID);
		return reg;
	}
	
	public void insertScheduleCompany(Companies company) 
	{
		Session hbSession = hbSF.getCurrentSession();
		hbSession.save(company);
		hbSession.flush();
	}
	
	public void insertCompany(Company company) 
	{
		Session hbSession = hbSF.getCurrentSession();
		hbSession.save(company);
		hbSession.flush();
	}
	
	public Company updateCompany(Company company) 
	{
		Session session = hbSF.getCurrentSession();
		
		Query query=session.createQuery("update Company u set u.name=?, u.contactperson= ?, u.email = ?,u.contactphonenumber = ?,"
				+ " u.mobileno = ?, u.postaladdress = ? "
				+ " where u.companyid=?");
		
		query.setString(0, company.getName());
		query.setString(1, company.getContactperson());
		query.setString(2, company.getEmail());
		query.setString(3, company.getContactphonenumber());
		query.setString(4, company.getMobileno());
		query.setString(5, company.getPostaladdress());
		query.setInteger(6, company.getCompanyid());
		query.executeUpdate();
		
		return company;
	}
	
	public Companies updateScheduleCompany(Companies company) 
	{
		System.out.println(company);
		Session session = hbSF.getCurrentSession();
		
		Query query=session.createQuery("update Companies u set u.date=?, u.timeofreporting= ?, u.grduationcriteria = ?,u.hsccriteria = ?,"
				+ " u.ssccriteria = ?, u.placeofposting = ?,u.gspackage = ?,u.bond = ?,u.course = ? "
				+ " where u.name=?");
		
		query.setString(0, company.getDate());
		query.setString(1, company.getTimeofreporting());
		query.setFloat(2, company.getGrduationcriteria());
		query.setFloat(3, company.getHsccriteria());
		query.setFloat(4, company.getSsccriteria());
		query.setString(5, company.getPlaceofposting());
		query.setString(6, company.getGspackage());
		query.setString(7, company.getBond());
		query.setString(8, company.getCourse());
		query.setString(9, company.getName());
		query.executeUpdate();
		
		return company;
	}
	
	public void removeCompany(String name) 
	{
		Session session = hbSF.getCurrentSession();
		
		Query query=session.createQuery("delete AppliedCompanies c  where c.name=?");
		query.setString(0, name);
		query.executeUpdate();
		
		query=session.createQuery("delete Companies c  where c.name=?");
		query.setString(0, name);
		query.executeUpdate();
		
		query=session.createQuery("delete Company c  where c.name=?");
		query.setString(0, name);
		query.executeUpdate();
	}
	
	public void removeScheduleCompany(String name) 
	{
		Session session = hbSF.getCurrentSession();
		
		Query query=session.createQuery("delete AppliedCompanies c  where c.name=?");
		query.setString(0, name);
		query.executeUpdate();
		
		query=session.createQuery("delete Companies c  where c.name=?");
		query.setString(0, name);
		query.executeUpdate();
		
	}
	
	public void insertApplyCompany(AppliedCompanies company) 
	{
		Session hbSession = hbSF.getCurrentSession();
		hbSession.save(company);
		hbSession.flush();
	}
	
	@SuppressWarnings("unchecked")
	public List<Company> getCompanies() 
	{
		Session hbSession = hbSF.getCurrentSession();
		Query q = hbSession.createQuery("from Company");
		return q.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Companies> getScheduleCompanies() 
	{
		Session hbSession = hbSF.getCurrentSession();
		Query q = hbSession.createQuery("from Companies");
		return q.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<User> getUserList() 
	{
		Session hbSession = hbSF.getCurrentSession();
		Query q = hbSession.createQuery("from User u where u.rollid=?");
		q.setInteger(0, 1);
		return q.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<User> getAdminUserList() 
	{
		Session hbSession = hbSF.getCurrentSession();
		Query q = hbSession.createQuery("from User u");
		return q.list();
	}
	
	public Companies getScheduleCompanies(String name) 
	{
		Session hbSession = hbSF.getCurrentSession();
		System.out.println(name);
		Query q = hbSession.createQuery("from Companies c where c.name=?");
		q.setString(0, name);
		return (Companies)q.list().get(0);
	}
	
	public Company getCompany(String name) 
	{
		Session hbSession = hbSF.getCurrentSession();
		Query q = hbSession.createQuery("from Company c where c.name=?");
		q.setString(0, name);
		return (Company)q.list().get(0);
	}
	
	@SuppressWarnings("unchecked")
	public List<Recruiter> getPastRecruiters() 
	{
		Session hbSession = hbSF.getCurrentSession();
		Query q = hbSession.createQuery("from Recruiter");
		return q.list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Company> getCompnayList() 
	{
		Session hbSession = hbSF.getCurrentSession();
		Query q = hbSession.createQuery("from Company");
		return q.list();
	}
}


