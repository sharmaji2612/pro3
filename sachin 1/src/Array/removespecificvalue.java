package Array;

import java.util.Scanner;

public class removespecificvalue {
	//public static void removespecificvalue(int a[], int n)
//	{
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc = new Scanner(System.in);
      int a[] = {1,2,3,4,5,6,7,8,9};
      System.out.println("Enter the value you want to remove");
      int n = sc.nextInt();
		// int b[] = new int[a.length];
		for(int i=0; i<a.length; i++)
		{   
			if(a[i] == n)
			{
				sum =i;
				
			}
		}
		for(int i=0 ; i<a.length; i++)
		{
			if(i == sum)
			{
				continue;
			}
			System.out.print(+a[i] +" ");
		}

	}
	}

