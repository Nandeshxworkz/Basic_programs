package com.xworkz.basicprograms;

public class ArrayMinValue {

	public static void main(String[] args) {

		int a[]= {50,3,11,45,100,0,67};
		
		int min = a[0];
		
		for(int i=0; i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Minimum element in an array is :"+min);
		
	}

}
