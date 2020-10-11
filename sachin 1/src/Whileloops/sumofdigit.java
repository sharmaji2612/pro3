package Whileloops;
import java.util.Scanner;
public class sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum  = 0;
		int temp = n;
		while (temp >0)
		{
			int a = temp % 10;
			
		
			sum += a;
			
			temp /=10 ;
			System.out.println(a+ " " +temp+ " " +sum);
		}
		System.out.print("The sum of the numbers " +n +  "is" +sum);
		
	

	}

}
