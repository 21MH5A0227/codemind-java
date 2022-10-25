import java.util.Scanner;
class L{
    public static int sm(int a){
    int p=1;
    for(int i=1;i<=a;i++){
        p=p*i;
    }
    return p;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t,x;
        for(int i=0;i<n;i++){
            t=s.nextInt();
            x=sm(t);
            System.out.println(x);
        }
    }
}