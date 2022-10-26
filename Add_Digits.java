import java.util.Scanner;
class L{
    public static int add(int a){
        int d,r=0;
        while(a!=0){
            d=a%10;
            a=a/10;
            r+=d;
        }
        return r;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>9){
            n=add(n);
        }
        System.out.println(n);
    }
}