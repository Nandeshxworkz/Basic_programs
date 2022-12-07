package com.xworkz.Test;

import java.util.TreeSet;

import javax.print.attribute.Size2DSyntax;

public class Duplicates {

	public static void main(String[] args) {

	//	Hello, hi, Wow, cute, thanks, hi, Aww, cute, hello, beloved, Aww]
		
		  TreeSet ts = new TreeSet();
		  
		  ts.add("Hello");
		  ts.add("hi");
		  ts.add("Wow");
		  ts.add("cute");
		  ts.add("thanks");
		  ts.add("hi");
		  ts.add("Aww");
		  ts.add("cute");
		  ts.add("hello");
		  ts.add("beloved");
		  ts.add("Aww");
		  
		  for(int i=0; i<=ts.size();i++ ) {
			 if(ts.equals(ts)) {
				 
			 }
			 
		  }System.out.println(ts);//[Aww, Hello, Wow, baby, beloved, cute, hi, thanks]
		
	}

}
