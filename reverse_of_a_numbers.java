import java.util.Scanner;
class S{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d;
        while(n!=0){
            d=n%10;
            n=n/10;
            System.out.print(d);
        }
    }
}