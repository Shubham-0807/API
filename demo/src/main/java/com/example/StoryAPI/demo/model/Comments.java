package com.example.StoryAPI.demo.model;

import javax.persistence.Id;

public class Comments {
	
	@Id
	private int id ;
	private String text;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Comments(int id, String text) {
		super();
		this.id = id;
		this.text = text;
	}
	public Comments() {
		super();
	}
	
	

}
