package com.onebill.upcastinganddowncasting;

public class Admin extends User {
	
	public Admin(String name ,long number) {
		super(name,number);
		System.out.println("From user");
	}
	public void addUser(String username) {
		System.out.println(username  + "adding user");
	}
	public void removeUser(String username) {
		System.out.println(username  + "removing user");
	}

}
