import java.util.*;
class Area{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double s,x,area;
        s=(float)(a+b+c)/2;
        x=s*(s-a)*(s-b)*(s-c);
        area=Math.sqrt(x);
        System.out.format("%.2f",area);
    }
}