package com.capgemini.day2;

import java.util.*;
class Dress
{
	private int size;
	private int price;
	private String color;
	private String material;
	
Dress(){}
Dress(int size,int price,String color,String material)
{
	this.size=size;
	this.price=price;
	this.color=color;
	this.material=material;
}

public void setSize(int size) {
	this.size=size;
}
public void setPrice(int price) {
	this.price=price;
}
public void setColor(String color) {
	this.color=color;
}
public void setMaterial(String material ) {
	this.material=material;
}


public int getSize() {
    return this.size;
}
public int getPrice() {
    return this.price;
}
public String getColor() {
    return this.color;
}
public String getMaterial() {
    return this.material;
}

public void printinfo() {
		System.out.println("Size:"+this.size);
		System.out.println("Price:"+this.price);
		System.out.println("Color:"+this.color);
		System.out.println("Material:"+this.material);
	}
}
public class Mystaticpblm {
public static void main(String args[])
{
	Dress dress2=new Dress(44,1500,"Blue","Cotton");
    dress2.printinfo();
    
    Dress dress3 = new Dress();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size:");
    int size=sc.nextInt();
    dress3.setSize(size);
    
    Scanner sc1=new Scanner(System.in);
    System.out.println("Enter price:");
    int price=sc1.nextInt();
    dress3.setPrice(price);
    
    Scanner sc2=new Scanner(System.in);
    System.out.println("Enter color:");
    String color=sc2.next();
    dress3.setColor("color");
    
    Scanner sc3=new Scanner(System.in);
    System.out.println("Enter material:");
    String material=sc3.next();
    dress3.setMaterial("material");
    
    dress3.printinfo();
    
    

    System.out.println("Size " + dress3.getSize());
    System.out.println("Price " + dress3.getPrice());
    System.out.println("Color " + dress3.getColor());
    System.out.println("Material " + dress3.getMaterial());
    
}
}
