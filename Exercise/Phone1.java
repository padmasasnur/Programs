package com.onebill.project;

   public class Phone1 {
	int price;
	int ram;
	// create constructor to intializing variable
	public Phone1(int p, int r) {
		price = p;
		ram = r;
	}
	public void call(String name) {
		System.out.println("calling" + name);
	}
	public void radio() {
		System.out.println("playing song");
	}
	public void message(String msg) {
		System.out.println("Hii");
	}


}



