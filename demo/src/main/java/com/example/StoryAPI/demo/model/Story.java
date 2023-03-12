package com.example.StoryAPI.demo.model;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

import jakarta.persistence.Table;  


@Entity
@Table(name="story")
public class Story   {
	@Id
	private int id;
	private String StoryCaption;
	private LocalDateTime time;
	
	List<Comments> comments;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStoryCaption() {
		return StoryCaption;
	}

	public void setStoryCaption(String storyCaption) {
		StoryCaption = storyCaption;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
	

	public List<Comments> getComments() {
		return comments;
	}

	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}

	public Story(int id, String storyCaption, LocalDateTime time,List<Comments> comments) {
		super();
		this.id = id;
		StoryCaption = storyCaption;
		this.time = time;
		this.comments=comments;
	}

	public Story() {
		super();
	}
	
	
	

}
