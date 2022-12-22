import java.util.*;
class Hand{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int s;
        s=(int)((a*(a-1))/2);
        System.out.print(s);
    }
}