package com.adobe.request;

public class PostRequest {

private String content;
	
	private Integer userId;
	
	public PostRequest() {
		// TODO Auto-generated constructor stub
	}

	public PostRequest(String content, Integer userId) {
		super();
		this.content = content;
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "PostRequest [content=" + content + ", userId=" + userId + "]";
	}
	
}
