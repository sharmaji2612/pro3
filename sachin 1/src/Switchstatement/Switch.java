package Switchstatement;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dayofweek = sc.nextInt();
		
		switch(dayofweek)
		{
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
				default:
					System.out.println("I don't no!");
					break;
		}

	}

}
