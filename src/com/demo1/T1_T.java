package com.demo1;



public class T1_T {

	public static void main(String[] args) {
		
		String s="Hello. How are you today";  //o
		char c='d';
		int totalCount=s.length();		
		int afterCount=s.replace("", "").length();		
		int count=totalCount-afterCount;		
		System.out.println(count);		
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
		}
	}

}
