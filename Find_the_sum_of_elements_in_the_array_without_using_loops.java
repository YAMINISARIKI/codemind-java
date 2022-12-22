import java.util.*;
class Check{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int sum=0;
        int a[]=new int[100];
        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++)
        {
            sum+=a[i];
        }
        System.out.println(sum);
    }
}