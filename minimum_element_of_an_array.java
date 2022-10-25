import java.util.Scanner;
class P{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] l=new int[50];
        int r=0;
        for(int i=0;i<n;i++){
            l[i]=s.nextInt();
        }
        r=l[0];
        for(int i=1;i<n;i++){
            if(l[i]<r)
            r=l[i];
        }
        System.out.print(r);
    }
}