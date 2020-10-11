package Array;
import java.util.Scanner;
public class linearssearch {
    public String search(int key) {
        int i;
        String  number = null;
        int[] a = new int[11];
        for (i = 0; i < 11; i++)
        {
            if (key == a[i])
            {
                number = "Found";
            }
            else
            {
                number = "Not found";
            }

        }
        return  number;
    }
    public void main ( String[] args)
    {
        int[] a = { 10,12,1,4,5,6,8,9,34,56,54,};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search");
        int key = sc.nextInt();
        String result = search(key);
        System.out.println("result");


    }
}
