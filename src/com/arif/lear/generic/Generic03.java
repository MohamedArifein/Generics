package com.arif.lear.generic;

import com.arif.lear.generic.pojo.Gents;
import com.arif.lear.generic.pojo.Ladies;
import com.arif.lear.generic.pojo.Hostel;

public class Generic03 {
	public static void main(String[] args) {
		// we allow only ladies
		Hostel ladiesHostel = new Hostel(new Ladies("Eljabad"));
		// we should not allow gents
		ladiesHostel = new Hostel(new Gents("Antony"));
		//Convert the normal class to typesafe and now add the different object.
		
		Hostel<Gents> gentsHostel = new Hostel<>();
		gentsHostel.setMember(new Gents("Antony"));
//		gentsHostel.setMember(new Ladies("Eljabad")); throwing exception
		
		Hostel<Gents> gentsHostel2 = new Hostel<>(new Gents("Antony"));
//		Hostel<Gents> gentsHostel3 = new Hostel<>(new Ladies("Eljabad")); throwing exception
		Hostel<Gents> gentsHostel4 = new Hostel(new Ladies("Eljabad"));
		
		
	}

}
