package Conditional;
import java.util.Scanner;
public class Dayinamonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int y = sc.nextInt();
		if (y % 2==0)
		{
		
		System.out.println("Leap year");
		}
		else
		{
		
		 System.out.println("Not a leap year");
		}
		
		System.out.println("Enter the month");
		int n = sc.nextInt();
		int result = 0;
		switch(n)
		{
		case 1:
			System.out.println("January");
			 result = 31;
			break;
		case 2:
			 if(y%2==0)
			 {
				 System.out.println("Feburary");
				 result = 29;
			 }
			 else
			 {
				 System.out.println("Feburary");
				 result = 28;
			 }
			break;
		case 3 :
			System.out.println("March");
	      result = 31;
			break;
		case 4:
			System.out.println("April");
			 result = 30;
			break;
		case 5:
			System.out.println("May");
			result = 31;
			break;
		case 6:
			System.out.println("June");
			result = 30;
			break;
		case 7:
			System.out.println("July");
			result = 31;
			break;
		case 8:
			System.out.println("August");
			result = 31;
			break;
		case 9:
			System.out.println("September");
			result = 30;
			break;
		case 10 :
			System.out.println("October");
			result = 31;
			break;
		case 11:
			System.out.println("November");
			result = 30;
			break;
		case 12:
			System.out.println("December");
			result = 31;
			break;
	 default:
		System.out.println("Invalid month");
		}
			System.out.println("No.of days in "+n+" Month is "+result+" Days");
		

	}

}
