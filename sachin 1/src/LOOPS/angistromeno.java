package LOOPS;
import java.util.Scanner;
public class angistromeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int r =0;
		int Sum = 0;
		System.out.println("Enter the number");
		int a =  sc.nextInt();
        int temp = a;
        while(a>0)
        {
        	r= a % 10;
        	Sum =   Sum +  Math.pow(r, 3);
        	a = a / 10;
        	
        	 }
        if (Sum == r)
        {
        
     System.out.println("Number is angerstonm");
  
	}
        else
        {
        	System.out.println("Not a angistrom");
        }
}
}
