import java.util.*;
class print
{
    public static void main(String args[])
    {
        int n;
        int k=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                System.out.print(k);
                System.out.print(" ");
            }
            k++;
            System.out.println();
        }
    }
}