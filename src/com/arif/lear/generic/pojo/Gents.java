package com.arif.lear.generic.pojo;

import com.arif.lear.generic.service.Saree;
import com.arif.lear.generic.service.Shirt;

public class Gents extends Human implements Shirt, Saree{
	private String name ;

	public Gents(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
