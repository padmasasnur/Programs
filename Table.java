package com.onebill.corejava;
import java.util.Scanner; // to read the input from user

public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number:");
		//reading nor whose table is to be print
		int num = sc.nextInt();
		for (int i =1; i<= 10; i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
		
		
	}

}
