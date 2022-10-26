import java.lang.Math;
import java.util.Scanner;
class K{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        double a=s.nextDouble();
        double t;
        for(int i=0;i<a;i++){
            t=s.nextDouble();
            if(t%(Math.sqrt(t))==0)
            System.out.println("True");
            else
            System.out.println("False");
        }
    }
}