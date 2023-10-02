package com.arif.lear.generic;

import java.util.Arrays;
import java.util.List;

import com.arif.lear.generic.pojo.Gents;
import com.arif.lear.generic.pojo.Hostel;
import com.arif.lear.generic.pojo.Human;
import com.arif.lear.generic.pojo.Ladies;

public class Generic05 {
	public static void main(String[] args) {
		Gents gents = new Gents("M1");
		gents.setAge(12);
		gents.gentsDress("Peter England");
		Gents gents2 = new Gents("M2");
		gents2.setAge(25);
		gents2.gentsDress("Puma");
		Gents gents3 = new Gents("M3");
		gents3.setAge(30);
		gents3.gentsDress("crocadile");
		List<Gents> gentss = Arrays.asList(gents,gents2,gents3);
		eligibleForVote(gentss);
		
		Ladies l1 = new Ladies("l1");
		l1.setAge(19);
		l1.ladiesDress("silk saree");
		Ladies l2 = new Ladies("l1");
		l2.setAge(16);
		l2.ladiesDress("chudi");
		Ladies l3 = new Ladies("l1");
		l3.setAge(45);
		l3.ladiesDress("patiyala");
		List<Ladies> ladies = Arrays.asList(l1,l2,l3);
		eligibleForVote(ladies);
		
	}
	
	private static void eligibleForVote(List<? extends Human> list) {
		for(Human human:list) {
			Hostel<Human> h = new Hostel<>(human);
			if(h.eligibleForVote())
				System.out.println("eligible for vote");
			else
				System.out.println("not eligible for vote");
//			human.
			
		}
	}

}
