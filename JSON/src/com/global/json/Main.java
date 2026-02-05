package com.global.json;

import java.util.ArrayList;
import java.util.List;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) {
		ObjectMapper mapper= new ObjectMapper();
		List<User> list= new ArrayList<>();
		list.add(new User("Paulo", 29, true));
		list.add(new User("Paul", 29, true));
		list.add(new User("Baoro", 29, true));
		
		try {String json= mapper.writeValueAsString(list);
		System.out.println(json);
		String prettyJson= mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
		System.out.println(prettyJson);
		
		List<User> deserializedList = mapper.readValue(prettyJson, new TypeReference<List<User>>(){});
		for (User user : deserializedList) { 
		System.out.println("Name: "+user.getName());
		 System.out.println("Age: "+user.getAge());
		 System.out.println("IsDeveloper?: "+user.isDeveloper());}
		 }
		catch (Exception e) {e.printStackTrace();}
	}

}
