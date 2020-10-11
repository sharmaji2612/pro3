package Array;

import java.util.Scanner;
class cool {
    static int i;
    static int n;
    static int sum = 0;
    static String name;
    public static void mam(int n)
    {
    for(i=0;i<n;i++)
    {
        sum = sum + i;
    }
    System.out.println(name);
  System.out.println(sum);
}
}
public class sum{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the calculation");
         String nm = sc.next();
        System.out.println("Enter the numbeer of elements");
        int n = sc.nextInt();
        cool h1 = new cool();

        h1.name = nm;
        h1.mam(n);


    }
}
