import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n,x[],i,k,count=0;
        n=Sc.nextInt();
        x=new int[n];
        k=Sc.nextInt();
        for(i=0;i<n;i++)
        x[i]=Sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(x[i]%k==0)
            count++;
        }
        System.out.println(count);
    }
}