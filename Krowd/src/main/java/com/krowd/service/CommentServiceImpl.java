package com.krowd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.krowd.beans.Comments;
import com.krowd.dao.CommentDAO;
import com.krowd.dao.CommentDAOImpl;

@Service(value="commentService")
public class CommentServiceImpl implements CommentService {

	private CommentDAO ud = new CommentDAOImpl();

	@Override
	public List<Comments> getAllComments() {
		return ud.getAllComments();
	}

	@Override
	public void addComment(Comments comment) {
		ud.createComment(comment);
	}

	@Override
	public void updateComment(Comments comment) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteComment(int comment_Id) {
		ud.deleteComment(comment_Id);
	}

	@Override
	public Comments getCommentById(int id) {
		return ud.getCommentById(id);
	}

//	@Override
//	public void updateFollow(Comments comment, Comments comment2) {
//		// TODO
//	}

}
