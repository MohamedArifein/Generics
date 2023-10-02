package com.arif.lear.generic;

import java.util.ArrayList;
import java.util.List;

/**
 *  Thanks to java-brains
 */
public class Generic01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("Hello world");
//		String s = list.get(1);
//		String s = (String) list.get(0);
//		System.out.println(s);
		ArrayList<String> list1 = new ArrayList<>();
//		list1.add(1);
		list1.add("Hello world");
		String s2 = list1.get(0);
		System.out.println(s2);
//		ArrayList<int> list1 = new ArrayList<>(); will not work
		
//		not working for int type only working for the wrapper classes
		List<Integer> alist = List.of(1,2,3);
		Integer ss = alist.get(0);
		System.out.println(ss);
	}

}
