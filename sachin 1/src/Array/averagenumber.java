package Array;

import java.util.Scanner;

public class averagenumber {
	public static int averagenumber(int a[],int n) {
	int sum =0;
	int avg = 0;
	for (int i =0 ;i<n ; i++)
	{
     sum = sum + a[i];
     avg = sum/n;
	}
	return avg ;
	//System.out.println("result = "+ sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i =0 ;i<n ; i++)
		{
		 a[i] = sc.nextInt();
	    }
		int result = averagenumber(a,n);
		System.out.println("The average of the two variables are = "+result);
		
		}

}
