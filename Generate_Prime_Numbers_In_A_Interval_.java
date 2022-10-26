import java.util.Scanner;
class L{
    public static int prime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
            c+=1;
        }
        if(c==2)
        return 1;
        else
        return 0;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=a;i<=b;i++){
            if(prime(i)==1)
            System.out.println(i);
        }
    }
}