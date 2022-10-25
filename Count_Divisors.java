import java.util.Scanner;
class L{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int c=0;
        for(int i=n1;i<=n2;i++){
            if(i%n3==0)
            c+=1;
        }
        System.out.print(c);
    }
}