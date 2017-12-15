package pl.carservice.dto;

import javax.validation.constraints.Size;

public class IssueForm {

	@Size(min=10, max=20)
	private String text;
	
	@Size(min=20, max=200)
	private String content;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
