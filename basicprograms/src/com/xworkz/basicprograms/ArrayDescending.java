package com.xworkz.basicprograms;

public class ArrayDescending {

	public static void main(String[] args) {

			int [] arr1= {8,1,5,9,4,7,2,6,3,10};
		
			int temp=0;
			System.out.println("Descending order");
			for(int i=0; i<arr1.length;i++) {
	         for(int j=i+1; j<arr1.length;j++) {
	        	if(arr1[i]<arr1[j]) {
	        		temp=arr1[i];
	        		arr1[i]=arr1[j];
	        		arr1[j]=temp;
	        	}
	          }
	         System.out.print(arr1[i]+" ");
	         
			}
		}

	}


