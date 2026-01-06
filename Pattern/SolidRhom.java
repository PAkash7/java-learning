package Pattern;

public class SolidRhom
{
    public static void main(String[] args)
    {
        int n=5;
        //Solid Rhombus
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
