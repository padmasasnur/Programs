package com.onebill.upcastinganddowncasting;

public class Group {
	public static void main(String[] args) {
		User user = new Admin("Soumya",987654321);
		user.chat();
		user.vediocall();
		user.share();
		
		Admin admin = (Admin) user;
		admin.chat();
		admin.addUser("padma");
	
	}
}
