package com.arif.lear.generic.pojo;

import com.arif.lear.generic.service.Saree;
import com.arif.lear.generic.service.Shirt;

public class Ladies extends Human implements Saree, Shirt{
	private String name ;

	public Ladies(String name) {
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
