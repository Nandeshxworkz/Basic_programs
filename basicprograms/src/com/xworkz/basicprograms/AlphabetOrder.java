package com.xworkz.basicprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlphabetOrder {

	public static void main(String[] args) {
  
		List<Character> list = new ArrayList<Character>(); 
		
		list.add('a');
		list.add('A');
		list.add('k');
		list.add('K');
		
		
		System.out.println(list);
		
		Collections.sort(list);
	
		System.out.println(list);
	}

}
