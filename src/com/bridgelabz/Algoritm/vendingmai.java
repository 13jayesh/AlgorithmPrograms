package com.bridgelabz.Algoritm;

import java.util.Scanner;

import com.bridgelabz.util.utility;

public class vendingmai 
{
	static int i;
	

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Amount");
	int Amount=sc.nextInt();
	int a[]={1,2,5,10,20,50,100,500,1000};
	utility.ATm1(a,Amount);
	
	}

}
