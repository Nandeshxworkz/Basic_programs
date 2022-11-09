package com.xworkz.basicprograms;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
	//	Scanner scan = new Scanner(System.in);
		
		int num = 22;
		int temp=0;
		//System.out.println(i);
		
		for(int j=2; j<num; j++) {
			if(num%j==0) { 
				temp=temp+1;
			}
		}
		if(temp>0) {
			System.out.println("It is not prime Number");
		}else {
			System.out.println("is prime number");
		}
		
	}

}
