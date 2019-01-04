package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import beans.Users;
import util.HibernateUtil;

public class UserDAOImpl implements UserDAO {

	@Override
	public List<Users> getAllUsers() {
		List<Users> userList = new ArrayList<>();
		
		try(SessionFactory sf = HibernateUtil.getSessionFactory()){
			Session s = sf.getCurrentSession();
			Transaction tx = s.beginTransaction();
			
			userList = s.createQuery("from Users").getResultList();
			
			tx.commit();
			s.close();
		}
		return userList;
	}

	@Override
	public void addUser(Users user) {
		try (SessionFactory sf = HibernateUtil.getSessionFactory()){
			Session s = sf.getCurrentSession();
			Transaction tx = s.beginTransaction();
			s.persist(user);
			tx.commit();
			s.close();
		}
	}

	@Override
	public void updateCave(Users user) {
		try(SessionFactory sf = HibernateUtil.getSessionFactory()){
			Session s = sf.getCurrentSession();
			Transaction tx = s.beginTransaction();
			
			s.persist(user);
			
			tx.commit();
			s.close();
		}
	}

	@Override
	public void deleteCave(Users user) {
		try(SessionFactory sf = HibernateUtil.getSessionFactory()){
			Session s = sf.getCurrentSession();
			Transaction tx = s.beginTransaction();
			
			s.delete(user);
			
			tx.commit();
			s.close();
		}
	}

	@Override
	public Users getUserById(int id) {
		Users user = null;
		try(SessionFactory sf = HibernateUtil.getSessionFactory()){
			Session s = sf.getCurrentSession();
			Transaction tx = s.beginTransaction();
			user = (Users) s.get(Users.class, id);
			tx.commit();
			s.close();
		}
	    return user;
	}

}
