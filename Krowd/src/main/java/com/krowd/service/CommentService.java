package com.krowd.service;

import java.util.List;

import com.krowd.beans.Comments;
import com.krowd.beans.Users;

public interface CommentService {
	
	public List<Comments> getAllComments();
	public void addComment(Comments comment);
	public void updateComment(Comments comment);
	public void deleteComment(int comment_Id);
	public Comments getCommentById(int id); 

//	public void updateFollow(Users user, Users user2);
}
