import java.util.*;
class Area{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double area;
        area=(float)3.14*r*r;
        System.out.format("%.2f",area);
    }
}