package com.bridgelabz.util;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class utility 
{
	private static final int[] Array = null;
	//Method of binarySearchInteger
	static int i, min, max, mid, a[];
	static Scanner sc = new Scanner(System.in);

	public static void binarySearchInt(int[] a) {
		System.out.println("Enter values");
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		Arrays.sort(a);
		System.out.println("sort array is");
		for (i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		int val = sc.nextInt();
		System.out.println("ENTER CASE: ");

		min = 0;
		max = a.length - 1;
		mid = a.length / 2;
		while (min <= max) {

			if (a[mid] == val) {
				System.out.println("value found at index " + mid);
				return;
			} else if (a[mid] > val) {
				max = mid - 1;
				mid = (min + max) / 2;
			} else if (a[mid] < val) {
				min = mid + 1;
				mid = (min + max) / 2;
			}
		}
	}

	//Method for binarySearch for string
	public static void binarySearchstr(int size) {
		String Ab[] = new String[size];
		System.out.println("enter element");
		for (i = 0; i < size; i++) {
			Ab[i] = sc.nextLine();
		}
		Arrays.sort(Ab);
		System.out.println("After sort");
		for (i = 0; i < Ab.length; i++) {
			System.out.println(Ab[i]);

		}
		Arrays.sort(Ab);

		System.out.print("enter char");

		String ch = sc.next();

		Arrays.sort(Ab);
		min = 0;
		max = Ab.length - 1;
		mid = Ab.length / 2;

		while (min <= max) {

			if (Ab[mid].compareTo(ch) == 0) {
				System.out.println("value found at index " + mid);
				

			} 
			else if (Ab[mid].compareTo(ch) > 0) {
				max = mid - 1;
				mid = (min + max) / 2;
			} else {
				min = mid + 1;
				mid = (min + max) / 2;
			}
		}
	}

	//Method for insertionSort for string
	public static void insertionSortstr(int size) {

		String temp1;

		String Ab[] = new String[size];
		System.out.println("enter element");
		for (i = 0; i < size; i++) {
			Ab[i] = sc.nextLine();
		}

		for (int i = 1; i < Ab.length; i++) {
			for (int j = i; j > 0; j--) {
				if (Ab[j].compareTo(Ab[j - 1]) < 0) {
					temp1 = Ab[j];
					Ab[j] = Ab[j - 1];
					Ab[j - 1] = temp1;
				}
			}

		}
		System.out.println("sort string is");
		for (int i = 0; i < Ab.length; i++) {
			System.out.println(Ab[i]);
		}
	}

	//Method forb insertionSort Integer
	public static void insertionSortInt(int a[]) {
		int temp1;
		System.out.println("Enter values");
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();

		}
		for (int i = 1; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					temp1 = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp1;
				}
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
//Method of bubbleSortint for Integer
	public static void booblsort(int a[],int size) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < size; i++) {	
			a[i] = sc.nextInt();

		}
		System.out.println("befour sortin");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				if (a[j - 1] > a[j]) {
					// swap elements
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("array after sort");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
// Method for bubbleSortstr for String
	public static void bubbleSortstr(int size) {
		String temp1;

		String Ab[] = new String[size];
		System.out.println("enter element");
		for (i = 0; i < size; i++) {
			Ab[i] = sc.nextLine();
		}
		String temp;
		for (int i = 0; i < Ab.length; i++) {
			for (int j = 1; j < Ab.length; j++) {
				if (Ab[j - 1].compareTo(Ab[j]) > 0) {
					// swap elements
					temp = Ab[j - 1];
					Ab[j - 1] = Ab[j];
					Ab[j] = temp;
				}
			}
		}

		System.out.println("array after sort");
		for (int i = 0; i < Ab.length; i++) {
			System.out.println(Ab[i]);
		}
	}

	

//Method for Swapnibble
	public static void swapNibble(int number) {
		String str="";
		 char B;
		 char A,temp;
		
			
			while(number!=0)
			{	
				int reminder = number%2;
				str=reminder+str;
				
				number=number/2;
				
			}
			System.out.println("valu of decimal in binary : "+str);
			int length=str.length();
			System.out.println(length);
			
			while(length<8)
			{
				
				 str=0+str;
				 length=str.length();
		
	
		}
			System.out.println("after padding : "+str);
			int length1=str.length();
			System.out.println(length1);
			char[] ch=str.toCharArray();
			for(int i=0;i<ch.length/2;i++)
		{
				temp=ch[i];
				ch[i]=ch[i+4];
				ch[4+i]=temp;
		}
		for(int i = 0;i<8;i++)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		String str2 = new String(ch);
		int j=0;
		double res=0.0;
		for(int i=str2.length()-1;i>=0;i--)
		{
			if(str2.charAt(i)=='1')
			{
				res = res+(Math.pow(2, j));
			}
			j++;
		}
		System.out.println("Decimal value : "+(int)(res));
	}
//Method fo conversion form Fahrenheit to clesius 
		public static void Conversion(double fahrenheit, double celsius) 
		{
			String t;
			Scanner sc = new Scanner(System.in);
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

		//Method to cheack prime number with in a perticular rang
		  public static void primecheacker( int a, int b)
		 	{
		
		         for(int i=a;i<=b;i++)
		 		{
		             int counter = 0;
		             for(int j=2;j<=i/2;j++){
		                 if(i%j==0)
		                 counter++;
		             }
		             if(counter==0&&i!=0&&i!=1)/* if counter is equal to 0 then its prime number*/
		 			{
		                 System.out.println(i+" ");
		              
		             }
		         }
		     }
		  public static void ATm1(int a[],int Amount)
			{	
			  
			int i,Value=0,Count1=0,Count2=0,count3=0,count4=0,Count5=0,Count6=0,Count7=0,Count8=0,Count9=0;
			int length = a.length;
			while(Amount!=0)
			{
				for(i=length-1;i>=0;)
				{
					if(Amount>=a[i])
					{
						Amount=Amount-a[i];
						Array[i]=Value++;
//						System.out.println(a[i]);
//						if(a[i]==1000)
//						{
//							Count1++;
//						}
//						if(a[i]==500)
//						{
//							Count2++;
//						}
//						if(a[i]==100)
//						{
//							count3++;
//						}
//						if(a[i]==50)
//						{
//							count3++;
//						}
//						if(a[i]==20)
//						{
//							Count5++;
//						}
//						if(a[i]==10)
//						{
//							Count6++;
//						}
//						if(a[i]==5)
//						{
//							Count7++;
//						}
//						if(a[i]==2)
//						{
//							Count8++;
//						}
//						if(a[i]==1)
//						{
//							Count9++;
//						}
//					
						}
					
					else
					{
						i--;
					}
					}		
				}
			for(i=length-1;i>=0;)
			{
			System.out.println("number of"+a[i]+" notes"+Array[i]);
			}
			}
			public static void mPayment(double principle, double year, double rate) 
			{
				 
				double n, r, payment;
				r = (rate / (12 * 100)); 
				System.out.println(r);
				n = 12 * year; 
				System.out.println(n);
				payment = (principle * r) / (1 - Math.pow(1 + r, (-n))); 
													
				System.out.println("monthly payment=" + payment + "rs"); 
			}
			//Method to guess number
			public static void guess(int lowernumber,int highernumber)

			{
				if(lowernumber<highernumber)
				{
				while(lowernumber!=highernumber)
					{
					int mid=(lowernumber+highernumber)/2;
					if(lowernumber==mid || mid==highernumber)
					{   String condition=sc.next();
						if(condition.equals("yes"))
						{
						System.out.println("your value is"+lowernumber);
						break;
						}
						else
							{
							System.out.println("your valu is"+highernumber);
							}
					}
					else
					{
						System.out.println("is your no is between"+lowernumber+" "+mid);			   
						String str=sc.next();
						   	if(str.equals("yes"))
							{
							highernumber=mid;
							if(lowernumber!=highernumber)
							System.out.println("is your value is bertween"+lowernumber+"&"+highernumber);
											
							}
							else
							{
							lowernumber=mid;
							if(lowernumber!=highernumber)
								System.out.println("your valu is between"+lowernumber+ "&"+highernumber);
							
							}
					}
					}}else
					{
						System.out.println("enter higher number which is greater than lowernumber");
					}
			}
			//Method for conversion of binary to decimal
			public static void DECTOBO(int number) 	
			{
				String str = "";
				System.out.println("Binary number is");
				while(number!=0)
				{	
					int reminder = number%2;
					str=reminder+str;
					
					
					number=number/2;
					
				}System.out.println(str);
			
			}
			//Method to 
			 public static void DAYOFWEEK(int day, int month, int year)
				{
		
				int y0 = year - (14 - month) / 12;
				int x = y0 + y0/4 - y0/100 + y0/400;
				int m0 = month + 12 * ((14 - month) / 12) -2;
				int d0 = (day + x + ((31 * m0) / 12)) % 7;

				switch (d0){
					case 0: System.out.println("SUNDAY");
	                    break;
					case 1: System.out.println("Monday");
	                    break;
					case 2: System.out.println("TUESDAY");
	                    break;
					case 3: System.out.println("WEDNESDAY");
	                    break;
					case 4: System.out.println("THURSDAY");
	                    break;
					case 5: System.out.println("FRIDAY");
	                    break;
					case 7: System.out.println("SATURDAY");
	                    break;
	        }
	        }
			static int day,year,month;
			static String dayName;
			static int x,y1,m1,d1;
			
			/* this method takes day month and year from user and calculates which day falls of
			 * the week Returns 0 for Sunday, 1 for Monday, and so on */
			public static int day(int day,int month,int year){
				y1=year-(14-month)/12;
				x=y1+y1/4-y1/100+y1/400;
				m1=month+12*((14-month)/12)-2;
				d1=(day+x+(31*m1)/12)%7;
				return d1;
			}
			
			/* this method returns true if the given year is a leap year */
			public static boolean isLeapYear(int year) {
		        if  ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) return true;
		        return false;
		    }
				
			/* this method will find day of month*/
			public static String dayOfWeek1(int day,int month,int year){
				d1=day(day,month,year);
				switch(d1){
					case 0:dayName="Day of the week is Sunday ";
					break;
					case 1:dayName="Day of the week is Monday " ;
					break;
					case 2:dayName="Day of the week is Tuesday " ;
					break;
					case 3:dayName="Day of the week is Wednesday" ;
					break;
					case 4:dayName="Day of the week is Thursday " ;
					break;
					case 5:dayName="Day of the week is Friday " ;
					break;
					case 6:dayName="Day of the week is Saturday " ;
					break;booblsort
				}	
				return dayName;
			}
			
		
	
			public static void displayCalender(int month,int year)
			{
			
				String[] months = {"", "January", "February", "March","April", "May", "June",
									"July", "August", "September","October", "November", "December"};
		
				int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
				//29 days in feb month if year is leap year
				if (month == 2 && isLeapYear(year)) 
					days[month] = 29;
				
				System.out.println(" " + months[month] + " " + year+"\n");
		        System.out.println(" S\tM\tTu\tW\tTh\tF\tS");
				int startingDay = day(1, month, year);
				for (int i = 0; i < startingDay; i++)
				{
		            System.out.print("\t");
				}
				for (int i = 1; i <= days[month]; i++) {
		            System.out.print(i+"\t");
		            if (((i + startingDay) % 7 == 0) || (i == days[month])) 
					System.out.println();
		        }
			
			}
			public static void SQur(double c,double t)
			{
	        double epsilon = 1e-15;
	        while(Math.abs(t - c / t) > epsilon * t)
	        {
	            t = (c / t + t) / 2;
	        }
	        System.out.println(t);
	    }
	
			
}			

	

