package com.bridgelabz.programs;
import java.util.Scanner;
public class xzxz {

 
 public static void main(String args[]){

Scanner sc= new Scanner(System.in);
System.out.println("enter value");
int a=sc.nextInt();
System.out.println("enter value");
String b=sc.next();
         
        SimpleGen<Integer, String> sample = new SimpleGen<Integer, String>(a, b);
        sample.printTypes();
    }
}
 
class SimpleGen<U, V>{
     
    //type U object reference
    private U objUreff;
    //type V object reference
    private V objVreff;
     
    //constructor to accept object type U and object type V
    public SimpleGen(U objU, V objV){
        this.objUreff = objU;
        this.objVreff = objV;
    }
     
    public void printTypes(){
       System.out.println("add is "+ (Integer.parseInt(objUreff.toString())+Integer.parseInt(objVreff.toString())));
    }
}
//////////////////??????////////////////////????????????????????////////////////
package com.bridgelabz.utility;

import java.util.Scanner;

public class binarysearchtee {

	public static int searchtee(int no)
	{
	
	int counter=0;
	long possiblesearch=0;
	int noofsearch=0;

		if(no==1 || no==0)
		{
			return 1;
			
		}
		else
		{
			while(counter<no)
			{
				counter++;
				possiblesearch=possiblesearch+searchtee((int)counter-1)*searchtee((int)no-counter);
		}
			return  (int) possiblesearch;
		}
			
	
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int no=sc.nextInt();
		searchtee(no);
		System.out.println(searchtee(no));
		
	}
}
