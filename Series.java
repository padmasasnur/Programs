package com.onebill.corejava;

import java.util.Scanner;

public class Series {
	public static void main(String[] args) {
		int a,b,n,result=0;
		Scanner sc = new Scanner (System.in);
		System.out.print("enter a :");
		a=sc.nextInt();
		System.out.print("enter b :");
		b=sc.nextInt();
		System.out.print("enter n :");
		n=sc.nextInt();
		System.out.print("(");
		for(int i=0;i<n;i++) {
			result=0;
			for(int j=0;j<=i;j++) {
				result+=((int)(Math.pow(2,j)*b));
				
			}
			result=a+result;
			System.out.print(result+",");
		}
		System.out.println(")");
	}

}