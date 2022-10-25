import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    double p=sc.nextDouble();
    double r=sc.nextDouble();
    double t=sc.nextDouble();
    double rr=0.0;
    rr=p*(Math.pow((1+r/100),t));
    System.out.printf("%.2f",rr);
    } 
}