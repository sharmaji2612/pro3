
package LOOPS;
import java .util.Scanner;
public class Primenumber {
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbe");
		int a = sc.nextInt();
		int count= 0;
	   for (int i=1; i<=a; i++)
	   {
		  
	   
		if(a%i == 0 )
	   {
			count = count ++;
	   }
	   }
	   
	    if(count==2)
	    {
	    	System.out.println(" prime number");
	    }

	    else 
	    {
	    	System.out.println("not a prime number");
	    }

	}
}
