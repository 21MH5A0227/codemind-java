import java.util.Scanner;
class Main
{
    public static boolean isprime(int n)
    {
        int count=0;
        if(n<2)
        return false;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            count++;
        }
        if(count==0)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n,x[],i,count=0;
        double sum=0;
        n=Sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=Sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(isprime(x[i]))
            {
                sum=sum+x[i];
                count++;
            }
        }
        double average=(sum/count);
        System.out.format("%.2f",average);
    }
}