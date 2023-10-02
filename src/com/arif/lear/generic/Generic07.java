package com.arif.lear.generic;

import java.util.ArrayList;
import java.util.List;

import com.arif.lear.generic.pojo.Hostel;
import com.arif.lear.generic.pojo.Human;
import com.arif.lear.generic.service.Shirt;

public interface Generic07 {
	public static void main(String[] args) {		
		List<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		List<Double> doubles = new ArrayList<>();
		doubles.add(1.0);
		doubles.add(2.0);
		doubles.add(3.0);
		printValues1(integers);
		List<Human> human = List.of(new Human(),new Human(),new Human());
//		List<Hostel<T>> shirt = List.of(new Shirt(),new Shirt(),new Shirt());
//		printValues2(shirt);
	}

	public static void printValues1(List<? extends Number> list) {
		// TODO Auto-generated method stub
		list.forEach(System.out::println);
	}
	
	public static void printValues2(List<? super Shirt> list) {
		// TODO Auto-generated method stub
		list.forEach(System.out::println);
	}

}
