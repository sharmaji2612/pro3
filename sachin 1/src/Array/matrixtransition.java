package Array;
import java.util.Scanner;

public class matrixtransition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimensions:");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int a[][] = new int[row][col];
		int b[][] = new int[row][col];
		
		System.out.println("Enter the value in array a:");
		for(int i=0 ; i<row ; i++)
		{
			for(int j =0; j<col; j++)
			{
				 a[i][j] = sc.nextInt();
;			}
		}
//		for(int i=0 ; i<row; i++)
//		{
//			for(int j =0; j<col; j++)
//			{
//				b[j][i]  = a[i][j];
//;			}
//		}
		System.out.println("The new transition matrix is");
		for(int i=0 ; i<row; i++)
		{
			for(int j =0; j<col; j++)
			{
				 System.out.print(a[j][i]+" " );
;			}
			System.out.println();
		}
}
}
