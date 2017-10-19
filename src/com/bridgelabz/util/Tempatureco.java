package com.bridgelabz.util;
import java.util.Scanner;
public class Tempatureco 
{
				static String t;
				static Scanner sc = new Scanner(System.in);
				public static void conversio(double fahrenheit,double celsius)
				{
		        System.out.print("The value you entered is in celsius/fahrenheit(c/f):");
				String t1= sc.next();
		        switch (t1){
		            case "c": System.out.print("Enter the temperature in celsius:");
		                      celsius = (int) sc.nextDouble();
		                      fahrenheit = (celsius * 9 / 5) + 32;
		                      System.out.println("The temperature is " + fahrenheit + "F for given temperature in "
		                              + celsius + "C");
		                      break;
		            case "f": System.out.print("Enter the temperature in fahrenheit:");
		                      fahrenheit = (int) sc.nextDouble();
		                      celsius = (fahrenheit - 32) * 5 / 9;
		                      System.out.println("The temperature is " + celsius + "C for given temperature in "
		                              + fahrenheit + "F");
		                      break;
		        		}
				}
	public static void main(String[] args) 
	{
        double fahrenheit = 0;
        double celsius = 0;
        conversio(fahrenheit,celsius);

	}
}