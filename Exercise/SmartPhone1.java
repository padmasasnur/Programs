package com.onebill.project;

public class SmartPhone1 extends Phone1{
    double camera;
    int cameracount;

    public SmartPhone1(int price,int ram,double c,int cam) {
    super(price,ram);// con chaining (calling constructor)/refers to parent class object
    camera=c;
    cameracount=cam;
    System.out.println("From smart phone1 that is subclass");
    }
    
    public void play() {
    	System.out.println("playing pubg");
    	
    }
    public void selfie() {
    	System.out.println("taking selfie");
    }
	

}
