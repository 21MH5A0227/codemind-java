import java.util.Scanner;
class L{
    public static int pal(int n){
        int t,r=0,d;
        t=n;
        while(n !=0){
            d=n%10;
            n=n/10;
            r=(r*10)+d;
        }
        if(r==t)
        return 1;
        else
        return 0;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=a;i<=b;i++){
            if(pal(i)==1)
            System.out.print(i+" ");
        }
    }
}