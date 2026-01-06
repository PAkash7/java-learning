package Pattern;

public class PalinPat
{
    public static void main(String[] args)
    {
        int n =5;
        for (int i = 1; i<=n; i++)
        {
            //Spaces
            for (int j=1;j<=n-i; j++)
            {
                System.out.print(" ");
            }
            //First half
            for (int j=i; j>=1; j--)
            {
                System.out.print(j);
            }
            //Second half
            for (int j=2; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
