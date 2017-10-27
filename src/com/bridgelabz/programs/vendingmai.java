package com.bridgelabz.Algoritm;

import java.util.Arrays;
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

	int a[]={2,5,10,1,100,50,500,1000};
	//Arrays.sort(a);
	utility.insertionSortInt(a);
	int Array[]=new int[9]; 
	utility.ATm1(a,Amount);
	
	}

}
