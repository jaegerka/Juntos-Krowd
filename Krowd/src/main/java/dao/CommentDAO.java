package dao;

import java.util.List;

import beans.Comments;

public interface CommentDAO {
	
	List<Comments> getAllComments();
	public Comments getEventById(int comment_Id);
	public void deleteComment(Comments comments);
	public void updateComment(Comments comments);
	public void createComment(Comments comments);


}
