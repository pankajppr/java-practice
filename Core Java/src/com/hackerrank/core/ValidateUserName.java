package com.hackerrank.core;

import java.util.Arrays;
import java.util.List;

//You are updating the username policy on your company's internal networking platform. According to the policy, a username is considered valid if all the following constraints are satisfied:
//
//The username consists of 8 to 30  characters inclusive. If the username consists of less than  or greater than  characters, then it is an invalid username.
//The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters , uppercase characters , and digits .
//The first character of the username must be an alphabetic character, i.e., either lowercase character  or uppercase character .
public class ValidateUserName {

	public static void main(String[] args) {
		String[] users = {"Julia","Samantha","Samantha_21","SamanthaSamanthaSamanthaSamant","_Julia007"};
		List<String> userNames = Arrays.asList(users);
		
		userNames.forEach(userName -> {
			int length =  userName.length();
//			if(length<8 | length >30) {
//				System.out.println("Invalid");
//				return;// only skips this iteration.
//			}
			if(userName.matches("([A-Z_a-z])\\w{7,30}")) {
				System.out.println("Valid");
			}else {
				System.out.println("Invalid");
			}
		});

	}

}
