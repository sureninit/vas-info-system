package com.vastika.java.controller;

import java.util.Scanner;

import com.vastika.java.model.User;
import com.vastika.java.service.UserService;
import com.vastika.java.service.UserServiceImpl;

public class UserController {
	UserService userService = new UserServiceImpl();

			public void saveUserInfo(Scanner input) {
				User user = new User();
				int save=1;
					System.out.println("Enter Username:");
					String username = input.nextLine();
					System.out.println("Enter Password:");
					String password = input.nextLine();
					System.out.println("Enter email:");
					String email = input.nextLine();
					System.out.println("Enter mobile:");
					String mobile = input.next();
					
				
					user.setUsername(username);
					user.setPassword(password);
					user.setEmail(email);
					user.setMobileNo(mobile);
				
					save = userService.saveUserInfo(user);
				
					if(save>=1) {
						System.out.println("User info is saved in db sucessfully !");
					}else {
						System.out.println("error in db.");
					}	
		}
	
}
