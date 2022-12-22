import java.util.*;
class Car{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if((float)c/a<(float)d/b)
            {
                System.out.println("-1");
            }
            else if((float)c/a==(float)d/b)
            {
               System.out.println("0");
            }
            else
            {
               System.out.println("1");
            }
         }
    }
}