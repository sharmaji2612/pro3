package LOOPS;
import java.util.Scanner;
public class fabonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						Scanner sc = new Scanner(System.in);
				System.out.println("Enter the value of factorial");
			     int n = sc.nextInt();
			     
				int a = 0;
				int b = 1;
				
						
				for (int i=0; i<n-2; i++)
				{
				 
					int c = a +b ;
					
				         a = b;
				         b = c;
				         System.out.print(c+" ");
				
				    
				
				   
				}
			}

		

	}

