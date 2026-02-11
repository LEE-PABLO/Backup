package com.global.mvn.main;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import com.global.mvn.bean.Guest;

public class LombokTest {

	public static void main(String[] args) {
		String uuid=UUID.randomUUID().toString();
		Guest guest=new Guest(uuid).builder().uuid(uuid).build();
		Guest guest2=new Guest(uuid);
		Set set=new HashSet();
		set.add(guest);
		set.add(guest2);
//		guest.setUuid(UUID.randomUUID().toString());
		System.out.println(guest.getUuid());
		System.out.println(guest.toString());
	}

}
