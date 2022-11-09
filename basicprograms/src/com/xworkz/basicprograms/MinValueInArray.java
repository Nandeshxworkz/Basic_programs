package com.xworkz.basicprograms;

public class MinValueInArray {
	
	public static void main(String[] args) {
		
	int[] arr = {10,65,9,100,34,99,1000,1};
	
	int min= arr[5];
	
	for(int i=0; i<arr.length; i++ ) {
		
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	System.out.println(min);
	
}
}