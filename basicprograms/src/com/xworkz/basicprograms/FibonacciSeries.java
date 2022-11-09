package com.xworkz.basicprograms;

public class FibonacciSeries {

	public static void main(String[] args) {

		int prev=0;
		int nxt=1;
		int present;
		
		for(int i=2; i<=10; i++) {
			present=prev+nxt;
			System.out.println(present);
			prev=nxt;
			nxt=present;
		}
		
	}

}
