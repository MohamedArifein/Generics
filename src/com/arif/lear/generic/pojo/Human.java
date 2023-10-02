package com.arif.lear.generic.pojo;

import com.arif.lear.generic.service.Saree;
import com.arif.lear.generic.service.Shirt;

public class Human implements Shirt,Saree{
	private Integer age;
	private String type;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String ladiesDress(String sareeName) {
		// TODO Auto-generated method stub
		System.out.println(sareeName);
		return sareeName;
	}

	@Override
	public String gentsDress(String shirtName) {
		// TODO Auto-generated method stub
		System.out.println(shirtName);
		return shirtName;
	}

}
