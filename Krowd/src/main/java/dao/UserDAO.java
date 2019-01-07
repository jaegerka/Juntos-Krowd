package dao;

import java.util.List;

import beans.Users;

public interface UserDAO {

	public List<Users> getAllUsers();
	
	public void addUser(Users user);
	public void updateUsers(Users user);
	public void deleteUsers(Users user);
	
	public Users getUserById(int id); 

}
