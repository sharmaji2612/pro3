package Pattern;
import java.util.Scanner;
public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		for(int i=0; i<n; i+=2)
		{
		for(int j=n+1; j>=n-i; j-=3)
		{
			System.out.print("* ");
		}
		System.out.println();

	
		}
		}

}
