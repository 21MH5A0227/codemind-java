import java.lang.Math;
import java.util.Scanner;
class K{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r=0;
        for(int i=1;i<n;i++){
            if(n%i==0)
            r+=i;
        }
        if(r==n)
        System.out.println("True");
        else
        System.out.println("False");
    }
}