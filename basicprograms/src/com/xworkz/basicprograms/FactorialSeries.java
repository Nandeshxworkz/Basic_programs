package com.xworkz.basicprograms;

import java.util.Scanner;

public class FactorialSeries {

	public static void main(String[] args) {


		int fact=1;
		int num=6;
		
		for(int i=1; i<=num; i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
