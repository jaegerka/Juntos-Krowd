package dao;

import java.util.List;

import beans.Users;

public interface UserDAO {

	public List<Users> getAllUsers();
	
	public void addUser(Users user);
	public void updateCave(Users user);
	public void deleteCave(Users user);
	public Users getUserById(int id); 

}
