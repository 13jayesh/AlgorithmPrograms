/********************************************************************************
 * Purpose: To find month payment.
 * @author:  jayesh patil
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/
package com.bridgelabz.Algoritm;
import java.util.Scanner;

import com.bridgelabz.util.utility;
public class Monthpayme 
{
		
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter principle");
			double principle=sc.nextDouble();
			System.out.println("year");
			double year=sc.nextDouble();
			System.out.println("rate");
			double rate=sc.nextDouble();
			utility.mPayment(principle,year,rate);
		}
}
