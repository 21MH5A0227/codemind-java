import java.util.Scanner;
class Main
{
    public static int sodigits(int n)
    {
        int sum=0,d;
        while(n>0||n<0)
        {
            d=n%10;
            n=n/10;
            sum=sum*10+d;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n,res;
        n=Sc.nextInt();
        res=sodigits(n);
        if(n==res)
        System.out.println("2");
        else
        System.out.println("1");
    }
}