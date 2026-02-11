package com.global.mvn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import com.global.mvn.bean.Guest;

public class LombokTest {
	@Test
	public void lomboktest() {
		String uuid=UUID.randomUUID().toString();
		Guest guest=new Guest(uuid).builder().uuid(uuid).build();
		Guest guest2=new Guest(uuid);
		Set set=new HashSet();
		set.add(guest);
		set.add(guest2);
		assertEquals(set.size(), 1);
//		guest.setUuid(UUID.randomUUID().toString());
		System.out.println(guest.getUuid());
		System.out.println(guest.toString());
	}

}
