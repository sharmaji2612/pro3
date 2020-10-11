package Projectwork;
import java.util.Scanner;
public class signin {
	public static String Status(int a , int b)
	{
		if(a == b)
		{
			return "Password match";
		}
		else
		{
			return "Not match";
		}
		
	
		
	}
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Username");
		String n = sc.next();
		System.out.println("Enter the password");
		int a = sc.nextInt();
		System.out.println("Reentered the password");
		int b = sc.nextInt();
		String result = Status(a,b);
		System.out.println(result);
				
		
		
	
		
	}

}
