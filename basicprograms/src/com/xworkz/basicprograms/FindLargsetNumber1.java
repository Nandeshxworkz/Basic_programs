package com.xworkz.basicprograms;

public class FindLargsetNumber1 {

	public static void main(String[] args) {

		int a=100,b=207,c=30;
		
		int largest = (a>b)?((a>c)?a:c):(b>c)?b:c ;
	    System.out.println(largest);
		
	}

}
