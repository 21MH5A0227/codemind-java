import java.util.Scanner;
class L{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int d,ec=0,oc=0;
        while(n != 0){
            d=n%10;
            n=n/10;
            if(d%2==0)
            ec+=1;
            else
            oc+=1;
        }
        if(ec==0)
        System.out.print("Odd");
        else if(oc==0)
        System.out.print("Even");
        else
        System.out.print("Mixed");
    }
}