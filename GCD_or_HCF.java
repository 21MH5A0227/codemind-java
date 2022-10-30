import java.util.Scanner;
class T{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int x;
        int t=0;
        if(a>b){
            x=a;
            a=b;
            b=x;
        }
        for(int i=1;i<=b;i++){
            if(a%i==0 && b%i==0)
            t=i;
        }
        System.out.println(t);
    }
}