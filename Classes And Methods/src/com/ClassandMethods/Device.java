package com.ClassandMethods;

import java.util.Scanner;

public class Device {
	int id;
	String brandname;
	String shopname;
	String ram;
	String rom;
	int cost;

public Device()
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the laptop id:");
	id=scanner.nextInt();
	System.out.println("Enter laptop brand:");
	brandname=scanner.next();
	System.out.println("Enter laptop cost=");
	cost=scanner.nextInt();
	System.out.println("Enter  ram=");
	ram=scanner.next();
	System.out.println("Enter rom=");
	rom=scanner.next();
	scanner.close();
}


public void getDeviceDetails()
{
	System.out.println("Value you entered is:");
	System.out.println("id="+id);
	System.out.println("brandname="+brandname);
	System.out.println("shopname="+shopname);
	System.out.println("ram="+ram);
	System.out.println("rom="+rom);
	System.out.println("cost="+cost);
	}

public static void main(String[] args )
{
	Device obj1=new Device();
	obj1.getDeviceDetails();
}

}
	

	

	
	


