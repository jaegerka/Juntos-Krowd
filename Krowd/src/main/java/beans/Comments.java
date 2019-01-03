package beans;

import java.time.LocalDate;

public class Comments {
	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comments(int comment_id, String data, int event_id, LocalDate created, int user_id) {
		super();
		this.comment_id = comment_id;
		this.data = data;
		this.event_id = event_id;
		Created = created;
		this.user_id = user_id;
	}
	
	private int comment_id;
	private String data;
	private int event_id;
	private LocalDate Created;
	private int user_id;
	public int getComment_id() {
		return comment_id;
	}
	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public LocalDate getCreated() {
		return Created;
	}
	public void setCreated(LocalDate created) {
		Created = created;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "Comments [comment_id=" + comment_id + ", data=" + data + ", event_id=" + event_id + ", Created="
				+ Created + ", user_id=" + user_id + "]";
	}
	
	
}
