package com.onebill.corejava;

public class Operators {
public static void main(String[] args) {
	int a = 20;
	int b = 30;
	System.out.println("=====Arithemetic======"); 

	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a/b);
	System.out.println(a%b);
	
	
	//Relational Operator
System.out.println("=====Relational======"); 
System.out.println(a<b);
System.out.println(a>b);

b = 5;
System.out.println(a<=b);
System.out.println(a>=b);
System.out.println(a==b);
System.out.println(a!=b);

System.out.println("=====LogicalOperators======"); 
int c = 40; //a = 20, b=5
System.out.println(c>a && c>b);
System.out.println(c>a ||  c>b);

System.out.println("=====Bitwise======"); 
a=4; b=6;
System.out.println(a & b);
System.out.println(a | b);

}	

}
