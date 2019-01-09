package com.krowd.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.krowd.beans.Users;
import com.krowd.dao.UserDAO;
import com.krowd.dao.UserDAOImpl;
import com.krowd.util.HibernateUtil;

public class Driver {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		testingUsers(sf); //pretty self explanatory 
//		
		
	}
	
	static void testingUsers(SessionFactory sf) {
		UserDAO ud = new UserDAOImpl();
		Session s = sf.getCurrentSession();
		
		//ONLY NEED IF RUNNING SESSION METHODS< our DAOS have transaction instantiated already >
//		Transaction tx = s.beginTransaction();
		
//		this.userid = userid;
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.username = username;
//		this.email = email;
//		this.token_score = token_score;
//		this.password = password;
//		this.photo_url = photo_url;
		
		Users user1 = new Users("Jane", "Doe", "janeDoe23", "janedoe23@gmail.com", 50, "ImTheBest2", "random2.url");
		Users user2 = new Users("Trevor", "Noah", "tnoahcomedy", "tnoah@gmail.com", 50, "ImTheBest3", "random3.url");
		
		ud.addUser(user2);
		
		//basic Crud methods
		
//		tx.commit();
		s.close();
	}

}
