package com.onebill.project;

public class Store {
	public static void main(String[] args) {
		Phone phone = new Phone();
		
		phone.price = 1999;
		phone.ram = 9;
		phone.brand= "Samsung";
		
		phone.call();
		phone.radio();
		phone.message("Hii");
		
		SmartPhone sp = new SmartPhone();
		sp.camera = 64;
		sp.cameracount = 4;
		
		sp.play();
		
		Samsung samsung = new Samsung();
		samsung.fold();
	
		
		}
		
	}


