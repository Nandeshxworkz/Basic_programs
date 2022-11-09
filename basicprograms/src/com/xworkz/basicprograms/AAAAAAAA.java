package com.xworkz.basicprograms;

public class AAAAAAAA {

	public static void main(String[] args) {

		String str = "gadag";
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			rev=rev+str.charAt(i);
			
		}
		if(str.equals(rev)){
			System.out.println("is polindrome");
		}else {
			
		
		System.out.println("is not");
		}
	}

}
