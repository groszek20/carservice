package pl.carservice.dto;

import java.util.Date;

public class Issue {
private String title;
private String content;
private Integer id;
private Date date;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Issue(String title, String content, Integer id, Date date) {
	super();
	this.title = title;
	this.content = content;
	this.id = id;
	this.date = date;
}

}
