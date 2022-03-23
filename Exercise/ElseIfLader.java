package com.onebill.corejava;

public class ElseIfLader {
	public static void main(String[] args) {
		int money = 11500;
		if(money>10000 && money<11000) {
			System.out.println("lets go to goa");
		}else if(money>11000 && money<12000) {
			System.out.println("lets go to Delhi");
			
		}else if(money>12000) {
			System.out.println("lets go to simla");
		}else {
			System.out.println("lets go to Chick Manglore");
		}
	}

}
