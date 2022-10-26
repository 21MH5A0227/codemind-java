import java.util.Scanner;
class K{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int x=0,t=0,i=2;
        if(a>b){
            x=a;
            a=b;
            b=x;
        }
        t=b;
        while(b%a!=0){
            b=t*i;
            i+=1;
        }
        System.out.println(b);
    }
}