package com.xworkz.basicprograms;

public class PrimeNumber {
	
	public static void main(String[] args) {
	
		int count =6;
		int num = 2;
		int temp=0;
		
		for(int i=0; i<num; i++) {
			if(count%num==0) { 
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
