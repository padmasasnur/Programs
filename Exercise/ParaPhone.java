package com.onebill.project;

public class ParaPhone {
	int price;
	int ram;
	
	// parameterized Constructor
	
	public ParaPhone(int p, int r) {
		price = p;
		ram = r;
	}
	public void call() {
		System.out.println("soumya is calling");
	}
	public void radio() {
		System.out.println("playing song");
	}
	public void message(String msg) {
		System.out.println("Hii");
	}


}
