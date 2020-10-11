package LOOPS;
import java.util.Scanner;
public class pallindromeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to reverse");
		int a = sc.nextInt();
		int r =0;
		int rev =0 ;
		int temp = a;
		while(a>0)
		{
			r= a % 10 ;
			rev = (rev *10) +r ;
			a = a/10;
			
		}
		
		if(rev==temp)
		{
			System.out.println("Number  is pallendrome");
		}
		else
		{
			System.out.println("Not a pallindrome ");
		}
		
		
				

	}

}
