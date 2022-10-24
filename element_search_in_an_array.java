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
        int k=s.nextInt();
        for(int i=1;i<n;i++){
            if(l[i]==k){
                r=1;
                break;
            }
        }
        if(r==1)
        System.out.println("True");
        else
        System.out.println("False");
    }
}