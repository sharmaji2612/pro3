package Array;

import java.util.Scanner;

public class substractionfmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimension: ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		
		int a[][] = new int[row][col];
		int b[][] = new int[row][col];
		
		System.out.println("Enter the array a");
		for(int i=0; i<row ; i++)
		{
			for(int j=0; j<col; j++)
			{
				 a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the array b");
		for(int i=0; i<row ; i++)
		{
			for(int j=0; j<col; j++)
			{
				 b[i][j] = sc.nextInt();
			}
		}
		
			int c[][] = new int[row][col];
		for(int i=0; i<row ; i++)
		{
			for(int j=0; j<col; j++)
			{
				c[i][j] = a[i][j] - b[i][j] ;
			}
		}
		System.out.println("The result is " );
		for(int i=0; i<row ; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(c[i][j]+"");
		}
		
         System.out.println();
	}

	}
}
