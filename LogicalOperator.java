package com.onebill.corejava;

public class LogicalOperator {
public static void main(String[] args) {
	int a = 20;
	int b = 30;
	int c = 40;
	System.out.println(a<b && ++c>b);
	System.out.println(a++<b || ++c<b);
	System.out.println(a++<b || ++c<b++);
	System.out.println(c);//41
	System.out.println(a);//22
	System.out.println(b);//30
}
}
