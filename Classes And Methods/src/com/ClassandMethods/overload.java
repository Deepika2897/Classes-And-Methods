package com.ClassandMethods;

public class overload {

	
		void series(int x, int n)
		{
			double s=0;
			for(int i=1;i<=n;i++)
			{
				s=s+Math.pow(x,i);
			}
			System.out.print("sum="+s);
		}
		void series(int p)
		{
			//1,8,27.64....
			//1-1,8-1,64-1.....
			for(int i=1;i<=p;i++)
			{
				int t=0;
				t=(i*i*i)-1;
				System.out.println(t+" ");
			}
		}
			
			void series()
			{
				double s=0;
				for(int i=2;i<=10;i++)
				{
					s=s+((double)1/i);
				}
				System.out.println("sum="+s);
			}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		overload ob=new overload();
		ob.series(8);
		ob.series();
		ob.series(2,5);
		


	}

}
