package beans;


public class Users {
	
public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

@Override
public String toString() {
	return "User [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", username=" + username
			+ ", email=" + email + ", token_score=" + token_score + ", password=" + password + ", photo_id=" + photo_id
			+ "]";
}

public Users(int userid, String firstname, String lastname, String username, String email, int token_score,
		String password, int photo_id) {
	super();
	this.userid = userid;
	this.firstname = firstname;
	this.lastname = lastname;
	this.username = username;
	this.email = email;
	this.token_score = token_score;
	this.password = password;
	this.photo_id = photo_id;
}

private int userid;
private String firstname;
private String lastname;
private String username;
private String email;
private int token_score;
private String password;
private int photo_id;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getToken_score() {
	return token_score;
}
public void setToken_score(int token_score) {
	this.token_score = token_score;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getPhoto_id() {
	return photo_id;
}
public void setPhoto_id(int photo_id) {
	this.photo_id = photo_id;
}


}
