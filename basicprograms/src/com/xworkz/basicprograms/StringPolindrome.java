package com.xworkz.basicprograms;

public class StringPolindrome {
	
	public static void main(String[] args) {
		
		String str= "GADAG";
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("Given string is Polindrome");
		}else {
			System.out.println("Given String is not polindrome");
		}
	}

}
