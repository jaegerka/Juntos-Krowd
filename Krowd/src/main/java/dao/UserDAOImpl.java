package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import beans.Users;
import util.HibernateUtil;

public class UserDAOImpl implements UserDAO {

	@Override
	public List<Users> getAllUsers() {
		List<Users> users = new ArrayList<>();
		
		try(SessionFactory sf = HibernateUtil.getSessionFactory()){
			Session s = sf.getCurrentSession();
			Transaction tx = s.beginTransaction();
			
			users = s.createQuery("from Users").getResultList();
			
			tx.commit();
			s.close();
		}
		return users;
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
	public void updateUsers(Users user) {
		try (Session sf = HibernateUtil.getSessionFactory()) {
			Session s = sf.getCurrentSession();
			Transaction tx = s.beginTransaction();
			s.update(user);
			tx.commit();
			s.close();
		}
		
	}

	@Override
	public void deleteUsers(Users user) {
		
		
	}

	@Override
	public Users getUserById(int id) {
		Users user = null;
		try (SessionFactory sf = HibernateUtil.getSessionFactory()){
			Session s = sf.getCurrentSession();
			Transaction tx = s.beginTransaction();
	        user = (Users)s.load(Users.class, user_id);
	        Hibernate.initialize(user);
	    } catch (Exception e) {
	       e.printStackTrace();
	    } finally {
	        if (session != null && session.isOpen()) {
	            session.close();
	        }
	    }
	    return user;
	}
	

}
