package com.xworkz.basicprograms;

public class SwapTwoNumbers1 {
	
	public static void main(String[] args) {
		
		int a=10,b=20;
		
		System.out.println("a:"+a+"  "+"b:"+b);
		
		b=(a+b)-b;
		a=(a+b);
		
		
		System.out.println("a:"+a+"  "+"b:"+b);
		
		
	}

}
