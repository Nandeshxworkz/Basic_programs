package com.xworkz.basicprograms;

public class NumberPalindrome {
	
	public static void main(String[] args) {
		
		int num=122;
		int rev=0;
		int rem;
		int temp=num;
		
	 while(num!=0) {
		 rem=num%10;
		 rev=rev*10+rem;
		 num=num/10;
		 
	 }
	 if(rev==temp) {
		 System.out.println("is polindrome");
	 }else {
		 System.out.println("is not polindrome");
	 }
		
	}

}
