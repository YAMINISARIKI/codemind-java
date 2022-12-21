import java.util.*;
class Disk{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int x;
        x=a*b*c*2*512;
        System.out.print(x);
    }
}