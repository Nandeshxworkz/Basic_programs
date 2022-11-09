package com.xworkz.basicprograms;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String str="Hi bablu";
		
		int length = str.length();
		System.out.println(length);
		
		char[] charAt = str.toCharArray();
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(charAt[i]);
		}
		
	}

}
