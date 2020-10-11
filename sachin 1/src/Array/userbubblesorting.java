package Array;
import java.util.Scanner;
public class userbubblesorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		
		System.out.println("Enter the value in array a");
		for(int i = 0 ; i< n-1; i++ )
		{
          a[i] = sc.nextInt();
		}
       //   for(int j=0; j<n-1; j++)
       //   {
        	  for(int i =0; i<n-1; i++)
        	  {
        		  b[i] = a[n-2-i];
        		 
        		 
        	   }
	    //  }6=
        	  for(int item: b)
        	  {
        		  System.out.print(item+ " ");
        	  }
          
      }
	
}
