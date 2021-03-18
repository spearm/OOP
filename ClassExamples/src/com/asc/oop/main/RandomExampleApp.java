package com.asc.oop.main;

import java.util.Scanner;

public class RandomExampleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Program \n Please enter your name in the following format (first last)");
		String inpt 	=	"";
		String fName 	=	"";
		String lName 	=	""; 
		
		Scanner sc = new Scanner(System.in);
		inpt = sc.nextLine();
		// Mike Spear
		fName = inpt.substring(0,4);
		System.out.println("First name is:"+ fName);
		

		

	}

}
