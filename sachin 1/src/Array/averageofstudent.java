package Array;

import java.util.Scanner;

public class averageofstudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("En.nextInt();
		int avg = 0;ter the number of student");
		int n = sc
		System.out.println("Enter the marks");
		int[] a = new int[n];
		
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		
			for(int i=0 ; i<n; i++) {
			avg+=a[i];
			}
			avg/= n;
			System.out.println("The average of students are"+avg);
			
			
		
	}
}
