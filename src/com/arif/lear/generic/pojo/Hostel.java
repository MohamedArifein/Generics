package com.arif.lear.generic.pojo;

import com.arif.lear.generic.service.Saree;
import com.arif.lear.generic.service.Shirt;

public class Hostel<T extends Human & Shirt & Saree> {
	private T member;

	public Hostel(T member) {
		super();
		this.member = member;
	}

	public Hostel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public T getMember() {
		return member;
	}

	public void setMember(T member) {
		this.member = member;
	}
	
	public boolean eligibleForVote() {
		return member.getAge()>18;
	}

}
