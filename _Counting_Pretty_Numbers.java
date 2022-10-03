import java.util.*;
class sowmya
{
    public static int pretty(int n)
    {
        int d=n%10;
        if(d==2 || d==3 ||d==9)
        {
            return 1;
        }
        return 0;
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=0;
            for(int i=a;i<=b;i++)
            {
                if(pretty(i)==1)
                {
                    c=c+1;
                }
            }
            System.out.println(c);
            t-=1;
        }
    }
}