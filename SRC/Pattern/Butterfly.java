package Pattern;
public class Butterfly
{
    public static void main(String[] args)
    {
        int n = 5;
        //First Upper half
        for(int i=1;i<=n;i++){
            // first part
            for (int j=1;j<=i;j++){
               System.out.print("*");
            }
            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // second half
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Second Lower Half
        for(int i=n; i>=1; i--){
            // first part
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // second half
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
