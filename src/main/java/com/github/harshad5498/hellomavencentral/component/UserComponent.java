package com.github.harshad5498.hellomavencentral.component;

import java.util.HashMap;

public class UserComponent {
	
	private HashMap<Integer,String> users = new HashMap<Integer,String>();
	UserComponent(){
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
	
	public HashMap<Integer,String> getUsers() {
		return users;
	}
	
	public String getUserNameById(Integer id) {
		return users.get(id);
	}
}
