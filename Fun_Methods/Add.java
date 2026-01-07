package Fun_Methods;

import java.util.Scanner;

public class Add
{
    public static int Calculator(int a,int b) {
        int sum = a + b;
        return sum;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = Calculator(a,b);
        System.out.println("Sum of two no." + sum);
    }
}
