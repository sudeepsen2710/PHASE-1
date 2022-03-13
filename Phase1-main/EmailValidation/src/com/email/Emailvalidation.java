package com.email;

import java.util.Scanner;

public class Emailvalidation {

	public static void main(String[] args) {
		
		String n;
		String array[]= {"shruti@gmail.com","sikha@gmail.com","ashutosh@gmail.com"};
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Email ID:");
		n=sc.next();
		if(array[0].equals(n))
		{
			System.out.println("User Authenticated");
		}
		else if(array[1].equals(n))
		{
			System.out.println("User Authenticated");
		}
		else if(array[2].equals(n))
		{
			System.out.println("User Authenticated");
		}
		else if(array[3].equals(n))
		{
			System.out.println("User Authenticated");
		}
		else 
		{
			System.out.println("User Invalid");
		}
	}

}
