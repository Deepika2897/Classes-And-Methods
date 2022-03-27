package com.ClassandMethods;


public class Customer 
{

		//state(variables)
		int id;
		String name;
		String phonenumber;
		String address;
		String productname;
		
		//constructor: used to initialize an object(state)
		public Customer() 
		{
			id= 2378;
			name = "Deepika";
			phonenumber="9976786776";
			address = "Pune";
			productname="fridge";
		}
		
		//behavior(methods)
		public void getcustomerdetails()
		{
			System.out.println(id);
			System.out.println(name);
			System.out.println(phonenumber);
			System.out.println(address);
			System.out.println(productname);
		}
		
		public static void main(String[] args)
	    {
			
			Customer customer1 = new Customer();		
			
			customer1.getcustomerdetails();
			
			
	    }
		
}
