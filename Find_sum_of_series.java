import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,i;
        float sum=0;
        Scanner Sc=new Scanner(System.in);
        n=Sc.nextInt();
        
        for(i=1;i<=n;i++)
          {
              sum=sum+(float)1/i;
          }
          System.out.format("%.2f",sum);
    }
}