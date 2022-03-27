package com.ClassandMethods;



public class ShowRoom {
	
			
		String customername;
		long mobno;
		double cost;
		double dis;
		double amount;
	
		//constructor: used to initialize an object(state)
		public ShowRoom() 
		{
			customername="Deepika";
			mobno=9788810402l;
			cost=20000;
		}
			
		
			
			
			
		//behavior(methods)
		public void input()
		{
			
			System.out.println(customername);
			System.out.println(mobno);
			System.out.println(cost);
			
		}
		 public void calculate()
		 {
			
			if(cost<=10000) 
			{
				dis=(cost*5)/100;//dis
				System.out.println("your discount  amount will be:");
			}
			else if(cost>10000 && cost<=20000)
			{
				dis=(cost*10)/100;
				System.out.println("your discount amount will be :"+dis);
			}
			else if(cost>20000 && cost<=35000)
			{
				dis=(cost*15)/100;
				System.out.println("Your discount amount will be :"+dis);
			}
			else if(cost>35000)
			{
				dis=(cost*20)/100;
				System.out.println("your discount amount will be :"+dis);
			}
		 }
		 
		 public void display()
		 {
			 amount=cost-dis;
			 System.out.println("customername:"+customername);
			 System.out.println("mobno:"+mobno);
			 System.out.println("amount to be paid after discout:"+amount);
			 
		 }	
		 
		 
		 public static void main(String[] args)
{
	ShowRoom sr = new ShowRoom();
	sr.input();
    sr.calculate();
    sr.display();
}
}
