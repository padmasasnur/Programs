package com.onebill.methodoverride;

public class Audi extends Car{
	@Override
	public void brake() {
		System.out.println("Suddenly Brakes the Car");
	}

}
