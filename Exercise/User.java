package com.onebill.upcastinganddowncasting;

public class User {
	String name;
	long number;
	public User(String name, long number) {
		this.name = name;
		this.number = number;
	}
	public User() {
		System.out.println("From user");
	}
	public void chat() {
		System.out.println(name + "chatting");
	}
	public void vediocall() {
		System.out.println(name + "vediocalling");
	}
	public void share() {
		System.out.println(name + "sharing");
	}
	
	

}
