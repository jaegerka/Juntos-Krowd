package dao;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import beans.Comments;

public class CommentDAOImpl implements CommentDAO {
	
	private SessionFactory sf = HibernateUtil.getSessionFactory;

	@Override
	public List<Comments> getAllComments() {
		List<Comments> comments = new ArrayList<>();
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			comments = s.createQuery("from Comments").getResultList();
			tx.commit();
			s.close();
		}
		return comments;
	}

	@Override
	public Comments getEventById(int comment_Id) {
		Comments comt = null;
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			comt = (Comments) s.get(Comments.class, comment_Id);
			tx.commit();
			s.close();
		}
		return comt;
	}

	@Override
	public void deleteComment(Comments comments) {
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			s.delete(comments);
			tx.commit();
			s.close();
		}
		
	}

	@Override
	public void updateComment(Comments comments) {
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			s.update(comments);
			tx.commit();
			s.close();
		}
		
	}

	@Override
	public void createComment(Comments comments) {
		try (Session s = sf.getCurrentSession()) {
			Transaction tx = s.beginTransaction();
			s.persist(comments);
			tx.commit();
			s.close();
		}
		
	}

}
