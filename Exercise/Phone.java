package com.onebill.project;

public class Phone {
	int price;
	int ram;
	String brand;
	//no argument constructor
	public Phone() {
		System.out.println("soumya is calling");
	}
	public void call() {
		System.out.println("calling soumya");
	}
	public void radio() {
		System.out.println("playing song");
	}
	public void message(String msg) {
		System.out.println("Hii");
	}

}
