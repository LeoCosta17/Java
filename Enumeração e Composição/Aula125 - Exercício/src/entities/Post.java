package entities;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Post {
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	private List<Comment> comments = new ArrayList<>();
	
	public Post() {
		
	}
	
	public Post(Date moment, String title, String content, int likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void addComment(Comment comment) {
		this.comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		this.comments.remove(comment);
	}

	
	
	
}
