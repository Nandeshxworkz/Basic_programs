package com.xworkz.Test;

public class ReverseString {

	public static void main(String[] args) {

		String str = "getting good at coding needs a lot of practice";
		
		String rev="";
		
		for(int i=str.length()-1; i>=0;i--) {
			rev = rev +str.charAt(i);
		}
		System.out.println(rev);
		
	}

}
