package dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import beans.Users;

public class UserDAOImpl implements UserDAO {

	@Override
	public List<Users> getAllUsers() {
		List<Users> users = new ArrayList<>();
		
		try(SessionFactory sf = HibernateUtil.getSessionFactory()){
			Session s = sf.getCurrentSession();
			Transaction tx = s.beginTransaction();
			
			caves = s.createQuery("from Users").getResultList();
			
			tx.commit();
			s.close();
		}
	}

	@Override
	public void addUser(Users user) {
		try (SessionFactory sf = HibernateUtil.getSessionFactory()){
			Session s = sf.getCurrentSession();
			Transaction tx = s.beginTransaction();
			s.persist(cave);
			tx.commit();
			s.close();
		}
	}

	@Override
	public void updateCave(Users user) {
		
	}

	@Override
	public void deleteCave(Users user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Users getUserById(int id) {
		Users user = null;
		try (SessionFactory sf = HibernateUtil.getSessionFactory()){
			Session s = sf.getCurrentSession();
			Transaction tx = s.beginTransaction();
	        user = (Users)session.load(Users.class, user_id);
	        Hibernate.initialize(users);
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
