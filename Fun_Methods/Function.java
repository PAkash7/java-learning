package Fun_Methods;

import java.util.Scanner;

public class Function
{
    public static void MyName(String name){
        System.out.println("My Name is:"+name);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        MyName(name);//calling function

    }
}
