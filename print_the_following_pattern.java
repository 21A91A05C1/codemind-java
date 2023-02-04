import java.util.*;
class print{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        for(int i= 1; i <= n ; i++)
        {
            for(int j = 0 ;j<i ;j++)
            {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}