package com.arif.lear.generic;

import java.util.ArrayList;
import java.util.List;

public class Generic04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		List<Double> list3 = new ArrayList<>();
		list3.add(1d);
		list3.add(2d);
		printList3(list);
		printList3(list2);
		printList3(list3);
		

//		printList4(list); this will not work
		printList4(list2);
		printList4(list3);
		
	}

	private static void printList(List<Object> list) {//this will not work
		// TODO Auto-generated method stub
		list.forEach(System.out::print);
	}
	
	private static void printList2(List list) {//this will work
		// TODO Auto-generated method stub
		list.forEach(System.out::print);
	}
	
	private static void printList3(List<?> list) {//this will work
		// TODO Auto-generated method stub
		list.forEach(System.out::println);
//		list.add("D"); will not allow will get whatever I want but not add anything
		//upper ground middleCard
	}
	
	private static void printList4(List<? extends Number> list) {//this will work for superclass extend by number
		list.forEach(System.out::println);
		//upper ground middleCard
//		list.add(1); not work
	}

}
