import java.util.Scanner;
class L{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a,b;
        for(int i=0;i<n;i++){
            a=s.nextInt();
            b=s.nextInt();
            System.out.println(a+b);
        }
    }
}