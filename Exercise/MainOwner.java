package com.onebill.methodoverride;

public class MainOwner {
	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari();
		ferrari.drive();
		ferrari.horn();
		ferrari.brake();
		
		System.out.println("=======");
		Audi audi = new Audi ();
		audi.drive();
        audi.horn();
		audi.brake();
		
	}

}
