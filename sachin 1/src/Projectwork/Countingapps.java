package Projectwork;

import java.util.Scanner;

public class Countingapps  {
	public  static int counting(int n)
	{
	    int sum=0;
		int count=0;
		for(int i=0; i<n; i++)
		{
		 count++;
		}
		return count;
	}
	
	
public static void main(String[]args)
{
	Scanner sc = new Scanner(System.in);
	int n =  sc.nextInt();
	int result = counting(n);
	System.out.println(result);
	
}
}

