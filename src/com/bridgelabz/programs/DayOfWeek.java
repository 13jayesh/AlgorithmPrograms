

/******************************************************************************
 *  Purpose:to find day of year
 *
 * @author:  jayesh patil
 * @version: V1.0
 * @since:   7-8-2017
 ******************************************************************************/
 package com.bridgelabz.Algoritm;
 import java.util.Scanner;

import com.bridgelabz.util.utility;
public class DayOfWeek 
{		   
        

        public static void main(String args[])
        {
        	Scanner sc=new Scanner(System.in);
        	 System.out.println("Enter day");
        	 int day=sc.nextInt();
        	 System.out.println("enter year");
        	 int month=sc.nextInt();
        	 System.out.println("enter month");
        	 int year=sc.nextInt();
           
            utility.DAYOFWEEK(day,month,year);
        }
        }


	


