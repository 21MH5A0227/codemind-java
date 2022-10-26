import java.util.Scanner;
class L{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int p=1,r=0,d;
        while(n!=0){
            d=n%10;
            n=n/10;
            p=p*d;
            r+=d;
        }
        System.out.println(p-r);
    }
}