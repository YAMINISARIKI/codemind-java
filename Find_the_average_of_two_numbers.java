import java.util.*;
class Average{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c;
        c=(float)(a+b)/2;
        System.out.format("%.4f",c);
    }
}