package com.onebill.corejava;

public class Constructor {
	Constructor(){
		System.out.println("I am a Constructor");
	}
	public static void main(String[] args) {
		Constructor con = new Constructor();
		
		Addition.add(12,12);
		System.out.println(Addition.a);
		
		Addition a = new Addition(); //Creating Object
		a.add(13, 12);
		System.out.println("the value of b is"+a.b);
	}

}
