package Conditional;

import java.util.Scanner;


public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

System.out.println("Enter the character");
char ch1=sc.next( ).charAt(0);


if(ch1== 'a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'||ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U')
{
		
		System.out.println("The characters are vowels");		

	}
else {
	System.out.println("Not a vowel");
}
}
}