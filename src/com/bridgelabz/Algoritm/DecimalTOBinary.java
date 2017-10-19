/********************************************************************************
	 * Purpose: It Print decimal number to binary number. 
	 *
	 * @author:  jayesh patil
	 * @version: V1.0
	 * @since:   7-8-2017
	 *********************************************************************************/
package com.bridgelabz.Algoritm;
import java.util.Scanner;

import com.bridgelabz.util.utility;

//import javax.sql.rowset.serial.SerialArray;
public class DecimalTOBinary 
	{
	

	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("decimal  number is");
		int number=sc.nextInt();
		utility.DECTOBO(number);
	}

}
