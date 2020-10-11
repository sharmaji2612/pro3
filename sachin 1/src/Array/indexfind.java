package Array;

import java.util.Scanner;

public class indexfind {
	public static int indexfind(int a[], int n)
	{
		int pos = -1;
		for(int i=0; i< a.length; i++)
		{
			if (a[i] == n)
			{
		         pos = i;
			}
//			else 
//			{
//	           System.out.println("Number not available");
//	        
//			}
		}	
		return pos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = { 1,2,3,4,5,6,7};
		System.out.println("Enter the number you want to search index number: ");
		int n = sc.nextInt();
		int result = indexfind(a,n);
		System.out.println("The index number is "+result );
		if(result == -1)
		{
    	System.out.println("NOTE: ");
    	System.out.println("If the output is -1 than it means the number is not available ");
		}
		
		

	}

}
