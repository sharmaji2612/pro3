import java.util.Scanner;
class Hero {
    public String search(int key) {
        int i;
        String number = null;
        //  int[] a = new int[11];
        int[] a = {10, 12, 1, 4, 5, 6, 8, 9, 34, 56, 54,};
        for (i = 0; i < 11; i++) {
            if (key == a[i]) {
                number = "Found";
            } else {
                number = "Not found";
            }
        }
return number;
    }

public class search {
    public   void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search");
        int key = sc.nextInt();
        Hero h1 = new Hero();
        h1.search(key);
        char[] number = null;
		System.out.println( number);
    }

    }
}

