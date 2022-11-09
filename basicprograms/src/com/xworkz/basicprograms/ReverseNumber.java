package com.xworkz.basicprograms;

public class ReverseNumber {
	
	public static void main(String[] args) {		
		int num= 122;
		int reverse=0;
		int remaider;
		
		while(num!=0) {
			remaider= num%10;
			reverse=(reverse*10)+remaider;
			num=num/10;
		}
		System.out.println(reverse);
		
	}}
	