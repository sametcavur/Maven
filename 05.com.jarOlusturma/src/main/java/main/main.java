package main;

import Users.users;

public class main {
	public static void main(String[] args) {
		users u = new users();
		
		u.setIsim("Samet");
		System.out.println(u.getIsim());
	}
}
