package Pattern;

public class Diomond
{
    public static void main(String[] args)
    {
        int n=4;
        //Upper Half
        for(int i=1;i<=n;i++)
            {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
            System.out.print("*");
            }
            System.out.println();
            }
        // Lower Half
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
