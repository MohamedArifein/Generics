package com.arif.lear.generic;

import java.util.ArrayList;
import java.util.List;

public class Generic02 {
	//typeErasure
	// implemented for compiletime not for runtime
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		
		add(list,"c");
		add2(list,100);
		System.out.println(list);
		String str[] = {"A"};
//		addString(str, 1); //runtime Exception
//		System.out.println(str);
		
	}

	private static void add(List<String> list, String string) {
		// TODO Auto-generated method stub
		list.add(string);
	}

	private static void add2(List list, Integer string) {
		// TODO Auto-generated method stub
		list.add(string);
	}
	
	private static void addString(Object[] str, Integer i) {
		// TODO Auto-generated method stub
		str[0] = i;
	}

}
