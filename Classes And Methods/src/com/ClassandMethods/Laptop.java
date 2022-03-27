package com.ClassandMethods;

public class Laptop {
	   
		//state(variables)
		int id;
		String brandname;
		int cost;
		String shopname;
		String colour;
		
		//constructor: used to initialize an object(state)
		public Laptop() 
		{
			id = 87867;
			brandname = "DELL";
			cost = 45678;
			shopname = "Poorvika";
			colour="black";
		}
		
		//behavior(methods)
		public void getLaptopDetails()
		{
			System.out.println(id);
			System.out.println(brandname);
			System.out.println(cost);
			System.out.println(shopname);
			System.out.println("colour");
		}
		
		public static void main( String[] args )
	    {
			
			Laptop Laptop1 = new Laptop();		
			
			Laptop1.getLaptopDetails();
			
			
	    }

	}


