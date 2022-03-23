package com.onebill.corejava;

public class MethodOverloading {
	
	static void add (int x, int y) {
		int sum = x+y;
		System.out.println(sum);
	}
// different nor argu
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
	MethodOverloading.add(2,4,6);
}

}
