package com.tcs.test;

public class Ragu_SESSION implements Ragu_Practice { 
	
	private void surface() {
System.out.println("surface");
	}
	
	private void star() {
		System.out.println(" star");

	}
	
	public static void main(String[] args) {
		Ragu_SESSION r = new Ragu_SESSION();
		r.moon();
		r.star();
		r.surface();
		r.sun();
		

		
	}

	@Override
	public void sun() {
System.out.println("the sun");		
	}

	@Override
	public void moon() {
System.out.println("the moon");		
	}

}
