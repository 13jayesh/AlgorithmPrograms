package com.bridgelabz.util;

import java.util.Scanner;

public class util {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) 
	{
	System.out.println("Enter size");
	int size=sc.nextInt();
	int Array[]=new int[size];
	System.out.println("Enter choice");
	int choice=Integer.parseInt(sc.nextLine());
	switch(choice)
	{
	case 1:
	{
		utility.binarySearchInt(int[] a) 
	}
		break;
		
	case 2:
		{
			utility.binarySearchstr(int size)
		}	
	}
}

}
