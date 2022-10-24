import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int n,x[],i;
        n=Sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=Sc.nextInt();
        for(i=0;i<n-1;i++)
        {
            if(x[i]>=x[i+1])
            {
                System.out.println("no");
                System.exit(0);
            }
        }
        System.out.println("yes");
    }
}