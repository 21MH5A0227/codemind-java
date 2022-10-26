import java.util.Scanner;
class L{
    public static int self(int a){
        int d;
        int t;
        t=a;
        while(t!=0){
            d=t%10;
            t=t/10;
            if(d==0 || a%d!=0)
            return 0;
        }
        return 1;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=a;i<=b;i++){
            if(self(i)==1)
            System.out.print(i+" ");
        }
    }
}