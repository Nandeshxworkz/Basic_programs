package com.xworkz.numberpatterprograms;

public class FirstQuandrantContinueNum {

	public static void main(String[] args) {

		int a=0;
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				a++;
				System.out.print(a+" ");
			}
			System.out.println();
		}
		
	}

}
