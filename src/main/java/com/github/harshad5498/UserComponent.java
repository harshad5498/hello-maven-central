package com.github.harshad5498;

import java.util.HashMap;

public class UserComponent {
	
	private static HashMap<Integer,String> users = new HashMap<Integer,String>();
	public  UserComponent(){
		UserComponent.addUsers();		
	}
	
	public static HashMap<Integer,String> getUsers() {
		return users;
	}
	
	public static String getUserNameById(Integer id) {
		return users.get(id);
	}
	
	public static void addUsers() {
		users.put(1, "Tony Stark (Iron Man)");
		users.put(2, "Barry Allen (The Flash)");
		users.put(3, "Eobard Thawne (Revese Flash)");
		users.put(4, "Steve Rogers (Captain America)");
		users.put(5, "Bruce Banner (The Hulk)");
		users.put(6, "Oliver Queen (Green Arrow)");
		users.put(7, "Clark Kent (SuperMan)");
		users.put(8, "Peter Parker (SpiderMan)");
		users.put(9, "Bruce Wayne (BatMan)");
	}
}
