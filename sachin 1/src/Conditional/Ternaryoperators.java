package Conditional;
import java.util.Scanner;
public class Ternaryoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value in km");
		int a = sc.nextInt();
		//int b = sc.nextInt();
		//int c = sc.nextInt();
		int d = a* 1000;
		int e = d* 100;
		
      
        
    //  int result = a>b ? a>c ? a : c : b>c ? b:c;
        System.out.println("The value in metre is"+d);
        System.out.println("The vaue in cm"+e);
	}

}
