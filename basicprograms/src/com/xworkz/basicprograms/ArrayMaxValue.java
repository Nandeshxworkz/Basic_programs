package com.xworkz.basicprograms;

public class ArrayMaxValue {

	public static void main(String[] args) {

		int a[]= {50,3,11,45,1000,0,67};
		int max=a[0];
		
		for(int i=0; i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum element in an array is :"+max);
		
	}

}
