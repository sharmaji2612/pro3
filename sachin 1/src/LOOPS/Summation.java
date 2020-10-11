package LOOPS;
import java.util.Scanner;
public class Summation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int  n  = sc.nextInt();
		double sum = 0;
		for(double i=1; i<=n; i++)
		{
			sum = sum - ( Math.pow(-1, i) * 1/i) ;
		}
	
			System.out.println("The output will be"+sum);
	}
	

}
