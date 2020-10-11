package inheritance;

import java.util.Scanner;

public class Grandparent{
	public static void main (String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println ("Enter the name of the student");
		String name = sc.next();
		System.out.println("Enter Your CGPA of your final term : ");
		int Num = sc.nextInt();
		String x;
		
		
		parent n = new parent();
		n.name =  name;
		n.Num = Num;
		n.CSE();
		n.Code();
		n.St();
		x=n.S;
		
		
		child1 c = new child1();
		c.name = name;
		c.Num = Num;
		
		c.Student();

		Branchalloted B = new Branchalloted();
		B.name = name;
		B.Num =  Num;
	//	x =B.S;
		B.S = x;
	//	B.St();
		B.change();
		
		
		
		
		profile f = new  profile();
		f.name = name;
		f.Num = Num;
		f.S = x;
		f.file();
		
		
		
	}
}