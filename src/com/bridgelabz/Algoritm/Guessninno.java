package com.bridgelabz.Algoritm;

import java.util.Scanner;

import com.bridgelabz.util.utility;

public class Guessninno
{ 	
	static Scanner sc=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lower number:");
		int lowernumber=sc.nextInt();
		System.out.println("higher  number:");
		int highernumber=sc.nextInt();
		System.out.println("guess the number between"+lowernumber+"to higher number"+highernumber);
		utility.guess(lowernumber,highernumber);
	}

}
