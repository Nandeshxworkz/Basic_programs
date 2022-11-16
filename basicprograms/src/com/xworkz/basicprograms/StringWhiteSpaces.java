package com.xworkz.basicprograms;

public class StringWhiteSpaces {

	public static void main(String[] args) {

		String str = "I am    good  person";
		String str2="";

//		String replaceAll = str.replaceAll(" ", "");
//		System.out.println(replaceAll);
		
//		char[] charArray = str.toCharArray();
//		for(int i=0; i<charArray.length;i++) {
//			
//			if(charArray[i]!=' ') {
//				str2=str2+charArray[i];	
//			}
//		}
//		System.out.println(str2);
		
		char[] charArray = str.toCharArray();
		
		for (char c : charArray) {
			if(c!=' ') {
				System.out.print(c);
			}
			
		}
		
	}
}
