package com.onebill.corejava;

public class Addition {
	static int a = 10;
	int b = 20;
	Addition(){
		System.out.println("from addition creating object");
	}
	static void add (int x, int y) {
		int sum = x+y;
		System.out.println(sum);
	}
	static void add (int x, int y, int z) {
		System.out.println(x+y+z);
	}
//different type of argu
	static void add(double x, double y) {
		System.out.println(x+y);
	}
	
	static void add(double x, int y) {
		System.out.println(x+y);
		
	}
	static void add(int x, double y) {
		System.out.println(x+y);

		
	}
public static void main(String[] args) {
	Addition.add(2,4,6);
}

	
	
	
	

}
