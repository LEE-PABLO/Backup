package com.uuid.mvc.service;

import java.util.UUID;

public class UUIDService {
	public static String uuid() {
		return UUID.randomUUID().toString();
	}
}
