package com.entity;

import java.util.Date;

public class News {
	private int id;
	private String title;
	private String author;
	private Date date;
	private String content;
	public News() {
		
	}
	public News(int id, String title, String author, Date date, String content) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.date = date;
		this.content = content;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
