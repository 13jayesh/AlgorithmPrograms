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
