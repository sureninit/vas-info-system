package com.vastika.java.uis;

import java.sql.Savepoint;
import java.util.Scanner;

import com.vastika.java.controller.UserController;

public class UserTest {

	public static void main(String[] args) {
		UserController controller = new UserController();
		Scanner input = new Scanner(System.in);
		controller.saveUserInfo(input);
}
}
