/*create a  Book fair program by using the given commands.,,create class name,constructor,methods*/
package com.ClassandMethods;

public class BookFair {
	
	String Bookname;
	
	double origprice;
	double dis;
	double priceafterdis;
	
	//constructor: used to initialize an object(state)
	public BookFair() 
	{
		Bookname="Programming with java";
		origprice=450;
		
	}
		
		
		
	//behavior(methods)
	public void input()
	{
		
		System.out.println(Bookname);
		System.out.println(origprice);
		
		
	}
	 public void calculate()
	 {
		
		if(origprice<=1000) 
		{
			dis=(origprice*2)/100;//dis
			System.out.println("your discount  amount will be:"+dis);
		}
		else if(origprice>1000 && origprice<=3000)
		{
			dis=(origprice*10)/100;
			System.out.println("your discount amount will be :"+dis);
		}
		else if(origprice>3000)
		{
			dis=(origprice*15)/100;
			System.out.println("Your discount amount will be :"+dis);
		}
		
	 }
	 
	 public void display()
	 {
		 priceafterdis=origprice-dis;
		 System.out.println("Bookname:"+Bookname);
		 System.out.println("origPrice:"+origprice);
		 System.out.println("priceafterdis:"+priceafterdis);
	 }	
	 
	 
	 public static void main(String[] args)
{
		 BookFair bf=new BookFair();
		 bf.input();
		 bf.calculate();
		 bf.display();

}
}


