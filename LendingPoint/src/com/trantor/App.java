package com.trantor;

public class App {

	
	public static void main(String[] args) {
		int year=2025;
		if(((year%4 == 0)&&(year%100!=0)) || (year%400==0)) {
			System.out.println("Leap Year");
		}
		
		else {
			System.out.println("Common Year");
		}
		
		}
	
	
}
