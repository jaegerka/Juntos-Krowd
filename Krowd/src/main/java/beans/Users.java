package beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Users")
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


@Id
@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="caveSequence")
@SequenceGenerator(allocationSize=1, name="userSequence", sequenceName="SQ_Users_PK")
@Column(name="USER_ID")
private int userid;

@Column(name="FIRSTNAME")
private String firstname;

@Column(name="LASTNAME")
private String lastname;

@Column(name="USERNAME")
private String username;

@Column(name="EMAIL")
private String email;

@Column(name="TOKEN_SCORE")
private int token_score;

@Column(name="PASSWORD")
private String password;

@Column(name="PHOTO_ID")
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
