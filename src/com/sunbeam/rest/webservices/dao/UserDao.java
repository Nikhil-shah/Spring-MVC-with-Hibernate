package com.sunbeam.rest.webservices.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sunbeam.rest.webservices.pojo.User;

@Repository("UserDao")
@Transactional
public class UserDao 
{
	@Autowired
	public SessionFactory hbSF;

	public User authenticate(String email)
	{
		Session hbSession = hbSF.getCurrentSession();
		Query q = hbSession.createQuery("from User u where u.email = ?");
		q.setString(0, email);
		
		User user = null;
		
		if(q.list().size() != 0)
			user = (User) q.list().get(0);
		
		System.out.println("\n\n"+user+"\n\n");
		
		return user;
	}
	
	public int insertUser(User user) 
	{
		Session hbSession = hbSF.getCurrentSession();
		hbSession.save(user);
		hbSession.flush();
		return user.getUserid();
	}
	
	public User updateUser(User user) 
	{
		Session session = hbSF.getCurrentSession();
		
		Query query=session.createQuery("update User u set u.fname=?, u.lname=?, u.email=?, u.mobileno=?, u.street=?, u.city=?,"
				+ " u.country = ?,u.gender=?,u.birthdate=?,u.graduationstream=?,u.graduationpercentage=?,u.higherpercentage=?,"
				+ " u.seniorpercentage=?,u.nationality=?,u.course=?"
				+ " where u.userid=?");
		
		query.setString(0, user.getFname());
		query.setString(1, user.getLname());
		query.setString(2, user.getEmail());
		query.setString(3, user.getMobileno());
		query.setString(4, user.getStreet());
		query.setString(5, user.getCity());
		query.setString(6, user.getCountry());
		query.setString(7, user.getGender());
		query.setString(8, user.getBirthdate());
		query.setString(9, user.getGraduationstream());
		query.setFloat(10, user.getGraduationpercentage());
		query.setFloat(11, user.getHigherpercentage());
		query.setFloat(12, user.getSeniorpercentage());
		query.setString(13, user.getNationality());
		query.setString(14, user.getCourse());
		query.setInteger(15, user.getUserid());
		query.executeUpdate();
		
		return user;
	}
	
	public User updatePassword(User user) 
	{
		Session session = hbSF.getCurrentSession();
		
		Query query=session.createQuery("update User u set u.pass=? "
				+ " where u.userid=?");
		
		query.setString(0, user.getPass());
		query.setInteger(1, user.getUserid());
		query.executeUpdate();
		
		return user;
	}
}


