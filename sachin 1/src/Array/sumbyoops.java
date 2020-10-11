package Array;
import java.util.Scanner;
class summation {
    int x;
    int y;
    int sum = 0;

    public void add() 
    {
        sum = x + y;
        System.out.println("The sum of two numbers are :" + sum);
    }



    public static class sumbyoops{
        public  void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a value");
            int a = sc.nextInt();
            System.out.println("Enter the b value");
            int b = sc.nextInt();
            summation a1 = new summation();
         //   summation a2 = new summation();
            a1.x = a;
            a1.y = b;
            a1.add();

        }
    }
    }
