package com.capgemini.day2;

import java.util.*;
public class Mystaticproblem {
	public static void main(String args[])
	{
	int a[]=new int[5];
	Boolean b[]=new Boolean[5];
	float c[]=new float[5];
	    Scanner sc=new Scanner(System.in);
	    //array to get integer
	    for(int i=0;i<5;i++) {
	    System.out.println("Enter value of: "+i);
	    a[i]=sc.nextInt();
	   
	    }
	    for(int i=0;i<5;i++)
	    {
	    System.out.println("The numbers are"+a[i]);
	    }
	   
	    //array to get boolean
	    for(int j=0;j<5;j++) {
	    System.out.println("Enter value of Boolean: "+j);
	    b[j]=sc.nextBoolean();
	   
	    }
	    for(int j=0;j<5;j++)
	    {
	    System.out.println("The boolean values are:"+b[j]);
	    }
	   
	    //array to get float
	    for(int j=0;j<5;j++) {
	    System.out.println("Enter value of float: "+j);
	    c[j]=sc.nextFloat();
	   
	    }
	   
	    for(int j=0;j<5;j++)
	    {
	    System.out.println("The float values are:"+c[j]);
	    }
}
}