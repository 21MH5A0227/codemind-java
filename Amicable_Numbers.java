import java.util.Scanner;
class K{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int r=0;
        for(int i=1;i<a;i++){
            if(a%i==0)
            r+=i;
        }
        if(r==b)
        System.out.println("Amicable");
        else
        System.out.println("Not Amicable");
    }
}
        