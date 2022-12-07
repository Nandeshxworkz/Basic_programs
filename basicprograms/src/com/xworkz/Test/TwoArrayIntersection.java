package com.xworkz.Test;

public class TwoArrayIntersection {

	public static void main(String[] args) {

		int a[] = {1,4,5,9,10}; 
		int b[]= {2,8,6,1,7,4};
		
		for(int i=0; i<b.length; i++) {
			if(a[i]==b[i]) {
				System.out.println(b[i]);
			}
		}

	}

}
