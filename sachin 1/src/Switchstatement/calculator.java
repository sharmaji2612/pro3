package Switchstatement;
import java.util.Scanner;
public class calculator {

	public calculator() {
		// TODO Auto-generated constructor stub
				Scanner sc = new Scanner(System.in);
				double result = 0;
				System.out.println("Enter the first number ");
				double a = sc.nextDouble();
				System.out.println("Enter the second number");
				double b = sc.nextDouble();
				System.out.println("Enter the operation");
				sc.nextLine();
			       char operation = sc.nextLine().charAt(0);
			switch(operation)
				{
					case '+':
						System.out.println("Your answer is");
					System.out.println(a + b);
					break;
				case'-':
					System.out.println("Your answer is");
					System.out.println(a - b);
					break;
				case'*':
					System.out.println("Your answer is");
					System.out.println(a * b);
					break;
				case'/':
					System.out.println("Your answer is");
					System.out.println(a / b);
					break;
				case '@':
					 result = Math.pow(a,b);
					System.out.println(result);
					break;
					
					default:
						System.out.println("invalid number");
				}
				
				
		       
				        
		        		
		        
		        
		        

				
			}
						
			
			






	}


