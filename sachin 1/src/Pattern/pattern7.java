package Pattern;
import java.util.Scanner;
public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sk = 1;
		for(int i=1; i<=n; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(sk+" ");
				sk++;
			}
			
			System.out.println(" ");
		}

	}

}
