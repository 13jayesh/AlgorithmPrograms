/********************************************************************************
	 * Purpose: It perform bobblesort.. 
	 *
	 * @author:  jayesh patil
	 * @version: V1.0
	 * @since:   7-8-2017
	 *********************************************************************************/
package com.bridgelabz.Algoritm;

import java.util.Scanner;

import com.bridgelabz.util.utility;
public class bobblesort {
	


	public static void main(String args[]) 
		{
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		utility.booblsort(a,size);
		}

}
