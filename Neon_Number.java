import java.util.Scanner;
class L{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int p=1,r=0,d,t;
        t=n*n;
        while(t!=0){
            d=t%10;
            t=t/10;
            r+=d;
        }
        if(r==n)
        System.out.println("Neon Number");
        else
        System.out.println("Not Neon Number");
    }
}