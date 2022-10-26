import java.util.Scanner;
class K{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int t=0,f=0;
        for(int i=1;i<a;i++){
            for(int j=i+1;j<a;j++){
                if(i*j==a)
                f=1;
                break;
            }
        }
        if(f==1)
        System.out.println("YES");
        else
        System.out.println("NO");
    }
}