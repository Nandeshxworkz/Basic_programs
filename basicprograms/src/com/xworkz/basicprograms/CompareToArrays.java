package com.xworkz.basicprograms;

public class CompareToArrays {

	public static void main(String[] args) {

		int[] a= {1,2,3,4};
		int[] b= {1,2,9,4};
		
		boolean result=true;
		if(a.length==b.length) {
			
			for(int i=0; i<a.length;i++) {
				
				if(a[i]!=b[i]) 
					result=false;
				
			}
		}else {
			result = false;
		}
			
		if(result==true) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
		
		
	}

}
