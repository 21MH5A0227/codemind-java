import java.util.Scanner;
class L{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,d,r=0;
        n=sc.nextInt();
        int t=n;
        while(n!=0){
            d=n%10;
            n=n/10;
            r=(r*10)+d;
        }
        if(r==t)
        System.out.print("True");
        else
        System.out.print("False");
    }
}