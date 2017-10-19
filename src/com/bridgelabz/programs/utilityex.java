package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.util.utility;

public class utilityex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size = sc.nextInt();
		int a[] = new int[size];
		int length = a.length;
		System.out.println("ENTER A CHOiCE : ");
		int choice = sc.nextInt();
	

		switch (choice) {
		case 1: {
			utility.binarySearchInt(a);
			break;
		}
		case 2: {
			binarySearchstr(size);
			break;
		}
		case 3: {
			insertionSortInt(a);
			break;
		}
		case 4: {
			insertionSortstr(size);
			break;
		}
		case 5: {
			bubbleSortint(a);
			break;
		}
		case 6: {
			bubbleSortstr(size);
			break;
		}

		}

	
		// TODO Auto-generated method stub

	}

}
