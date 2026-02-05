package com.global.json;

public class User {
 private String name;
 private int age;
 private boolean developer;
 
 public User() {}

 public User(String name, int age, boolean developer) {
	 this.name=name;
	 this.age=age;
	 this.developer=developer;}

 public String getName() {return name;}
 public int getAge() {return age;}
 public boolean isDeveloper() {return developer;}
 
}
