import java.util.*;
class print{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i = 0 ; i <n ; i++)
        {
            for (int j = 0; j <n-i ; j++)
            {
                System.out.print(j+1);
            }
            System.out.println();
        }
        
    }
}