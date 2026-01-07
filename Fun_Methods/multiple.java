package Fun_Methods;

import java.util.Scanner;

public class multiple {
    public static int calculator(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("product of two no."+ calculator(a,b));
    }
}
