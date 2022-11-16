package com.xworkz.basicprograms;

public class PrintEvenAndOddNumbers {

	public static void main(String[] args) {

		int [] a = {1,2,3,4,5,6,7,8,9};
		System.out.println("Printing Even Numbers");
		for(int i=0; i<a.length-1;i++) {
			if(a[i]%2==0) 
				System.out.print(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("Printing Odd Numbers");
		for(int i=0; i<a.length-1;i++) {
			if(a[i]%2!=0) 
				System.out.print(a[i]+" ");
		}
		
		
	}

}
