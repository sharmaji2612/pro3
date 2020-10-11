package Array;

import java.util.Scanner;

public class specificvalue {
	public static String specificvalue(int a[],int n)
	{ 
		char Available ;
	    String sum = null ;
		char NotAvailable;
		for (int i=0; i<a.length; i++)
		{
			if(a[i] == n)
			{
			 sum = "Available";
			}
			
		}
          return sum;
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of index number:");
		int m = sc.nextInt();
		int a[] = new int[m];
		System.out.println("Enter the numbers in "+m+" numbers in  array a:");
		for(int i=0; i<m; i++)
		{
		//int a[] = { 2013,2014,2015,2016,2017,2018,2019,2020};
		 a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the number you want to find");
		int n = sc.nextInt();
		
		String result = specificvalue(a,m);
		
		System.out.println("The number is = "+ result);
		}

}
