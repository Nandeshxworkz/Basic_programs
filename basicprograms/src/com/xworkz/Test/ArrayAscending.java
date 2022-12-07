package com.xworkz.Test;

public class ArrayAscending {

	public static void main(String[] args) {

		int[][]  arr = { {1, 2, 3}, {2, 2, 4}, {5, 6, 1}, {10, 2, 10}} ;
		
		int[] temp;
		System.out.println("Ascending order");
		for(int i=0; i<arr.length;i++) {
         for(int j=i+1; j<arr.length;j++) {
        	//if(arr[i]arr[j]) {
        		temp=arr[i];
        		arr[i]=arr[j];
        		arr[j]=temp;
        	
          }
         System.out.print(arr[i]+" ");
         
		}
		
	}

}
