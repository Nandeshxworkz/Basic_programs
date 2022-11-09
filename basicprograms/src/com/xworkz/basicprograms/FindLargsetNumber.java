package com.xworkz.basicprograms;

public class FindLargsetNumber {

	public static void main(String[] args) {

        int a,b,c;
        
        a=10111;
        b=6001;
        c=4001;
        
        if(a>b && a>c) {
        	System.out.println("a is largest number");
        }else if (b>a&&b>c) {
        	System.out.println("b is largest number");
        }else if(c>a&&c>b){
        	System.out.println("c is largest number");
        }
		
	}

}
