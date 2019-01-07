package main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import beans.Users;
import dao.UserDAO;
import dao.UserDAOImpl;
import util.HibernateUtil;

public class Driver {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		testingUsers(sf); //pretty self explanatory 
//		
		
	}
	
	static void testingUsers(SessionFactory sf) {
		UserDAO ud = new UserDAOImpl();
		Session s = sf.getCurrentSession();
//		Transaction tx = s.beginTransaction();
		
		List<Users> userList = ud.getAllUsers();
		for(Users u: userList) {
			System.out.println(u);
		}
		
		//basic Crud methods
//		tx.commit();
		s.close();
	}

}
