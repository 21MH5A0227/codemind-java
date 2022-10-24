import java.util.Scanner;
class L{
    public static int prime(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
            c+=1;
        }
        if(c==2)
        return 1;
        else
        return 0;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        int[] l=new int[n];
        for(int i=0;i<n;i++){
            l[i]=s.nextInt();
        }
        //int k=s.nextInt();
        for(int i=0;i<n;i++){
            if(prime(l[i])==1)
            c+=1;
        }
        System.out.println(c);
    }
}