package com.xworkz.Test;

public class EvenAndOddNumbers {

	public static void main(String[] args) {

		int [] arr = {20,37,58,69,99,70,87,18,9};
		
		
		System.out.println("printing odd numbers");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("printing Even numbers");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
