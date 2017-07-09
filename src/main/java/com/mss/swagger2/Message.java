package com.mss.swagger2;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	String name;
	String message;
	
	public Message(String name) {
		super();
		this.name = name;
		this.message = "Hello, " + this.name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
