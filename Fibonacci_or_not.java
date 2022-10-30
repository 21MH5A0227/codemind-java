import java.util.Scanner;
class D{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        int b=1;
        int c=0;
        int f=0;
        while(c<n){
            c=a+b;
            if(c==n)
            {
                f=1;
                break;
            }
            else
            {
                a=b;
                b=c;
            }
            
        }
        if(n==0 || f==1)
        System.out.println("True");
        else
        System.out.println("False");
    }
}