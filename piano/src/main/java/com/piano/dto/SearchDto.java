package com.piano.dto;

public class SearchDto {
	private String title;
	private String content;
	private String filePath;
	public SearchDto(String title, String content, String filePath) {
		super();
		this.title = title;
		this.content = content;
		this.filePath = filePath;
	}
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
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public SearchDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
