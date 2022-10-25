import java.util.Scanner;
class P{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        double n=s.nextDouble();
        double[] l=new double[50];
        double r=0.0;
        for(int i=0;i<n;i++){
            l[i]=s.nextDouble();
            r+=l[i];
        }
        System.out.printf("%.2f",(r/n));
    }
}