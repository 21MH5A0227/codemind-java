import java.lang.Math;
import java.util.Scanner;
class L{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        double n1=s.nextDouble();
        double n2=s.nextDouble();
        double n3=s.nextDouble();
        double t;
        t=Math.pow(n1,n2);
        System.out.printf("%.0f",t%n3);
    }
}