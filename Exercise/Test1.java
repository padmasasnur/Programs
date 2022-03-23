package com.onebill.overiding;

public class Test1 extends Test{
	@Override
	public void message() {
		super.message();
		System.out.println("message Received");
	}
	@Override
	public int add(int x, int y) {
		super.add(x, y);
		return x+y+10;
	

}
}