package com.xworkz.Test;

public class StringInsert {

	public static void main(String[] args) {
		String input = "Computer Portal";
        String insert="Science ";
        
//        int index=8;
//        
//        StringBuffer sb = new StringBuffer(input);
//        StringBuffer insert2 = sb.insert(index+1, insert);
//        System.out.println(insert2);
        
        System.out.println(input.substring(0,8)+" "+ insert + input.substring(9,15));
		
	}

}
